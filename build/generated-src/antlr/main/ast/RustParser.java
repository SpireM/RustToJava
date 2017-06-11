// Generated from ast\Rust.g4 by ANTLR 4.7

    package rustless.ast;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RustParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, LT=19, RT=20, MINUS=21, PLUS=22, DIV=23, MULT=24, EQ=25, ID=26, 
		INT=27, FLOAT=28, STRING=29, WS=30;
	public static final int
		RULE_repl = 0, RULE_module = 1, RULE_function = 2, RULE_block = 3, RULE_instruction = 4, 
		RULE_assume = 5, RULE_declare = 6, RULE_declareAndInit = 7, RULE_arrayDeclareAndInit = 8, 
		RULE_type = 9, RULE_whileBlockIn = 10, RULE_ifBlockIn = 11, RULE_functionCall = 12, 
		RULE_macroCall = 13, RULE_argumentList = 14, RULE_argument = 15, RULE_argumentDeclarationList = 16, 
		RULE_argumentDeclaration = 17, RULE_exprCompare = 18, RULE_op = 19, RULE_expr = 20, 
		RULE_literal = 21;
	public static final String[] ruleNames = {
		"repl", "module", "function", "block", "instruction", "assume", "declare", 
		"declareAndInit", "arrayDeclareAndInit", "type", "whileBlockIn", "ifBlockIn", 
		"functionCall", "macroCall", "argumentList", "argument", "argumentDeclarationList", 
		"argumentDeclaration", "exprCompare", "op", "expr", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'quit'", "'fn'", "'('", "')'", "';'", "'{'", "'}'", "':'", "'['", 
		"'i32'", "']'", "'let mut'", "'boolean'", "'let'", "'while'", "'if'", 
		"'!'", "','", "'<'", "'>'", "'-'", "'+'", "'/'", "'*'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "LT", "RT", "MINUS", "PLUS", 
		"DIV", "MULT", "EQ", "ID", "INT", "FLOAT", "STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Rust.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RustParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReplContext extends ParserRuleContext {
		public double value;
		public ExprContext expr;
		public TerminalNode EOF() { return getToken(RustParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterRepl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitRepl(this);
		}
	}

	public final ReplContext repl() throws RecognitionException {
		ReplContext _localctx = new ReplContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_repl);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__0);
				setState(45);
				match(EOF);
				 System.exit(0); 
				}
				break;
			case T__2:
			case MINUS:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((ReplContext)_localctx).expr = expr(0);
				setState(48);
				match(EOF);
				 ((ReplContext)_localctx).value = ((ReplContext)_localctx).expr.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RustParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(53);
				function();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public ArgumentDeclarationListContext argumentDeclarationList() {
			return getRuleContext(ArgumentDeclarationListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__1);
			setState(62);
			match(ID);
			setState(63);
			match(T__2);
			setState(64);
			argumentDeclarationList();
			setState(65);
			match(T__3);
			setState(66);
			block();
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(67);
				match(T__4);
				}
				break;
			case EOF:
			case T__1:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(72);
				instruction();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(73);
					match(T__4);
					}
				}

				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public AssumeContext assume() {
			return getRuleContext(AssumeContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public DeclareAndInitContext declareAndInit() {
			return getRuleContext(DeclareAndInitContext.class,0);
		}
		public ArrayDeclareAndInitContext arrayDeclareAndInit() {
			return getRuleContext(ArrayDeclareAndInitContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public WhileBlockInContext whileBlockIn() {
			return getRuleContext(WhileBlockInContext.class,0);
		}
		public IfBlockInContext ifBlockIn() {
			return getRuleContext(IfBlockInContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				assume();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				declareAndInit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				arrayDeclareAndInit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				macroCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				whileBlockIn();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				ifBlockIn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssumeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assume; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterAssume(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitAssume(this);
		}
	}

	public final AssumeContext assume() throws RecognitionException {
		AssumeContext _localctx = new AssumeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(EQ);
			setState(95);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(98);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareAndInitContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareAndInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAndInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterDeclareAndInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitDeclareAndInit(this);
		}
	}

	public final DeclareAndInitContext declareAndInit() throws RecognitionException {
		DeclareAndInitContext _localctx = new DeclareAndInitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareAndInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			type();
			setState(101);
			match(ID);
			setState(102);
			match(EQ);
			setState(103);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclareAndInitContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayDeclareAndInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclareAndInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterArrayDeclareAndInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitArrayDeclareAndInit(this);
		}
	}

	public final ArrayDeclareAndInitContext arrayDeclareAndInit() throws RecognitionException {
		ArrayDeclareAndInitContext _localctx = new ArrayDeclareAndInitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayDeclareAndInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			match(ID);
			setState(107);
			match(T__7);
			setState(108);
			match(T__8);
			setState(109);
			match(T__9);
			setState(110);
			match(T__4);
			setState(111);
			expr(0);
			setState(112);
			match(T__10);
			setState(113);
			match(EQ);
			setState(114);
			match(T__8);
			setState(115);
			expr(0);
			setState(116);
			match(T__4);
			setState(117);
			expr(0);
			setState(118);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockInContext extends ParserRuleContext {
		public ExprCompareContext exprCompare() {
			return getRuleContext(ExprCompareContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlockIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterWhileBlockIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitWhileBlockIn(this);
		}
	}

	public final WhileBlockInContext whileBlockIn() throws RecognitionException {
		WhileBlockInContext _localctx = new WhileBlockInContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileBlockIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__14);
			setState(123);
			exprCompare();
			setState(124);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockInContext extends ParserRuleContext {
		public ExprCompareContext exprCompare() {
			return getRuleContext(ExprCompareContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlockIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterIfBlockIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitIfBlockIn(this);
		}
	}

	public final IfBlockInContext ifBlockIn() throws RecognitionException {
		IfBlockInContext _localctx = new IfBlockInContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifBlockIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__15);
			setState(127);
			exprCompare();
			setState(128);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
			match(T__2);
			setState(132);
			argumentList();
			setState(133);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MacroCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterMacroCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitMacroCall(this);
		}
	}

	public final MacroCallContext macroCall() throws RecognitionException {
		MacroCallContext _localctx = new MacroCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_macroCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(136);
			match(T__16);
			setState(137);
			match(T__2);
			setState(138);
			argumentList();
			setState(139);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument;
		public List<ArgumentContext> arg = new ArrayList<ArgumentContext>();
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argumentList);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
			case MINUS:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((ArgumentListContext)_localctx).argument = argument();
				((ArgumentListContext)_localctx).arg.add(((ArgumentListContext)_localctx).argument);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(143);
					match(T__17);
					setState(144);
					((ArgumentListContext)_localctx).argument = argument();
					((ArgumentListContext)_localctx).arg.add(((ArgumentListContext)_localctx).argument);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentDeclarationListContext extends ParserRuleContext {
		public ArgumentDeclarationContext argumentDeclaration;
		public List<ArgumentDeclarationContext> arg = new ArrayList<ArgumentDeclarationContext>();
		public List<ArgumentDeclarationContext> argumentDeclaration() {
			return getRuleContexts(ArgumentDeclarationContext.class);
		}
		public ArgumentDeclarationContext argumentDeclaration(int i) {
			return getRuleContext(ArgumentDeclarationContext.class,i);
		}
		public ArgumentDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterArgumentDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitArgumentDeclarationList(this);
		}
	}

	public final ArgumentDeclarationListContext argumentDeclarationList() throws RecognitionException {
		ArgumentDeclarationListContext _localctx = new ArgumentDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argumentDeclarationList);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((ArgumentDeclarationListContext)_localctx).argumentDeclaration = argumentDeclaration();
				((ArgumentDeclarationListContext)_localctx).arg.add(((ArgumentDeclarationListContext)_localctx).argumentDeclaration);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(156);
					match(T__17);
					setState(157);
					((ArgumentDeclarationListContext)_localctx).argumentDeclaration = argumentDeclaration();
					((ArgumentDeclarationListContext)_localctx).arg.add(((ArgumentDeclarationListContext)_localctx).argumentDeclaration);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public ArgumentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterArgumentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitArgumentDeclaration(this);
		}
	}

	public final ArgumentDeclarationContext argumentDeclaration() throws RecognitionException {
		ArgumentDeclarationContext _localctx = new ArgumentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCompareContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitExprCompare(this);
		}
	}

	public final ExprCompareContext exprCompare() throws RecognitionException {
		ExprCompareContext _localctx = new ExprCompareContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expr(0);
			setState(168);
			op();
			setState(169);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode RT() { return getToken(RustParser.RT, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==LT || _la==RT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public double value;
		public ExprContext a;
		public ExprContext expr;
		public LiteralContext literal;
		public ExprContext b;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public TerminalNode MULT() { return getToken(RustParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(RustParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(174);
				functionCall();
				 ((ExprContext)_localctx).value = Double.NaN; 
				}
				break;
			case 2:
				{
				setState(177);
				match(MINUS);
				setState(178);
				((ExprContext)_localctx).expr = expr(10);
				 ((ExprContext)_localctx).value = -((ExprContext)_localctx).expr.value; 
				}
				break;
			case 3:
				{
				setState(181);
				((ExprContext)_localctx).literal = literal();
				 ((ExprContext)_localctx).value = ((ExprContext)_localctx).literal.value; 
				}
				break;
			case 4:
				{
				setState(184);
				match(ID);
				 ((ExprContext)_localctx).value = Double.NaN; 
				}
				break;
			case 5:
				{
				setState(186);
				match(T__2);
				setState(187);
				((ExprContext)_localctx).expr = expr(0);
				setState(188);
				match(T__3);
				 ((ExprContext)_localctx).value = ((ExprContext)_localctx).expr.value; 
				}
				break;
			case 6:
				{
				setState(191);
				match(ID);
				setState(192);
				match(T__8);
				setState(193);
				((ExprContext)_localctx).expr = expr(0);
				setState(194);
				match(T__10);
				 ((ExprContext)_localctx).value = Double.NaN; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(200);
						match(MULT);
						setState(201);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).value = ((ExprContext)_localctx).a.value*((ExprContext)_localctx).b.value; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(205);
						match(DIV);
						setState(206);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).value = ((ExprContext)_localctx).a.value/((ExprContext)_localctx).b.value; 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(210);
						match(PLUS);
						setState(211);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).value = ((ExprContext)_localctx).a.value+((ExprContext)_localctx).b.value; 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(215);
						match(MINUS);
						setState(216);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).value = ((ExprContext)_localctx).a.value-((ExprContext)_localctx).b.value; 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220);
						match(EQ);
						setState(221);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(4);
						 ((ExprContext)_localctx).a.value = ((ExprContext)_localctx).b.value; 
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public double value;
		public TerminalNode FLOAT() { return getToken(RustParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(RustParser.INT, 0); }
		public TerminalNode STRING() { return getToken(RustParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(FLOAT);
				 ((LiteralContext)_localctx).value = Double.parseDouble(_input.getText(_localctx.start, _input.LT(-1))); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(INT);
				 ((LiteralContext)_localctx).value = Double.parseDouble(_input.getText(_localctx.start, _input.LT(-1))); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(STRING);
				 ((LiteralContext)_localctx).value = Double.NaN; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\66\n\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\5\5M\n\5\7\5O\n\5\f\5\16\5R\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7"+
		"\20\u0094\n\20\f\20\16\20\u0097\13\20\5\20\u0099\n\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\7\22\u00a1\n\22\f\22\16\22\u00a4\13\22\5\22\u00a6\n\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00c8\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00e3\n\26\f\26\16\26\u00e6\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00ee\n\27\3\27\2\3*\30\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,\2\4\4\2\16\20\34\34\3\2\25\26\2\u00f5\2\65"+
		"\3\2\2\2\4:\3\2\2\2\6?\3\2\2\2\bI\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16c\3"+
		"\2\2\2\20f\3\2\2\2\22k\3\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30\u0080\3\2\2"+
		"\2\32\u0084\3\2\2\2\34\u0089\3\2\2\2\36\u0098\3\2\2\2 \u009a\3\2\2\2\""+
		"\u00a5\3\2\2\2$\u00a7\3\2\2\2&\u00a9\3\2\2\2(\u00ad\3\2\2\2*\u00c7\3\2"+
		"\2\2,\u00ed\3\2\2\2./\7\3\2\2/\60\7\2\2\3\60\66\b\2\1\2\61\62\5*\26\2"+
		"\62\63\7\2\2\3\63\64\b\2\1\2\64\66\3\2\2\2\65.\3\2\2\2\65\61\3\2\2\2\66"+
		"\3\3\2\2\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2"+
		"\2\2<:\3\2\2\2=>\7\2\2\3>\5\3\2\2\2?@\7\4\2\2@A\7\34\2\2AB\7\5\2\2BC\5"+
		"\"\22\2CD\7\6\2\2DG\5\b\5\2EH\7\7\2\2FH\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\7"+
		"\3\2\2\2IP\7\b\2\2JL\5\n\6\2KM\7\7\2\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2N"+
		"J\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\t\2\2"+
		"T\t\3\2\2\2U^\5\f\7\2V^\5\16\b\2W^\5\20\t\2X^\5\22\n\2Y^\5\32\16\2Z^\5"+
		"\34\17\2[^\5\26\f\2\\^\5\30\r\2]U\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2"+
		"\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\13\3\2\2\2_`\7\34\2\2`a\7"+
		"\33\2\2ab\5*\26\2b\r\3\2\2\2cd\5\24\13\2de\7\34\2\2e\17\3\2\2\2fg\5\24"+
		"\13\2gh\7\34\2\2hi\7\33\2\2ij\5*\26\2j\21\3\2\2\2kl\5\24\13\2lm\7\34\2"+
		"\2mn\7\n\2\2no\7\13\2\2op\7\f\2\2pq\7\7\2\2qr\5*\26\2rs\7\r\2\2st\7\33"+
		"\2\2tu\7\13\2\2uv\5*\26\2vw\7\7\2\2wx\5*\26\2xy\7\r\2\2y\23\3\2\2\2z{"+
		"\t\2\2\2{\25\3\2\2\2|}\7\21\2\2}~\5&\24\2~\177\5\b\5\2\177\27\3\2\2\2"+
		"\u0080\u0081\7\22\2\2\u0081\u0082\5&\24\2\u0082\u0083\5\b\5\2\u0083\31"+
		"\3\2\2\2\u0084\u0085\7\34\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5\36\20"+
		"\2\u0087\u0088\7\6\2\2\u0088\33\3\2\2\2\u0089\u008a\7\34\2\2\u008a\u008b"+
		"\7\23\2\2\u008b\u008c\7\5\2\2\u008c\u008d\5\36\20\2\u008d\u008e\7\6\2"+
		"\2\u008e\35\3\2\2\2\u008f\u0099\3\2\2\2\u0090\u0095\5 \21\2\u0091\u0092"+
		"\7\24\2\2\u0092\u0094\5 \21\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0090\3\2\2\2\u0099\37\3\2\2\2\u009a"+
		"\u009b\5*\26\2\u009b!\3\2\2\2\u009c\u00a6\3\2\2\2\u009d\u00a2\5$\23\2"+
		"\u009e\u009f\7\24\2\2\u009f\u00a1\5$\23\2\u00a0\u009e\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a6#\3\2\2\2"+
		"\u00a7\u00a8\7\34\2\2\u00a8%\3\2\2\2\u00a9\u00aa\5*\26\2\u00aa\u00ab\5"+
		"(\25\2\u00ab\u00ac\5*\26\2\u00ac\'\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae)"+
		"\3\2\2\2\u00af\u00b0\b\26\1\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2\b\26\1"+
		"\2\u00b2\u00c8\3\2\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00b5\5*\26\f\u00b5"+
		"\u00b6\b\26\1\2\u00b6\u00c8\3\2\2\2\u00b7\u00b8\5,\27\2\u00b8\u00b9\b"+
		"\26\1\2\u00b9\u00c8\3\2\2\2\u00ba\u00bb\7\34\2\2\u00bb\u00c8\b\26\1\2"+
		"\u00bc\u00bd\7\5\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\7\6\2\2\u00bf\u00c0"+
		"\b\26\1\2\u00c0\u00c8\3\2\2\2\u00c1\u00c2\7\34\2\2\u00c2\u00c3\7\13\2"+
		"\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6\b\26\1\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00af\3\2\2\2\u00c7\u00b3\3\2\2\2\u00c7\u00b7\3\2"+
		"\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8"+
		"\u00e4\3\2\2\2\u00c9\u00ca\f\t\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc\5"+
		"*\26\n\u00cc\u00cd\b\26\1\2\u00cd\u00e3\3\2\2\2\u00ce\u00cf\f\b\2\2\u00cf"+
		"\u00d0\7\31\2\2\u00d0\u00d1\5*\26\t\u00d1\u00d2\b\26\1\2\u00d2\u00e3\3"+
		"\2\2\2\u00d3\u00d4\f\7\2\2\u00d4\u00d5\7\30\2\2\u00d5\u00d6\5*\26\b\u00d6"+
		"\u00d7\b\26\1\2\u00d7\u00e3\3\2\2\2\u00d8\u00d9\f\6\2\2\u00d9\u00da\7"+
		"\27\2\2\u00da\u00db\5*\26\7\u00db\u00dc\b\26\1\2\u00dc\u00e3\3\2\2\2\u00dd"+
		"\u00de\f\5\2\2\u00de\u00df\7\33\2\2\u00df\u00e0\5*\26\6\u00e0\u00e1\b"+
		"\26\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00c9\3\2\2\2\u00e2\u00ce\3\2\2\2\u00e2"+
		"\u00d3\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00e8\7\36\2\2\u00e8\u00ee\b\27\1\2\u00e9\u00ea\7\35\2"+
		"\2\u00ea\u00ee\b\27\1\2\u00eb\u00ec\7\37\2\2\u00ec\u00ee\b\27\1\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee-\3\2\2\2"+
		"\20\65:GLP]\u0095\u0098\u00a2\u00a5\u00c7\u00e2\u00e4\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}