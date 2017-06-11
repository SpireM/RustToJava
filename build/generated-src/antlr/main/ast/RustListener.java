// Generated from ast\Rust.g4 by ANTLR 4.7

    package rustless.ast;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RustParser}.
 */
public interface RustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RustParser#repl}.
	 * @param ctx the parse tree
	 */
	void enterRepl(RustParser.ReplContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#repl}.
	 * @param ctx the parse tree
	 */
	void exitRepl(RustParser.ReplContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(RustParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(RustParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(RustParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(RustParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RustParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RustParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(RustParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(RustParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#assume}.
	 * @param ctx the parse tree
	 */
	void enterAssume(RustParser.AssumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#assume}.
	 * @param ctx the parse tree
	 */
	void exitAssume(RustParser.AssumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(RustParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(RustParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#declareAndInit}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndInit(RustParser.DeclareAndInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#declareAndInit}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndInit(RustParser.DeclareAndInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#arrayDeclareAndInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclareAndInit(RustParser.ArrayDeclareAndInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#arrayDeclareAndInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclareAndInit(RustParser.ArrayDeclareAndInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RustParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RustParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#whileBlockIn}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlockIn(RustParser.WhileBlockInContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#whileBlockIn}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlockIn(RustParser.WhileBlockInContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ifBlockIn}.
	 * @param ctx the parse tree
	 */
	void enterIfBlockIn(RustParser.IfBlockInContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ifBlockIn}.
	 * @param ctx the parse tree
	 */
	void exitIfBlockIn(RustParser.IfBlockInContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(RustParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(RustParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#macroCall}.
	 * @param ctx the parse tree
	 */
	void enterMacroCall(RustParser.MacroCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#macroCall}.
	 * @param ctx the parse tree
	 */
	void exitMacroCall(RustParser.MacroCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(RustParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(RustParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(RustParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(RustParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#argumentDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDeclarationList(RustParser.ArgumentDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#argumentDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDeclarationList(RustParser.ArgumentDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#argumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDeclaration(RustParser.ArgumentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#argumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDeclaration(RustParser.ArgumentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#exprCompare}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(RustParser.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#exprCompare}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(RustParser.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(RustParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(RustParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RustParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RustParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RustParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RustParser.LiteralContext ctx);
}