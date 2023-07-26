// Generated from br\edu\iff\ec\compiladores\projetolexico\Projetolexico.g4 by ANTLR 4.13.0
package br.edu.iff.ec.compiladores.projetolexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Projetolexico extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRAS_CHAVES=1, NOME=2, LVL=3, ABRECHAV=4, FECHACHAV=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRAS_CHAVES", "NOME", "LVL", "ABRECHAV", "FECHACHAV", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRAS_CHAVES", "NOME", "LVL", "ABRECHAV", "FECHACHAV", "WS"
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


	public Projetolexico(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Projetolexico.g4"; }

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
		"\u0004\u0000\u0006C\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000*\b\u0000\u0001\u0001\u0004\u0001-\b\u0001\u000b"+
		"\u0001\f\u0001.\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00014\b\u0001"+
		"\u000b\u0001\f\u00015\u0003\u00018\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\u0001\u0000\u0002\u0002\u0000AZaz\u0003"+
		"\u0000\t\n\r\r  J\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000"+
		"\u00059\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t=\u0001"+
		"\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\r\u000e\u0005N\u0000"+
		"\u0000\u000e\u000f\u0005O\u0000\u0000\u000f\u0010\u0005M\u0000\u0000\u0010"+
		"*\u0005E\u0000\u0000\u0011\u0012\u0005R\u0000\u0000\u0012\u0013\u0005"+
		"A\u0000\u0000\u0013\u0014\u0005\u00c7\u0000\u0000\u0014*\u0005A\u0000"+
		"\u0000\u0015\u0016\u0005L\u0000\u0000\u0016\u0017\u0005V\u0000\u0000\u0017"+
		"*\u0005L\u0000\u0000\u0018\u0019\u0005C\u0000\u0000\u0019\u001a\u0005"+
		"L\u0000\u0000\u001a\u001b\u0005A\u0000\u0000\u001b\u001c\u0005S\u0000"+
		"\u0000\u001c\u001d\u0005S\u0000\u0000\u001d*\u0005E\u0000\u0000\u001e"+
		"\u001f\u0005C\u0000\u0000\u001f \u0005R\u0000\u0000 !\u0005I\u0000\u0000"+
		"!\"\u0005A\u0000\u0000\"#\u0005R\u0000\u0000#$\u0005_\u0000\u0000$%\u0005"+
		"F\u0000\u0000%&\u0005I\u0000\u0000&\'\u0005C\u0000\u0000\'(\u0005H\u0000"+
		"\u0000(*\u0005A\u0000\u0000)\r\u0001\u0000\u0000\u0000)\u0011\u0001\u0000"+
		"\u0000\u0000)\u0015\u0001\u0000\u0000\u0000)\u0018\u0001\u0000\u0000\u0000"+
		")\u001e\u0001\u0000\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+-\u0007"+
		"\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/7\u0001\u0000\u0000"+
		"\u000001\u0005 \u0000\u000018\u0002az\u000024\u0002AZ\u000032\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000070\u0001\u0000\u0000\u0000"+
		"73\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0004\u0001\u0000"+
		"\u0000\u00009:\u000209\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005{\u0000"+
		"\u0000<\b\u0001\u0000\u0000\u0000=>\u0005}\u0000\u0000>\n\u0001\u0000"+
		"\u0000\u0000?@\u0007\u0001\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0006"+
		"\u0005\u0000\u0000B\f\u0001\u0000\u0000\u0000\u0005\u0000).57\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}