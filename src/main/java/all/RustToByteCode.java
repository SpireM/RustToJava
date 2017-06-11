package all;

import  rustless.ast.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.objectweb.asm.Opcodes.*;
import static org.objectweb.asm.Type.getDescriptor;
import static org.objectweb.asm.Type.getInternalName;


/**
 * Created by Vadim on 08.06.2017.
 */
public class RustToByteCode extends RustBaseListener {

    public ClassWriter classWriter;
    public String nameOfProgram;
    private Map<String, Variable> variables;
    private Stack<Label> ifStack;
    private Stack<Label> whileStack;
    private MethodVisitor mainVisitor;

    public RustToByteCode(){
        classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        variables = new HashMap<>();
        ifStack = new Stack<>();
        whileStack = new Stack<>();
    }


    private void makeAssigment(RustParser.AssumeContext ctx) {
        RustParser.ExprContext context = ctx.expr();
        parseArithmetic(context);
        Variable  variable = variables.get(ctx.ID().getText());
        mainVisitor.visitFieldInsn(PUTSTATIC, nameOfProgram, variable.byteName, variable.byteType);
    }


    private void makeAssigment(RustParser.DeclareAndInitContext ctx) {
        RustParser.ExprContext context = ctx.expr();
        parseArithmetic(context);
        Variable  variable = variables.get(ctx.ID().getText());
        mainVisitor.visitFieldInsn(PUTSTATIC, nameOfProgram, variable.byteName, variable.byteType);
    }


    private void parseArithmetic(RustParser.ExprContext context) {
        if(context.expr().size() > 1) {
            for (int i = 0; i < context.expr().size(); ++i) {
                parseEmb(context.expr(i));
            }
            if (context.PLUS() != null) {
                mainVisitor.visitInsn(IADD); // +
            } else if (context.MINUS() != null) {
                mainVisitor.visitInsn(ISUB); // +
            } else if (context.DIV() != null) {
                mainVisitor.visitInsn(IDIV); // /
            } else if (context.MULT() != null) {
                mainVisitor.visitInsn(IMUL);
            }
        }
        else{parseEmb(context);}
    }


    private void setJump(RustParser.ExprCompareContext operation, Label label) {
        if (operation.op().LT() != null) {
            mainVisitor.visitJumpInsn(IF_ICMPGE, label); // <
        } else if (operation.op().RT() != null) {
            mainVisitor.visitJumpInsn(IF_ICMPLE, label); // >
        }
    }

    private void parseEmb(RustParser.ExprContext context){
        if(context.expr == null && context.literal() == null){
            Variable  variable = variables.get(context.children.get(0).getText());
            mainVisitor.visitFieldInsn(GETSTATIC, nameOfProgram, variable.byteName, variable.byteType);
        }
        else if (context.PLUS() != null) {
            mainVisitor.visitInsn(IADD); // +
        }
        else if(context.DIV()!= null){
            mainVisitor.visitInsn(IDIV); // /
        }
        else if(context.value != Double.NaN) {
            double d = context.value;
            mainVisitor.visitLdcInsn((int)d);
        }
    }


    @Override
    public void enterModule(RustParser.ModuleContext ctx) {

        nameOfProgram = "Test";
        classWriter.visit(V1_5, ACC_PUBLIC, nameOfProgram, null, getInternalName(Object.class), null);

        MethodVisitor constructor = classWriter.visitMethod(
                ACC_PUBLIC,
                "<init>",
                "()V",
                null,
                null);
        constructor.visitVarInsn(ALOAD, 0);
        constructor.visitMethodInsn(INVOKESPECIAL, getInternalName(Object.class), "<init>", "()V");
        constructor.visitInsn(RETURN);
        constructor.visitMaxs(1, 1);
        constructor.visitEnd();

        mainVisitor = classWriter.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);

    }

    @Override
    public void exitModule(RustParser.ModuleContext ctx) {
        mainVisitor.visitInsn(RETURN);
        mainVisitor.visitMaxs(8, 8);
        mainVisitor.visitEnd();

        classWriter.visitEnd();
    }

    @Override
    public void enterDeclareAndInit(RustParser.DeclareAndInitContext ctx) {
        String type = "I" ;
            String fieldName = ctx.ID().getText();
            variables.put(fieldName, new Variable(fieldName, fieldName, type));
            classWriter.visitField(ACC_PUBLIC + ACC_STATIC,
                    fieldName,
                    type, null,
                    ctx.expr().literal().INT().getText()).visitEnd();

 }

    @Override
    public void exitDeclareAndInit(RustParser.DeclareAndInitContext ctx) {
        if (ctx.getParent() instanceof RustParser.InstructionContext) {
            makeAssigment(ctx);
        }
    }

    @Override
    public void enterDeclare(RustParser.DeclareContext ctx) {
        String type = "I" ;
        String fieldName = ctx.ID().getText();
        variables.put(fieldName, new Variable(fieldName, fieldName, type));
        classWriter.visitField(ACC_PUBLIC + ACC_STATIC,
                fieldName,
                type, null,
                null).visitEnd();
    }


    @Override
    public void enterAssume(RustParser.AssumeContext ctx) {
        if (ctx.getParent() instanceof RustParser.InstructionContext) {
            makeAssigment(ctx);
        }
    }

    @Override
    public void enterArrayDeclareAndInit(RustParser.ArrayDeclareAndInitContext ctx) {
        String type = "[I";
        String fieldName = ctx.ID().getText();
        variables.put(fieldName, new Variable(fieldName, fieldName, type));
        classWriter.visitField(ACC_PUBLIC + ACC_STATIC, fieldName, type, null, null).visitEnd();

    }

    @Override
    public void enterWhileBlockIn(RustParser.WhileBlockInContext ctx) {
        RustParser.ExprCompareContext context = ctx.exprCompare();
        Label labelBefore = new Label();
        mainVisitor.visitLabel(labelBefore);
        context.expr().forEach(this::parseArithmetic);
        Label labelAfter = new Label();
        whileStack.push(labelAfter);
        whileStack.push(labelBefore);
        setJump(context, labelAfter);
    }

    @Override
    public void exitWhileBlockIn(RustParser.WhileBlockInContext ctx) {
        mainVisitor.visitJumpInsn(GOTO, whileStack.pop());
        mainVisitor.visitLabel(whileStack.pop());
    }

    @Override
    public void enterIfBlockIn(RustParser.IfBlockInContext ctx) {
        RustParser.ExprCompareContext context = ctx.exprCompare();
        for( int i =0; i < context.expr().size(); ++i){
            parseArithmetic(context.expr(i));
        }
        Label label = new Label();
        ifStack.push(label);
        setJump(context, label);
    }

    @Override
    public void exitIfBlockIn(RustParser.IfBlockInContext ctx) {
        mainVisitor.visitLabel(ifStack.pop());
    }

    @Override
    public void enterMacroCall(RustParser.MacroCallContext ctx) {
        mainVisitor.visitFieldInsn(GETSTATIC, getInternalName(System.class), "out", getDescriptor(PrintStream.class));
        for(int i =0; i < ctx.argumentList().argument().size(); i++){
            parseEmb(ctx.argumentList().argument(i).expr());
        }
        mainVisitor.visitMethodInsn(INVOKEVIRTUAL, getInternalName(PrintStream.class), "println", "(I)V", false);

    }
}
