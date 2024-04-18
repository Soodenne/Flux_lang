// Generated from /Users/ambrose/Repos/flux_lang/parser/Primities.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Primities extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, TEXT_TYPE=2, BOOLEAN=3, BOOLEAN_TYPE=4, NUMBER=5, NUMBER_TYPE=6, 
		DIGIT=7, OCTET=8, IPV4=9, IPV4_TYPE=10, VAR_IDENTIFIER=11, COMMON_IDENTIFIER=12, 
		ARITHMETIC_OPERATOR=13, LOGICAL_OPERATOR=14, L_BLOCK=15, R_BLOCK=16, AT=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TEXT", "TEXT_TYPE", "BOOLEAN", "BOOLEAN_TYPE", "NUMBER", "NUMBER_TYPE", 
			"DIGIT", "OCTET", "IPV4", "IPV4_TYPE", "VAR_IDENTIFIER", "COMMON_IDENTIFIER", 
			"ARITHMETIC_OPERATOR", "LOGICAL_OPERATOR", "L_BLOCK", "R_BLOCK", "AT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'text'", null, "'bool'", null, "'num'", null, null, null, 
			"'ipv4'", null, null, null, null, "'{'", "'}'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "TEXT_TYPE", "BOOLEAN", "BOOLEAN_TYPE", "NUMBER", "NUMBER_TYPE", 
			"DIGIT", "OCTET", "IPV4", "IPV4_TYPE", "VAR_IDENTIFIER", "COMMON_IDENTIFIER", 
			"ARITHMETIC_OPERATOR", "LOGICAL_OPERATOR", "L_BLOCK", "R_BLOCK", "AT", 
			"WS"
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


	public Primities(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Primities.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0003\u0004E\b\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004\f\u0004"+
		"I\u0001\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004"+
		"\u0003\u0004S\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"^\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007k\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0005\n|\b\n\n\n\f\n\u007f\t\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0083\b\u000b\n\u000b\f\u000b\u0086\t\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u009d\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011\u00a6\b\u0011\u000b\u0011\f\u0011"+
		"\u00a7\u0001\u0011\u0001\u0011\u0001)\u0000\u0012\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u000b\u0001\u000009\u0001\u000019\u0001\u000004\u0001"+
		"\u000005\u0001\u0000az\u0003\u000009AZaz\u0001\u0000AZ\u0004\u000009A"+
		"Z__az\u0005\u0000%%*+--//^^\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u00c0"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003.\u0001\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000\u0007"+
		">\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bT\u0001\u0000"+
		"\u0000\u0000\rX\u0001\u0000\u0000\u0000\u000fj\u0001\u0000\u0000\u0000"+
		"\u0011l\u0001\u0000\u0000\u0000\u0013t\u0001\u0000\u0000\u0000\u0015y"+
		"\u0001\u0000\u0000\u0000\u0017\u0080\u0001\u0000\u0000\u0000\u0019\u0087"+
		"\u0001\u0000\u0000\u0000\u001b\u009c\u0001\u0000\u0000\u0000\u001d\u009e"+
		"\u0001\u0000\u0000\u0000\u001f\u00a0\u0001\u0000\u0000\u0000!\u00a2\u0001"+
		"\u0000\u0000\u0000#\u00a5\u0001\u0000\u0000\u0000%)\u0005\"\u0000\u0000"+
		"&(\t\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\"\u0000\u0000-\u0002\u0001"+
		"\u0000\u0000\u0000./\u0005t\u0000\u0000/0\u0005e\u0000\u000001\u0005x"+
		"\u0000\u000012\u0005t\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005"+
		"t\u0000\u000045\u0005r\u0000\u000056\u0005u\u0000\u00006=\u0005e\u0000"+
		"\u000078\u0005f\u0000\u000089\u0005a\u0000\u00009:\u0005l\u0000\u0000"+
		":;\u0005s\u0000\u0000;=\u0005e\u0000\u0000<3\u0001\u0000\u0000\u0000<"+
		"7\u0001\u0000\u0000\u0000=\u0006\u0001\u0000\u0000\u0000>?\u0005b\u0000"+
		"\u0000?@\u0005o\u0000\u0000@A\u0005o\u0000\u0000AB\u0005l\u0000\u0000"+
		"B\b\u0001\u0000\u0000\u0000CE\u0005-\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FH\u0007\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JR\u0001\u0000\u0000\u0000KO\u0005"+
		".\u0000\u0000LN\u0007\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RK\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\n\u0001\u0000\u0000\u0000TU\u0005n\u0000"+
		"\u0000UV\u0005u\u0000\u0000VW\u0005m\u0000\u0000W\f\u0001\u0000\u0000"+
		"\u0000XY\u0007\u0000\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Zk\u0005"+
		"0\u0000\u0000[]\u0007\u0001\u0000\u0000\\^\u0003\r\u0006\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^k\u0001\u0000\u0000\u0000"+
		"_`\u00051\u0000\u0000`a\u0003\r\u0006\u0000ab\u0003\r\u0006\u0000bk\u0001"+
		"\u0000\u0000\u0000cd\u00052\u0000\u0000de\u0007\u0002\u0000\u0000ek\u0003"+
		"\r\u0006\u0000fg\u00052\u0000\u0000gh\u00055\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ik\u0007\u0003\u0000\u0000jZ\u0001\u0000\u0000\u0000j[\u0001"+
		"\u0000\u0000\u0000j_\u0001\u0000\u0000\u0000jc\u0001\u0000\u0000\u0000"+
		"jf\u0001\u0000\u0000\u0000k\u0010\u0001\u0000\u0000\u0000lm\u0003\u000f"+
		"\u0007\u0000mn\u0005.\u0000\u0000no\u0003\u000f\u0007\u0000op\u0005.\u0000"+
		"\u0000pq\u0003\u000f\u0007\u0000qr\u0005.\u0000\u0000rs\u0003\u000f\u0007"+
		"\u0000s\u0012\u0001\u0000\u0000\u0000tu\u0005i\u0000\u0000uv\u0005p\u0000"+
		"\u0000vw\u0005v\u0000\u0000wx\u00054\u0000\u0000x\u0014\u0001\u0000\u0000"+
		"\u0000y}\u0007\u0004\u0000\u0000z|\u0007\u0005\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0016\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0084\u0007\u0006\u0000\u0000\u0081\u0083\u0007"+
		"\u0007\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0018\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0007\b\u0000\u0000\u0088\u001a\u0001\u0000"+
		"\u0000\u0000\u0089\u009d\u0005=\u0000\u0000\u008a\u008b\u0005!\u0000\u0000"+
		"\u008b\u009d\u0005=\u0000\u0000\u008c\u009d\u0007\t\u0000\u0000\u008d"+
		"\u008e\u0005>\u0000\u0000\u008e\u009d\u0005=\u0000\u0000\u008f\u0090\u0005"+
		"<\u0000\u0000\u0090\u009d\u0005=\u0000\u0000\u0091\u0092\u0005a\u0000"+
		"\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\u009d\u0005d\u0000\u0000\u0094"+
		"\u0095\u0005o\u0000\u0000\u0095\u009d\u0005r\u0000\u0000\u0096\u0097\u0005"+
		"n\u0000\u0000\u0097\u0098\u0005o\u0000\u0000\u0098\u009d\u0005t\u0000"+
		"\u0000\u0099\u009a\u0005x\u0000\u0000\u009a\u009b\u0005o\u0000\u0000\u009b"+
		"\u009d\u0005r\u0000\u0000\u009c\u0089\u0001\u0000\u0000\u0000\u009c\u008a"+
		"\u0001\u0000\u0000\u0000\u009c\u008c\u0001\u0000\u0000\u0000\u009c\u008d"+
		"\u0001\u0000\u0000\u0000\u009c\u008f\u0001\u0000\u0000\u0000\u009c\u0091"+
		"\u0001\u0000\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0096"+
		"\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u001c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005{\u0000\u0000\u009f\u001e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005}\u0000\u0000\u00a1 \u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005@\u0000\u0000\u00a3\"\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0007\n\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0006\u0011\u0000\u0000\u00aa$\u0001\u0000\u0000\u0000\r\u0000"+
		")<DIOR]j}\u0084\u009c\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}