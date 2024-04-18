// Generated from /Users/ambrose/Repos/flux_lang/parser/Variables.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Variables extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, TEXT_TYPE=2, BOOLEAN=3, BOOLEAN_TYPE=4, NUMBER=5, NUMBER_TYPE=6, 
		NULL=7, DIGIT=8, OCTET=9, IPV4=10, IPV4_TYPE=11, LOOP=12, IF=13, ELSE=14, 
		FUNC=15, RETURN=16, RETURN_TYPE=17, OP_ADD=18, OP_SUB=19, OP_MUL=20, OP_DIV=21, 
		OP_MOD=22, OP_POW=23, OP_EQ=24, OP_NEQ=25, OP_GT=26, OP_LT=27, OP_GTE=28, 
		OP_LTE=29, OP_AND=30, OP_OR=31, OP_NOT=32, OP_XOR=33, L_BLOCK=34, R_BLOCK=35, 
		L_PAREN=36, R_PAREN=37, L_SQUARE=38, R_SQUARE=39, COMMA=40, DOT=41, VAR_IDENTIFIER=42, 
		COMMON_IDENTIFIER=43, AT=44, NEWLINE=45, WS=46;
	public static final int
		RULE_var_type = 0, RULE_var_name = 1, RULE_var_value = 2, RULE_string_var_declaration = 3, 
		RULE_number_var_declaration = 4, RULE_boolean_var_declaration = 5, RULE_single_var_declaration = 6, 
		RULE_array_var_declaration = 7, RULE_var_assignment = 8, RULE_op_level1 = 9, 
		RULE_op_level2 = 10, RULE_op_level3 = 11, RULE_op_level4 = 12, RULE_op_level5 = 13, 
		RULE_numeric_expression = 14, RULE_logical_expression = 15, RULE_comparative_expression = 16, 
		RULE_math_expression = 17, RULE_get_array_element = 18, RULE_get_child = 19, 
		RULE_get_var = 20, RULE_function_call = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"var_type", "var_name", "var_value", "string_var_declaration", "number_var_declaration", 
			"boolean_var_declaration", "single_var_declaration", "array_var_declaration", 
			"var_assignment", "op_level1", "op_level2", "op_level3", "op_level4", 
			"op_level5", "numeric_expression", "logical_expression", "comparative_expression", 
			"math_expression", "get_array_element", "get_child", "get_var", "function_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'text'", null, "'bool'", null, "'num'", "'na'", null, null, 
			null, "'ipv4'", "'loop'", "'if'", "'else'", "'fun'", "'return'", "'->'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'and'", "'or'", "'not'", "'xor'", "'{'", "'}'", "'('", 
			"')'", "'['", "']'", "','", "'.'", null, null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "TEXT_TYPE", "BOOLEAN", "BOOLEAN_TYPE", "NUMBER", "NUMBER_TYPE", 
			"NULL", "DIGIT", "OCTET", "IPV4", "IPV4_TYPE", "LOOP", "IF", "ELSE", 
			"FUNC", "RETURN", "RETURN_TYPE", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", 
			"OP_MOD", "OP_POW", "OP_EQ", "OP_NEQ", "OP_GT", "OP_LT", "OP_GTE", "OP_LTE", 
			"OP_AND", "OP_OR", "OP_NOT", "OP_XOR", "L_BLOCK", "R_BLOCK", "L_PAREN", 
			"R_PAREN", "L_SQUARE", "R_SQUARE", "COMMA", "DOT", "VAR_IDENTIFIER", 
			"COMMON_IDENTIFIER", "AT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Variables.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Variables(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode TEXT_TYPE() { return getToken(Variables.TEXT_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(Variables.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(Variables.BOOLEAN_TYPE, 0); }
		public TerminalNode IPV4_TYPE() { return getToken(Variables.IPV4_TYPE, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2132L) != 0)) ) {
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
	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(Variables.VAR_IDENTIFIER, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(VAR_IDENTIFIER);
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
	public static class Var_valueContext extends ParserRuleContext {
		public TerminalNode IPV4() { return getToken(Variables.IPV4, 0); }
		public TerminalNode TEXT() { return getToken(Variables.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(Variables.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(Variables.BOOLEAN, 0); }
		public Var_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterVar_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitVar_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitVar_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_valueContext var_value() throws RecognitionException {
		Var_valueContext _localctx = new Var_valueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1066L) != 0)) ) {
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
	public static class String_var_declarationContext extends ParserRuleContext {
		public TerminalNode TEXT_TYPE() { return getToken(Variables.TEXT_TYPE, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(Variables.L_BLOCK, 0); }
		public TerminalNode TEXT() { return getToken(Variables.TEXT, 0); }
		public TerminalNode R_BLOCK() { return getToken(Variables.R_BLOCK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Variables.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Variables.NEWLINE, i);
		}
		public String_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterString_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitString_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitString_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_var_declarationContext string_var_declaration() throws RecognitionException {
		String_var_declarationContext _localctx = new String_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TEXT_TYPE);
			setState(51);
			var_name();
			setState(52);
			match(L_BLOCK);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(53);
				match(NEWLINE);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(TEXT);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(60);
				match(NEWLINE);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(R_BLOCK);
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
	public static class Number_var_declarationContext extends ParserRuleContext {
		public TerminalNode NUMBER_TYPE() { return getToken(Variables.NUMBER_TYPE, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(Variables.L_BLOCK, 0); }
		public TerminalNode NUMBER() { return getToken(Variables.NUMBER, 0); }
		public TerminalNode R_BLOCK() { return getToken(Variables.R_BLOCK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Variables.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Variables.NEWLINE, i);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Number_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterNumber_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitNumber_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitNumber_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_var_declarationContext number_var_declaration() throws RecognitionException {
		Number_var_declarationContext _localctx = new Number_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number_var_declaration);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(NUMBER_TYPE);
				setState(69);
				var_name();
				setState(70);
				match(L_BLOCK);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(71);
					match(NEWLINE);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(NUMBER);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(78);
					match(NEWLINE);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(R_BLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(NUMBER_TYPE);
				setState(87);
				var_name();
				setState(88);
				match(L_BLOCK);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(89);
					match(NEWLINE);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				math_expression();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(96);
					match(NEWLINE);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(R_BLOCK);
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
	public static class Boolean_var_declarationContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_TYPE() { return getToken(Variables.BOOLEAN_TYPE, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(Variables.L_BLOCK, 0); }
		public TerminalNode BOOLEAN() { return getToken(Variables.BOOLEAN, 0); }
		public TerminalNode R_BLOCK() { return getToken(Variables.R_BLOCK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Variables.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Variables.NEWLINE, i);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Comparative_expressionContext comparative_expression() {
			return getRuleContext(Comparative_expressionContext.class,0);
		}
		public Boolean_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterBoolean_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitBoolean_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitBoolean_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_var_declarationContext boolean_var_declaration() throws RecognitionException {
		Boolean_var_declarationContext _localctx = new Boolean_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boolean_var_declaration);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(BOOLEAN_TYPE);
				setState(107);
				var_name();
				setState(108);
				match(L_BLOCK);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(109);
					match(NEWLINE);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(BOOLEAN);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(116);
					match(NEWLINE);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(R_BLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(BOOLEAN_TYPE);
				setState(125);
				var_name();
				setState(126);
				match(L_BLOCK);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(127);
					match(NEWLINE);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				logical_expression(0);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(134);
					match(NEWLINE);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(R_BLOCK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(BOOLEAN_TYPE);
				setState(143);
				var_name();
				setState(144);
				match(L_BLOCK);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(145);
					match(NEWLINE);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				comparative_expression(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(152);
					match(NEWLINE);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(R_BLOCK);
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
	public static class Single_var_declarationContext extends ParserRuleContext {
		public String_var_declarationContext string_var_declaration() {
			return getRuleContext(String_var_declarationContext.class,0);
		}
		public Number_var_declarationContext number_var_declaration() {
			return getRuleContext(Number_var_declarationContext.class,0);
		}
		public Boolean_var_declarationContext boolean_var_declaration() {
			return getRuleContext(Boolean_var_declarationContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(Variables.L_BLOCK, 0); }
		public TerminalNode R_BLOCK() { return getToken(Variables.R_BLOCK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Variables.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Variables.NEWLINE, i);
		}
		public Single_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterSingle_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitSingle_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitSingle_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_var_declarationContext single_var_declaration() throws RecognitionException {
		Single_var_declarationContext _localctx = new Single_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_single_var_declaration);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				string_var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				number_var_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				boolean_var_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				var_type();
				setState(166);
				var_name();
				setState(167);
				match(L_BLOCK);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(168);
					match(NEWLINE);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(R_BLOCK);
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
	public static class Array_var_declarationContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(Variables.L_BLOCK, 0); }
		public List<Var_valueContext> var_value() {
			return getRuleContexts(Var_valueContext.class);
		}
		public Var_valueContext var_value(int i) {
			return getRuleContext(Var_valueContext.class,i);
		}
		public TerminalNode R_BLOCK() { return getToken(Variables.R_BLOCK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Variables.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Variables.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Variables.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Variables.COMMA, i);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public Array_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterArray_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitArray_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitArray_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_var_declarationContext array_var_declaration() throws RecognitionException {
		Array_var_declarationContext _localctx = new Array_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_var_declaration);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				var_type();
				setState(179);
				var_name();
				setState(180);
				match(L_BLOCK);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(181);
					match(NEWLINE);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				var_value();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(189);
						match(NEWLINE);
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(195);
					var_value();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(201);
					match(NEWLINE);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(R_BLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				var_type();
				setState(210);
				var_name();
				setState(211);
				match(L_BLOCK);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(212);
					match(NEWLINE);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				math_expression();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(219);
					match(COMMA);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(220);
						match(NEWLINE);
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(226);
					math_expression();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(NEWLINE);
				setState(233);
				match(R_BLOCK);
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
	public static class Var_assignmentContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(Variables.L_BLOCK, 0); }
		public Var_valueContext var_value() {
			return getRuleContext(Var_valueContext.class,0);
		}
		public TerminalNode R_BLOCK() { return getToken(Variables.R_BLOCK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Variables.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Variables.NEWLINE, i);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Var_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterVar_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitVar_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitVar_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignmentContext var_assignment() throws RecognitionException {
		Var_assignmentContext _localctx = new Var_assignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_assignment);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				var_name();
				setState(238);
				match(L_BLOCK);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(239);
					match(NEWLINE);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				var_value();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(246);
					match(NEWLINE);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(R_BLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				var_name();
				setState(255);
				match(L_BLOCK);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(256);
					match(NEWLINE);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				math_expression();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(263);
					match(NEWLINE);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(R_BLOCK);
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
	public static class Op_level1Context extends ParserRuleContext {
		public TerminalNode OP_MUL() { return getToken(Variables.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(Variables.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(Variables.OP_MOD, 0); }
		public TerminalNode OP_POW() { return getToken(Variables.OP_POW, 0); }
		public Op_level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterOp_level1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitOp_level1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitOp_level1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level1Context op_level1() throws RecognitionException {
		Op_level1Context _localctx = new Op_level1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
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
		public TerminalNode OP_ADD() { return getToken(Variables.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(Variables.OP_SUB, 0); }
		public Op_level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterOp_level2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitOp_level2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitOp_level2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level2Context op_level2() throws RecognitionException {
		Op_level2Context _localctx = new Op_level2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_level2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==OP_ADD || _la==OP_SUB) ) {
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
		public TerminalNode OP_AND() { return getToken(Variables.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(Variables.OP_OR, 0); }
		public TerminalNode OP_XOR() { return getToken(Variables.OP_XOR, 0); }
		public Op_level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterOp_level3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitOp_level3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitOp_level3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level3Context op_level3() throws RecognitionException {
		Op_level3Context _localctx = new Op_level3Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11811160064L) != 0)) ) {
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
		public TerminalNode OP_EQ() { return getToken(Variables.OP_EQ, 0); }
		public TerminalNode OP_NEQ() { return getToken(Variables.OP_NEQ, 0); }
		public TerminalNode OP_LT() { return getToken(Variables.OP_LT, 0); }
		public TerminalNode OP_GT() { return getToken(Variables.OP_GT, 0); }
		public TerminalNode OP_GTE() { return getToken(Variables.OP_GTE, 0); }
		public TerminalNode OP_LTE() { return getToken(Variables.OP_LTE, 0); }
		public Op_level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterOp_level4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitOp_level4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitOp_level4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level4Context op_level4() throws RecognitionException {
		Op_level4Context _localctx = new Op_level4Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_level4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
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
		public TerminalNode OP_NOT() { return getToken(Variables.OP_NOT, 0); }
		public Op_level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterOp_level5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitOp_level5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitOp_level5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_level5Context op_level5() throws RecognitionException {
		Op_level5Context _localctx = new Op_level5Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_level5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		public TerminalNode L_PAREN() { return getToken(Variables.L_PAREN, 0); }
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(Variables.R_PAREN, 0); }
		public TerminalNode NUMBER() { return getToken(Variables.NUMBER, 0); }
		public Get_varContext get_var() {
			return getRuleContext(Get_varContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode OP_SUB() { return getToken(Variables.OP_SUB, 0); }
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
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterNumeric_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitNumeric_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitNumeric_expression(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_numeric_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(284);
				match(L_PAREN);
				setState(285);
				numeric_expression(0);
				setState(286);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				setState(288);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(289);
				get_var();
				}
				break;
			case 4:
				{
				setState(290);
				function_call();
				}
				break;
			case 5:
				{
				setState(291);
				match(OP_SUB);
				setState(292);
				numeric_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(295);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(296);
						op_level1();
						setState(297);
						numeric_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(299);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(300);
						op_level2();
						setState(301);
						numeric_expression(6);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TerminalNode L_PAREN() { return getToken(Variables.L_PAREN, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(Variables.R_PAREN, 0); }
		public TerminalNode OP_NOT() { return getToken(Variables.OP_NOT, 0); }
		public TerminalNode BOOLEAN() { return getToken(Variables.BOOLEAN, 0); }
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
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitLogical_expression(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(309);
				match(L_PAREN);
				setState(310);
				logical_expression(0);
				setState(311);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				setState(313);
				match(OP_NOT);
				setState(314);
				logical_expression(4);
				}
				break;
			case 3:
				{
				setState(315);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(316);
				get_var();
				}
				break;
			case 5:
				{
				setState(317);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(320);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(321);
						op_level3();
						setState(322);
						logical_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(324);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(325);
						op_level4();
						setState(326);
						logical_expression(6);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public TerminalNode L_PAREN() { return getToken(Variables.L_PAREN, 0); }
		public Comparative_expressionContext comparative_expression() {
			return getRuleContext(Comparative_expressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(Variables.R_PAREN, 0); }
		public Comparative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterComparative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitComparative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitComparative_expression(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_comparative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(334);
				numeric_expression(0);
				setState(335);
				op_level4();
				setState(336);
				numeric_expression(0);
				}
				break;
			case 2:
				{
				setState(338);
				logical_expression(0);
				setState(339);
				op_level3();
				setState(340);
				logical_expression(0);
				}
				break;
			case 3:
				{
				setState(342);
				op_level5();
				setState(343);
				match(L_PAREN);
				setState(344);
				comparative_expression(0);
				setState(345);
				match(R_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Comparative_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparative_expression);
					setState(349);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(350);
					op_level3();
					setState(351);
					logical_expression(0);
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitMath_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_math_expression);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				get_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				numeric_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				logical_expression(0);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(Variables.VAR_IDENTIFIER, 0); }
		public TerminalNode L_SQUARE() { return getToken(Variables.L_SQUARE, 0); }
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public TerminalNode R_SQUARE() { return getToken(Variables.R_SQUARE, 0); }
		public Get_array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_array_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterGet_array_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitGet_array_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitGet_array_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_array_elementContext get_array_element() throws RecognitionException {
		Get_array_elementContext _localctx = new Get_array_elementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_get_array_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(VAR_IDENTIFIER);
			setState(364);
			match(L_SQUARE);
			setState(365);
			numeric_expression(0);
			setState(366);
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
		public List<TerminalNode> VAR_IDENTIFIER() { return getTokens(Variables.VAR_IDENTIFIER); }
		public TerminalNode VAR_IDENTIFIER(int i) {
			return getToken(Variables.VAR_IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(Variables.DOT, 0); }
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
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterGet_child(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitGet_child(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitGet_child(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_childContext get_child() throws RecognitionException {
		Get_childContext _localctx = new Get_childContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_get_child);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(VAR_IDENTIFIER);
				setState(369);
				match(DOT);
				setState(370);
				match(VAR_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(VAR_IDENTIFIER);
				setState(372);
				match(DOT);
				setState(373);
				get_array_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(VAR_IDENTIFIER);
				setState(375);
				match(DOT);
				setState(376);
				get_child();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				get_array_element();
				setState(378);
				match(DOT);
				setState(379);
				get_child();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				get_array_element();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(382);
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
	public static class Get_varContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(Variables.VAR_IDENTIFIER, 0); }
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
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterGet_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitGet_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitGet_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_varContext get_var() throws RecognitionException {
		Get_varContext _localctx = new Get_varContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_get_var);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(VAR_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				get_array_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(Variables.VAR_IDENTIFIER, 0); }
		public TerminalNode L_PAREN() { return getToken(Variables.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(Variables.R_PAREN, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Variables.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Variables.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariablesListener ) ((VariablesListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VariablesVisitor ) return ((VariablesVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(VAR_IDENTIFIER);
			setState(391);
			match(L_PAREN);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4471061479464L) != 0)) {
				{
				setState(392);
				math_expression();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(393);
					match(COMMA);
					setState(394);
					math_expression();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(402);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return numeric_expression_sempred((Numeric_expressionContext)_localctx, predIndex);
		case 15:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 16:
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
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean comparative_expression_sempred(Comparative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0195\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00037\b\u0003"+
		"\n\u0003\f\u0003:\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003>\b\u0003"+
		"\n\u0003\f\u0003A\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004P\b\u0004\n\u0004\f\u0004S\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004i\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0081\b\u0005"+
		"\n\u0005\f\u0005\u0084\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0088"+
		"\b\u0005\n\u0005\f\u0005\u008b\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0093\b\u0005\n\u0005"+
		"\f\u0005\u0096\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009a\b\u0005"+
		"\n\u0005\f\u0005\u009d\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a1"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00aa\b\u0006\n\u0006\f\u0006\u00ad\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00b1\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00b7\b\u0007\n\u0007\f\u0007\u00ba"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00bf\b\u0007"+
		"\n\u0007\f\u0007\u00c2\t\u0007\u0001\u0007\u0005\u0007\u00c5\b\u0007\n"+
		"\u0007\f\u0007\u00c8\t\u0007\u0001\u0007\u0005\u0007\u00cb\b\u0007\n\u0007"+
		"\f\u0007\u00ce\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00d6\b\u0007\n\u0007\f\u0007\u00d9"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00de\b\u0007"+
		"\n\u0007\f\u0007\u00e1\t\u0007\u0001\u0007\u0005\u0007\u00e4\b\u0007\n"+
		"\u0007\f\u0007\u00e7\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00ec\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00f1\b\b\n\b\f\b"+
		"\u00f4\t\b\u0001\b\u0001\b\u0005\b\u00f8\b\b\n\b\f\b\u00fb\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0102\b\b\n\b\f\b\u0105\t\b\u0001"+
		"\b\u0001\b\u0005\b\u0109\b\b\n\b\f\b\u010c\t\b\u0001\b\u0001\b\u0003\b"+
		"\u0110\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0126\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0130\b\u000e"+
		"\n\u000e\f\u000e\u0133\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u013f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0149"+
		"\b\u000f\n\u000f\f\u000f\u014c\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u015c\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0162\b\u0010\n\u0010\f\u0010\u0165\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u016a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0180"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0185\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u018c\b\u0015\n\u0015\f\u0015\u018f\t\u0015\u0003\u0015\u0191\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0003\u001c\u001e \u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0006\u0004\u0000\u0002\u0002\u0004\u0004\u0006\u0006"+
		"\u000b\u000b\u0004\u0000\u0001\u0001\u0003\u0003\u0005\u0005\n\n\u0001"+
		"\u0000\u0014\u0017\u0001\u0000\u0012\u0013\u0002\u0000\u001e\u001f!!\u0001"+
		"\u0000\u0018\u001d\u01b8\u0000,\u0001\u0000\u0000\u0000\u0002.\u0001\u0000"+
		"\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000"+
		"\bh\u0001\u0000\u0000\u0000\n\u00a0\u0001\u0000\u0000\u0000\f\u00b0\u0001"+
		"\u0000\u0000\u0000\u000e\u00eb\u0001\u0000\u0000\u0000\u0010\u010f\u0001"+
		"\u0000\u0000\u0000\u0012\u0111\u0001\u0000\u0000\u0000\u0014\u0113\u0001"+
		"\u0000\u0000\u0000\u0016\u0115\u0001\u0000\u0000\u0000\u0018\u0117\u0001"+
		"\u0000\u0000\u0000\u001a\u0119\u0001\u0000\u0000\u0000\u001c\u0125\u0001"+
		"\u0000\u0000\u0000\u001e\u013e\u0001\u0000\u0000\u0000 \u015b\u0001\u0000"+
		"\u0000\u0000\"\u0169\u0001\u0000\u0000\u0000$\u016b\u0001\u0000\u0000"+
		"\u0000&\u017f\u0001\u0000\u0000\u0000(\u0184\u0001\u0000\u0000\u0000*"+
		"\u0186\u0001\u0000\u0000\u0000,-\u0007\u0000\u0000\u0000-\u0001\u0001"+
		"\u0000\u0000\u0000./\u0005*\u0000\u0000/\u0003\u0001\u0000\u0000\u0000"+
		"01\u0007\u0001\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005\u0002"+
		"\u0000\u000034\u0003\u0002\u0001\u000048\u0005\"\u0000\u000057\u0005-"+
		"\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000;?\u0005\u0001\u0000\u0000<>\u0005-\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000BC\u0005#\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0006\u0000\u0000EF\u0003\u0002\u0001\u0000FJ\u0005\"\u0000\u0000GI\u0005"+
		"-\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MQ\u0005\u0005\u0000\u0000NP\u0005-\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000TU\u0005#\u0000\u0000Ui\u0001\u0000\u0000\u0000VW\u0005\u0006"+
		"\u0000\u0000WX\u0003\u0002\u0001\u0000X\\\u0005\"\u0000\u0000Y[\u0005"+
		"-\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_c\u0003\"\u0011\u0000`b\u0005-\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fg\u0005#\u0000\u0000gi\u0001\u0000\u0000\u0000hD\u0001\u0000"+
		"\u0000\u0000hV\u0001\u0000\u0000\u0000i\t\u0001\u0000\u0000\u0000jk\u0005"+
		"\u0004\u0000\u0000kl\u0003\u0002\u0001\u0000lp\u0005\"\u0000\u0000mo\u0005"+
		"-\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000sw\u0005\u0003\u0000\u0000tv\u0005-\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z{\u0005#\u0000\u0000{\u00a1\u0001\u0000\u0000\u0000|}\u0005"+
		"\u0004\u0000\u0000}~\u0003\u0002\u0001\u0000~\u0082\u0005\"\u0000\u0000"+
		"\u007f\u0081\u0005-\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0089\u0003\u001e\u000f\u0000\u0086"+
		"\u0088\u0005-\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005#\u0000\u0000\u008d\u00a1\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0003"+
		"\u0002\u0001\u0000\u0090\u0094\u0005\"\u0000\u0000\u0091\u0093\u0005-"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u009b\u0003 \u0010\u0000\u0098\u009a\u0005-\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005#\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0"+
		"j\u0001\u0000\u0000\u0000\u00a0|\u0001\u0000\u0000\u0000\u00a0\u008e\u0001"+
		"\u0000\u0000\u0000\u00a1\u000b\u0001\u0000\u0000\u0000\u00a2\u00b1\u0003"+
		"\u0006\u0003\u0000\u00a3\u00b1\u0003\b\u0004\u0000\u00a4\u00b1\u0003\n"+
		"\u0005\u0000\u00a5\u00a6\u0003\u0000\u0000\u0000\u00a6\u00a7\u0003\u0002"+
		"\u0001\u0000\u00a7\u00ab\u0005\"\u0000\u0000\u00a8\u00aa\u0005-\u0000"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005#\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a2\u0001\u0000\u0000\u0000\u00b0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a4\u0001\u0000\u0000\u0000\u00b0\u00a5\u0001\u0000\u0000\u0000"+
		"\u00b1\r\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0003\u0002\u0001\u0000\u00b4\u00b8\u0005\"\u0000\u0000\u00b5\u00b7"+
		"\u0005-\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00c6\u0003\u0004\u0002\u0000\u00bc\u00c0\u0005"+
		"(\u0000\u0000\u00bd\u00bf\u0005-\u0000\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\u0004\u0002"+
		"\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00cc\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0005-\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005#\u0000\u0000\u00d0"+
		"\u00ec\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0003\u0002\u0001\u0000\u00d3\u00d7\u0005\"\u0000\u0000\u00d4\u00d6"+
		"\u0005-\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00e5\u0003\"\u0011\u0000\u00db\u00df\u0005("+
		"\u0000\u0000\u00dc\u00de\u0005-\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\"\u0011\u0000"+
		"\u00e3\u00db\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005-\u0000\u0000\u00e9\u00ea\u0005#\u0000\u0000\u00ea\u00ec"+
		"\u0001\u0000\u0000\u0000\u00eb\u00b2\u0001\u0000\u0000\u0000\u00eb\u00d1"+
		"\u0001\u0000\u0000\u0000\u00ec\u000f\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0003\u0002\u0001\u0000\u00ee\u00f2\u0005\"\u0000\u0000\u00ef\u00f1\u0005"+
		"-\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f9\u0003\u0004\u0002\u0000\u00f6\u00f8\u0005-\u0000"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005#\u0000\u0000\u00fd\u0110\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0003\u0002\u0001\u0000\u00ff\u0103\u0005\"\u0000\u0000\u0100"+
		"\u0102\u0005-\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u010a\u0003\"\u0011\u0000\u0107\u0109\u0005"+
		"-\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005#\u0000\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u00ed\u0001\u0000\u0000\u0000\u010f\u00fe\u0001\u0000\u0000"+
		"\u0000\u0110\u0011\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0002\u0000"+
		"\u0000\u0112\u0013\u0001\u0000\u0000\u0000\u0113\u0114\u0007\u0003\u0000"+
		"\u0000\u0114\u0015\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0004\u0000"+
		"\u0000\u0116\u0017\u0001\u0000\u0000\u0000\u0117\u0118\u0007\u0005\u0000"+
		"\u0000\u0118\u0019\u0001\u0000\u0000\u0000\u0119\u011a\u0005 \u0000\u0000"+
		"\u011a\u001b\u0001\u0000\u0000\u0000\u011b\u011c\u0006\u000e\uffff\uffff"+
		"\u0000\u011c\u011d\u0005$\u0000\u0000\u011d\u011e\u0003\u001c\u000e\u0000"+
		"\u011e\u011f\u0005%\u0000\u0000\u011f\u0126\u0001\u0000\u0000\u0000\u0120"+
		"\u0126\u0005\u0005\u0000\u0000\u0121\u0126\u0003(\u0014\u0000\u0122\u0126"+
		"\u0003*\u0015\u0000\u0123\u0124\u0005\u0013\u0000\u0000\u0124\u0126\u0003"+
		"\u001c\u000e\u0001\u0125\u011b\u0001\u0000\u0000\u0000\u0125\u0120\u0001"+
		"\u0000\u0000\u0000\u0125\u0121\u0001\u0000\u0000\u0000\u0125\u0122\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0131\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\n\u0006\u0000\u0000\u0128\u0129\u0003\u0012"+
		"\t\u0000\u0129\u012a\u0003\u001c\u000e\u0007\u012a\u0130\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\n\u0005\u0000\u0000\u012c\u012d\u0003\u0014\n\u0000"+
		"\u012d\u012e\u0003\u001c\u000e\u0006\u012e\u0130\u0001\u0000\u0000\u0000"+
		"\u012f\u0127\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000"+
		"\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u001d\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0006\u000f\uffff\uffff"+
		"\u0000\u0135\u0136\u0005$\u0000\u0000\u0136\u0137\u0003\u001e\u000f\u0000"+
		"\u0137\u0138\u0005%\u0000\u0000\u0138\u013f\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0005 \u0000\u0000\u013a\u013f\u0003\u001e\u000f\u0004\u013b\u013f"+
		"\u0005\u0003\u0000\u0000\u013c\u013f\u0003(\u0014\u0000\u013d\u013f\u0003"+
		"*\u0015\u0000\u013e\u0134\u0001\u0000\u0000\u0000\u013e\u0139\u0001\u0000"+
		"\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u014a\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\n\u0006\u0000\u0000\u0141\u0142\u0003\u0016\u000b"+
		"\u0000\u0142\u0143\u0003\u001e\u000f\u0007\u0143\u0149\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\n\u0005\u0000\u0000\u0145\u0146\u0003\u0018\f\u0000"+
		"\u0146\u0147\u0003\u001e\u000f\u0006\u0147\u0149\u0001\u0000\u0000\u0000"+
		"\u0148\u0140\u0001\u0000\u0000\u0000\u0148\u0144\u0001\u0000\u0000\u0000"+
		"\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u001f\u0001\u0000\u0000\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014e\u0006\u0010\uffff\uffff"+
		"\u0000\u014e\u014f\u0003\u001c\u000e\u0000\u014f\u0150\u0003\u0018\f\u0000"+
		"\u0150\u0151\u0003\u001c\u000e\u0000\u0151\u015c\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0003\u001e\u000f\u0000\u0153\u0154\u0003\u0016\u000b\u0000"+
		"\u0154\u0155\u0003\u001e\u000f\u0000\u0155\u015c\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0003\u001a\r\u0000\u0157\u0158\u0005$\u0000\u0000\u0158"+
		"\u0159\u0003 \u0010\u0000\u0159\u015a\u0005%\u0000\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u014d\u0001\u0000\u0000\u0000\u015b\u0152\u0001"+
		"\u0000\u0000\u0000\u015b\u0156\u0001\u0000\u0000\u0000\u015c\u0163\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\n\u0002\u0000\u0000\u015e\u015f\u0003\u0016"+
		"\u000b\u0000\u015f\u0160\u0003\u001e\u000f\u0000\u0160\u0162\u0001\u0000"+
		"\u0000\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000"+
		"\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164!\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u016a\u0003(\u0014\u0000\u0167\u016a\u0003\u001c\u000e\u0000"+
		"\u0168\u016a\u0003\u001e\u000f\u0000\u0169\u0166\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u016a#\u0001\u0000\u0000\u0000\u016b\u016c\u0005*\u0000\u0000\u016c\u016d"+
		"\u0005&\u0000\u0000\u016d\u016e\u0003\u001c\u000e\u0000\u016e\u016f\u0005"+
		"\'\u0000\u0000\u016f%\u0001\u0000\u0000\u0000\u0170\u0171\u0005*\u0000"+
		"\u0000\u0171\u0172\u0005)\u0000\u0000\u0172\u0180\u0005*\u0000\u0000\u0173"+
		"\u0174\u0005*\u0000\u0000\u0174\u0175\u0005)\u0000\u0000\u0175\u0180\u0003"+
		"$\u0012\u0000\u0176\u0177\u0005*\u0000\u0000\u0177\u0178\u0005)\u0000"+
		"\u0000\u0178\u0180\u0003&\u0013\u0000\u0179\u017a\u0003$\u0012\u0000\u017a"+
		"\u017b\u0005)\u0000\u0000\u017b\u017c\u0003&\u0013\u0000\u017c\u0180\u0001"+
		"\u0000\u0000\u0000\u017d\u0180\u0003$\u0012\u0000\u017e\u0180\u0005*\u0000"+
		"\u0000\u017f\u0170\u0001\u0000\u0000\u0000\u017f\u0173\u0001\u0000\u0000"+
		"\u0000\u017f\u0176\u0001\u0000\u0000\u0000\u017f\u0179\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u0180\'\u0001\u0000\u0000\u0000\u0181\u0185\u0005*\u0000\u0000"+
		"\u0182\u0185\u0003$\u0012\u0000\u0183\u0185\u0003&\u0013\u0000\u0184\u0181"+
		"\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0183"+
		"\u0001\u0000\u0000\u0000\u0185)\u0001\u0000\u0000\u0000\u0186\u0187\u0005"+
		"*\u0000\u0000\u0187\u0190\u0005$\u0000\u0000\u0188\u018d\u0003\"\u0011"+
		"\u0000\u0189\u018a\u0005(\u0000\u0000\u018a\u018c\u0003\"\u0011\u0000"+
		"\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u0190\u0188\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0005%\u0000\u0000\u0193"+
		"+\u0001\u0000\u0000\u0000*8?JQ\\chpw\u0082\u0089\u0094\u009b\u00a0\u00ab"+
		"\u00b0\u00b8\u00c0\u00c6\u00cc\u00d7\u00df\u00e5\u00eb\u00f2\u00f9\u0103"+
		"\u010a\u010f\u0125\u012f\u0131\u013e\u0148\u014a\u015b\u0163\u0169\u017f"+
		"\u0184\u018d\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}