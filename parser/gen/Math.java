// Generated from /Users/ambrose/Repos/flux_lang/parser/Math.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Math extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, TEXT_TYPE=2, BOOLEAN=3, BOOLEAN_TYPE=4, NUMBER=5, NUMBER_TYPE=6, 
		NULL=7, DIGIT=8, OCTET=9, IPV4=10, IPV4_TYPE=11, LOOP=12, IF=13, ELSE=14, 
		FUNC=15, RETURN=16, RETURN_TYPE=17, L_BLOCK=18, R_BLOCK=19, L_PAREN=20, 
		R_PAREN=21, L_SQUARE=22, R_SQUARE=23, DOT=24, COLON=25, SEMICOLON=26, 
		COMMA=27, AT=28, OP_PLUS=29, OP_MINUS=30, OP_MULTIPLY=31, OP_DIVIDE=32, 
		OP_MOD=33, OP_POWER=34, OP_EQUAL=35, OP_NOT_EQUAL=36, OP_LESS=37, OP_GREATER=38, 
		OP_LESS_EQUAL=39, OP_GREATER_EQUAL=40, OP_AND=41, OP_OR=42, OP_XOR=43, 
		OP_NOT=44, OP_INCREMENT=45, OP_DECREMENT=46, VAR_IDENTIFIER=47, COMMON_IDENTIFIER=48, 
		NEWLINE=49, WS=50;
	public static final int
		RULE_op_level1 = 0, RULE_op_level2 = 1, RULE_op_level3 = 2, RULE_op_level4 = 3, 
		RULE_op_level5 = 4, RULE_numeric_expression = 5, RULE_text_expression = 6, 
		RULE_logical_expression = 7, RULE_comparative_expression = 8, RULE_get_var = 9, 
		RULE_math_expression = 10, RULE_get_array_element = 11, RULE_get_child = 12, 
		RULE_function_call = 13, RULE_args = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"op_level1", "op_level2", "op_level3", "op_level4", "op_level5", "numeric_expression", 
			"text_expression", "logical_expression", "comparative_expression", "get_var", 
			"math_expression", "get_array_element", "get_child", "function_call", 
			"args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'text'", null, "'boolean'", null, "'num'", "'na'", null, 
			null, null, "'ipv4'", "'loop'", "'if'", "'else'", "'fun'", "'return'", 
			"'->'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'.'", "':'", "';'", 
			"','", "'@'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'xor'", "'not'", "'++'", 
			"'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "TEXT_TYPE", "BOOLEAN", "BOOLEAN_TYPE", "NUMBER", "NUMBER_TYPE", 
			"NULL", "DIGIT", "OCTET", "IPV4", "IPV4_TYPE", "LOOP", "IF", "ELSE", 
			"FUNC", "RETURN", "RETURN_TYPE", "L_BLOCK", "R_BLOCK", "L_PAREN", "R_PAREN", 
			"L_SQUARE", "R_SQUARE", "DOT", "COLON", "SEMICOLON", "COMMA", "AT", "OP_PLUS", 
			"OP_MINUS", "OP_MULTIPLY", "OP_DIVIDE", "OP_MOD", "OP_POWER", "OP_EQUAL", 
			"OP_NOT_EQUAL", "OP_LESS", "OP_GREATER", "OP_LESS_EQUAL", "OP_GREATER_EQUAL", 
			"OP_AND", "OP_OR", "OP_XOR", "OP_NOT", "OP_INCREMENT", "OP_DECREMENT", 
			"VAR_IDENTIFIER", "COMMON_IDENTIFIER", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Math.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Math(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_level1Context extends ParserRuleContext {
		public TerminalNode OP_MULTIPLY() { return getToken(Math.OP_MULTIPLY, 0); }
		public TerminalNode OP_DIVIDE() { return getToken(Math.OP_DIVIDE, 0); }
		public TerminalNode OP_MOD() { return getToken(Math.OP_MOD, 0); }
		public TerminalNode OP_POWER() { return getToken(Math.OP_POWER, 0); }
		public Op_level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterOp_level1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitOp_level1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitOp_level1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level1Context op_level1() throws RecognitionException {
		Op_level1Context _localctx = new Op_level1Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_op_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_level2Context extends ParserRuleContext {
		public TerminalNode OP_PLUS() { return getToken(Math.OP_PLUS, 0); }
		public TerminalNode OP_MINUS() { return getToken(Math.OP_MINUS, 0); }
		public Op_level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterOp_level2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitOp_level2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitOp_level2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level2Context op_level2() throws RecognitionException {
		Op_level2Context _localctx = new Op_level2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_op_level2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==OP_PLUS || _la==OP_MINUS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_level3Context extends ParserRuleContext {
		public TerminalNode OP_AND() { return getToken(Math.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(Math.OP_OR, 0); }
		public TerminalNode OP_XOR() { return getToken(Math.OP_XOR, 0); }
		public Op_level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterOp_level3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitOp_level3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitOp_level3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level3Context op_level3() throws RecognitionException {
		Op_level3Context _localctx = new Op_level3Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_op_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_level4Context extends ParserRuleContext {
		public TerminalNode OP_EQUAL() { return getToken(Math.OP_EQUAL, 0); }
		public TerminalNode OP_NOT_EQUAL() { return getToken(Math.OP_NOT_EQUAL, 0); }
		public TerminalNode OP_LESS() { return getToken(Math.OP_LESS, 0); }
		public TerminalNode OP_LESS_EQUAL() { return getToken(Math.OP_LESS_EQUAL, 0); }
		public TerminalNode OP_GREATER() { return getToken(Math.OP_GREATER, 0); }
		public TerminalNode OP_GREATER_EQUAL() { return getToken(Math.OP_GREATER_EQUAL, 0); }
		public Op_level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterOp_level4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitOp_level4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitOp_level4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level4Context op_level4() throws RecognitionException {
		Op_level4Context _localctx = new Op_level4Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_op_level4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_level5Context extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(Math.OP_NOT, 0); }
		public Op_level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterOp_level5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitOp_level5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitOp_level5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level5Context op_level5() throws RecognitionException {
		Op_level5Context _localctx = new Op_level5Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_op_level5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(OP_NOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_expressionContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(Math.L_PAREN, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(Math.R_PAREN, 0); }
		public TerminalNode NUMBER() { return getToken(Math.NUMBER, 0); }
		public Get_varContext get_var() {
			return getRuleContext(Get_varContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode OP_MINUS() { return getToken(Math.OP_MINUS, 0); }
		public Op_level1Context op_level1() {
			return getRuleContext(Op_level1Context.class,0);
		}
		public Op_level2Context op_level2() {
			return getRuleContext(Op_level2Context.class,0);
		}
		public Numeric_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterNumeric_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitNumeric_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitNumeric_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		return numeric_expression(0);
	}

	private Numeric_expressionContext numeric_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, _parentState);
		Numeric_expressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_numeric_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(41);
				match(L_PAREN);
				setState(42);
				numeric_expression(0);
				setState(43);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				setState(45);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(46);
				get_var();
				}
				break;
			case 4:
				{
				setState(47);
				function_call();
				}
				break;
			case 5:
				{
				setState(48);
				match(OP_MINUS);
				setState(49);
				numeric_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(52);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(53);
						op_level1();
						setState(54);
						numeric_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						op_level2();
						setState(58);
						numeric_expression(6);
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Text_expressionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(Math.TEXT, 0); }
		public Get_varContext get_var() {
			return getRuleContext(Get_varContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<Text_expressionContext> text_expression() {
			return getRuleContexts(Text_expressionContext.class);
		}
		public Text_expressionContext text_expression(int i) {
			return getRuleContext(Text_expressionContext.class,i);
		}
		public TerminalNode OP_PLUS() { return getToken(Math.OP_PLUS, 0); }
		public Text_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterText_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitText_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitText_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_expressionContext text_expression() throws RecognitionException {
		return text_expression(0);
	}

	private Text_expressionContext text_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Text_expressionContext _localctx = new Text_expressionContext(_ctx, _parentState);
		Text_expressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_text_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(66);
				match(TEXT);
				}
				break;
			case 2:
				{
				setState(67);
				get_var();
				}
				break;
			case 3:
				{
				setState(68);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Text_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_text_expression);
					setState(71);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(72);
					match(OP_PLUS);
					setState(73);
					text_expression(5);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_expressionContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(Math.L_PAREN, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(Math.R_PAREN, 0); }
		public TerminalNode OP_NOT() { return getToken(Math.OP_NOT, 0); }
		public TerminalNode BOOLEAN() { return getToken(Math.BOOLEAN, 0); }
		public Get_varContext get_var() {
			return getRuleContext(Get_varContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Op_level3Context op_level3() {
			return getRuleContext(Op_level3Context.class,0);
		}
		public Op_level4Context op_level4() {
			return getRuleContext(Op_level4Context.class,0);
		}
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				match(L_PAREN);
				setState(81);
				logical_expression(0);
				setState(82);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				setState(84);
				match(OP_NOT);
				setState(85);
				logical_expression(4);
				}
				break;
			case 3:
				{
				setState(86);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(87);
				get_var();
				}
				break;
			case 5:
				{
				setState(88);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						op_level3();
						setState(93);
						logical_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(95);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(96);
						op_level4();
						setState(97);
						logical_expression(6);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comparative_expressionContext extends ParserRuleContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public Op_level4Context op_level4() {
			return getRuleContext(Op_level4Context.class,0);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public Op_level3Context op_level3() {
			return getRuleContext(Op_level3Context.class,0);
		}
		public Op_level5Context op_level5() {
			return getRuleContext(Op_level5Context.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(Math.L_PAREN, 0); }
		public Comparative_expressionContext comparative_expression() {
			return getRuleContext(Comparative_expressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(Math.R_PAREN, 0); }
		public Comparative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterComparative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitComparative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitComparative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_expressionContext comparative_expression() throws RecognitionException {
		return comparative_expression(0);
	}

	private Comparative_expressionContext comparative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comparative_expressionContext _localctx = new Comparative_expressionContext(_ctx, _parentState);
		Comparative_expressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_comparative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(105);
				numeric_expression(0);
				setState(106);
				op_level4();
				setState(107);
				numeric_expression(0);
				}
				break;
			case 2:
				{
				setState(109);
				logical_expression(0);
				setState(110);
				op_level3();
				setState(111);
				logical_expression(0);
				}
				break;
			case 3:
				{
				setState(113);
				op_level5();
				setState(114);
				match(L_PAREN);
				setState(115);
				comparative_expression(0);
				setState(116);
				match(R_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Comparative_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparative_expression);
					setState(120);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(121);
					op_level3();
					setState(122);
					logical_expression(0);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Get_varContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(Math.VAR_IDENTIFIER, 0); }
		public Get_array_elementContext get_array_element() {
			return getRuleContext(Get_array_elementContext.class,0);
		}
		public Get_childContext get_child() {
			return getRuleContext(Get_childContext.class,0);
		}
		public Get_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterGet_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitGet_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitGet_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_varContext get_var() throws RecognitionException {
		Get_varContext _localctx = new Get_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_get_var);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(VAR_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				get_array_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				get_child();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_expressionContext extends ParserRuleContext {
		public Get_varContext get_var() {
			return getRuleContext(Get_varContext.class,0);
		}
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Text_expressionContext text_expression() {
			return getRuleContext(Text_expressionContext.class,0);
		}
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitMath_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math_expression);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				get_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				numeric_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				logical_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				text_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Get_array_elementContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(Math.VAR_IDENTIFIER, 0); }
		public TerminalNode L_SQUARE() { return getToken(Math.L_SQUARE, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public TerminalNode R_SQUARE() { return getToken(Math.R_SQUARE, 0); }
		public Get_array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_array_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterGet_array_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitGet_array_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitGet_array_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_array_elementContext get_array_element() throws RecognitionException {
		Get_array_elementContext _localctx = new Get_array_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_get_array_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(VAR_IDENTIFIER);
			setState(141);
			match(L_SQUARE);
			setState(142);
			numeric_expression(0);
			setState(143);
			match(R_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Get_childContext extends ParserRuleContext {
		public List<TerminalNode> VAR_IDENTIFIER() { return getTokens(Math.VAR_IDENTIFIER); }
		public TerminalNode VAR_IDENTIFIER(int i) {
			return getToken(Math.VAR_IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(Math.DOT, 0); }
		public Get_array_elementContext get_array_element() {
			return getRuleContext(Get_array_elementContext.class,0);
		}
		public Get_childContext get_child() {
			return getRuleContext(Get_childContext.class,0);
		}
		public Get_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterGet_child(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitGet_child(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitGet_child(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_childContext get_child() throws RecognitionException {
		Get_childContext _localctx = new Get_childContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_get_child);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(VAR_IDENTIFIER);
				setState(146);
				match(DOT);
				setState(147);
				match(VAR_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(VAR_IDENTIFIER);
				setState(149);
				match(DOT);
				setState(150);
				get_array_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(VAR_IDENTIFIER);
				setState(152);
				match(DOT);
				setState(153);
				get_child();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				get_array_element();
				setState(155);
				match(DOT);
				setState(156);
				get_child();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				get_array_element();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(VAR_IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(Math.VAR_IDENTIFIER, 0); }
		public TerminalNode L_PAREN() { return getToken(Math.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(Math.R_PAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(VAR_IDENTIFIER);
			setState(163);
			match(L_PAREN);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_IDENTIFIER) {
				{
				setState(164);
				args();
				}
			}

			setState(167);
			match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(Math.VAR_IDENTIFIER, 0); }
		public TerminalNode L_PAREN() { return getToken(Math.L_PAREN, 0); }
		public List<Get_varContext> get_var() {
			return getRuleContexts(Get_varContext.class);
		}
		public Get_varContext get_var(int i) {
			return getRuleContext(Get_varContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(Math.R_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Math.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Math.COMMA, i);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(VAR_IDENTIFIER);
				setState(170);
				match(L_PAREN);
				setState(171);
				get_var();
				setState(172);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(VAR_IDENTIFIER);
				setState(175);
				match(L_PAREN);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR_IDENTIFIER) {
					{
					setState(176);
					get_var();
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(177);
						match(COMMA);
						setState(178);
						get_var();
						}
						}
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(186);
				match(R_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(VAR_IDENTIFIER);
				setState(188);
				match(L_PAREN);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 158330749190186L) != 0)) {
					{
					setState(189);
					math_expression();
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(190);
						match(COMMA);
						setState(191);
						math_expression();
						}
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(199);
				match(R_PAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return numeric_expression_sempred((Numeric_expressionContext)_localctx, predIndex);
		case 6:
			return text_expression_sempred((Text_expressionContext)_localctx, predIndex);
		case 7:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 8:
			return comparative_expression_sempred((Comparative_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numeric_expression_sempred(Numeric_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean text_expression_sempred(Text_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean comparative_expression_sempred(Comparative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u00053\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005=\b\u0005"+
		"\n\u0005\f\u0005@\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006F\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"K\b\u0006\n\u0006\f\u0006N\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007Z\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"d\b\u0007\n\u0007\f\u0007g\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bw\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b}\b\b\n\b\f\b\u0080"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0003\t\u0085\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u008b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a1"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00a6\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b4\b\u000e\n\u000e"+
		"\f\u000e\u00b7\t\u000e\u0003\u000e\u00b9\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c1\b\u000e"+
		"\n\u000e\f\u000e\u00c4\t\u000e\u0003\u000e\u00c6\b\u000e\u0001\u000e\u0003"+
		"\u000e\u00c9\b\u000e\u0001\u000e\u0000\u0004\n\f\u000e\u0010\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0004\u0001\u0000\u001f\"\u0001\u0000\u001d\u001e\u0001\u0000)"+
		"+\u0001\u0000#(\u00de\u0000\u001e\u0001\u0000\u0000\u0000\u0002 \u0001"+
		"\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006$\u0001\u0000"+
		"\u0000\u0000\b&\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\fE"+
		"\u0001\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010v\u0001\u0000"+
		"\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000"+
		"\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000"+
		"\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f\u0001\u0001\u0000"+
		"\u0000\u0000 !\u0007\u0001\u0000\u0000!\u0003\u0001\u0000\u0000\u0000"+
		"\"#\u0007\u0002\u0000\u0000#\u0005\u0001\u0000\u0000\u0000$%\u0007\u0003"+
		"\u0000\u0000%\u0007\u0001\u0000\u0000\u0000&\'\u0005,\u0000\u0000\'\t"+
		"\u0001\u0000\u0000\u0000()\u0006\u0005\uffff\uffff\u0000)*\u0005\u0014"+
		"\u0000\u0000*+\u0003\n\u0005\u0000+,\u0005\u0015\u0000\u0000,3\u0001\u0000"+
		"\u0000\u0000-3\u0005\u0005\u0000\u0000.3\u0003\u0012\t\u0000/3\u0003\u001a"+
		"\r\u000001\u0005\u001e\u0000\u000013\u0003\n\u0005\u00012(\u0001\u0000"+
		"\u0000\u00002-\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u00003>\u0001\u0000\u0000\u0000"+
		"45\n\u0006\u0000\u000056\u0003\u0000\u0000\u000067\u0003\n\u0005\u0007"+
		"7=\u0001\u0000\u0000\u000089\n\u0005\u0000\u00009:\u0003\u0002\u0001\u0000"+
		":;\u0003\n\u0005\u0006;=\u0001\u0000\u0000\u0000<4\u0001\u0000\u0000\u0000"+
		"<8\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AB\u0006\u0006\uffff\uffff\u0000BF\u0005\u0001\u0000"+
		"\u0000CF\u0003\u0012\t\u0000DF\u0003\u001a\r\u0000EA\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FL\u0001\u0000"+
		"\u0000\u0000GH\n\u0004\u0000\u0000HI\u0005\u001d\u0000\u0000IK\u0003\f"+
		"\u0006\u0005JG\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\r\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0006\u0007\uffff\uffff\u0000PQ\u0005\u0014"+
		"\u0000\u0000QR\u0003\u000e\u0007\u0000RS\u0005\u0015\u0000\u0000SZ\u0001"+
		"\u0000\u0000\u0000TU\u0005,\u0000\u0000UZ\u0003\u000e\u0007\u0004VZ\u0005"+
		"\u0003\u0000\u0000WZ\u0003\u0012\t\u0000XZ\u0003\u001a\r\u0000YO\u0001"+
		"\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Ze\u0001\u0000\u0000"+
		"\u0000[\\\n\u0006\u0000\u0000\\]\u0003\u0004\u0002\u0000]^\u0003\u000e"+
		"\u0007\u0007^d\u0001\u0000\u0000\u0000_`\n\u0005\u0000\u0000`a\u0003\u0006"+
		"\u0003\u0000ab\u0003\u000e\u0007\u0006bd\u0001\u0000\u0000\u0000c[\u0001"+
		"\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000f\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0006\b\uffff\uffff\u0000ij\u0003"+
		"\n\u0005\u0000jk\u0003\u0006\u0003\u0000kl\u0003\n\u0005\u0000lw\u0001"+
		"\u0000\u0000\u0000mn\u0003\u000e\u0007\u0000no\u0003\u0004\u0002\u0000"+
		"op\u0003\u000e\u0007\u0000pw\u0001\u0000\u0000\u0000qr\u0003\b\u0004\u0000"+
		"rs\u0005\u0014\u0000\u0000st\u0003\u0010\b\u0000tu\u0005\u0015\u0000\u0000"+
		"uw\u0001\u0000\u0000\u0000vh\u0001\u0000\u0000\u0000vm\u0001\u0000\u0000"+
		"\u0000vq\u0001\u0000\u0000\u0000w~\u0001\u0000\u0000\u0000xy\n\u0002\u0000"+
		"\u0000yz\u0003\u0004\u0002\u0000z{\u0003\u000e\u0007\u0000{}\u0001\u0000"+
		"\u0000\u0000|x\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0011"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0085\u0005"+
		"/\u0000\u0000\u0082\u0085\u0003\u0016\u000b\u0000\u0083\u0085\u0003\u0018"+
		"\f\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0013\u0001\u0000\u0000"+
		"\u0000\u0086\u008b\u0003\u0012\t\u0000\u0087\u008b\u0003\n\u0005\u0000"+
		"\u0088\u008b\u0003\u000e\u0007\u0000\u0089\u008b\u0003\f\u0006\u0000\u008a"+
		"\u0086\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u0015\u0001\u0000\u0000\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u008e"+
		"\u0005\u0016\u0000\u0000\u008e\u008f\u0003\n\u0005\u0000\u008f\u0090\u0005"+
		"\u0017\u0000\u0000\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"/\u0000\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u00a1\u0005/\u0000"+
		"\u0000\u0094\u0095\u0005/\u0000\u0000\u0095\u0096\u0005\u0018\u0000\u0000"+
		"\u0096\u00a1\u0003\u0016\u000b\u0000\u0097\u0098\u0005/\u0000\u0000\u0098"+
		"\u0099\u0005\u0018\u0000\u0000\u0099\u00a1\u0003\u0018\f\u0000\u009a\u009b"+
		"\u0003\u0016\u000b\u0000\u009b\u009c\u0005\u0018\u0000\u0000\u009c\u009d"+
		"\u0003\u0018\f\u0000\u009d\u00a1\u0001\u0000\u0000\u0000\u009e\u00a1\u0003"+
		"\u0016\u000b\u0000\u009f\u00a1\u0005/\u0000\u0000\u00a0\u0091\u0001\u0000"+
		"\u0000\u0000\u00a0\u0094\u0001\u0000\u0000\u0000\u00a0\u0097\u0001\u0000"+
		"\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u0019\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005/\u0000\u0000\u00a3\u00a5\u0005\u0014\u0000"+
		"\u0000\u00a4\u00a6\u0003\u001c\u000e\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0015\u0000\u0000\u00a8\u001b\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005/\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000"+
		"\u00ab\u00ac\u0003\u0012\t\u0000\u00ac\u00ad\u0005\u0015\u0000\u0000\u00ad"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af\u00b8"+
		"\u0005\u0014\u0000\u0000\u00b0\u00b5\u0003\u0012\t\u0000\u00b1\u00b2\u0005"+
		"\u001b\u0000\u0000\u00b2\u00b4\u0003\u0012\t\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00c9\u0005\u0015\u0000\u0000\u00bb\u00bc\u0005/\u0000"+
		"\u0000\u00bc\u00c5\u0005\u0014\u0000\u0000\u00bd\u00c2\u0003\u0014\n\u0000"+
		"\u00be\u00bf\u0005\u001b\u0000\u0000\u00bf\u00c1\u0003\u0014\n\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\u0015\u0000\u0000\u00c8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00c8\u00ae\u0001\u0000\u0000\u0000\u00c8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c9\u001d\u0001\u0000\u0000\u0000\u0013"+
		"2<>ELYcev~\u0084\u008a\u00a0\u00a5\u00b5\u00b8\u00c2\u00c5\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}