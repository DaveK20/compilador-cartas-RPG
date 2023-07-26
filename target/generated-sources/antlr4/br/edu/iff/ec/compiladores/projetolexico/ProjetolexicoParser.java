// Generated from br\edu\iff\ec\compiladores\projetolexico\Projetolexico.g4 by ANTLR 4.13.0
package br.edu.iff.ec.compiladores.projetolexico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProjetolexicoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CRIAR_FICHA=1, CLASSE=2, LVL=3, RACA=4, NOME=5, IMAGEM=6, DESC=7, RACAS=8, 
		CLASSES=9, WS=10, DELIMITADOR=11, NOME_USUARIO=12, LEVEL=13, ABRECHAV=14, 
		FECHACHAV=15, NOME_IMAGEM=16, DESCR=17;
	public static final int
		RULE_inicial = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicial"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CRIAR_FICHA'", "'CLASSE'", "'LVL'", "'RACA'", "'NOME'", "'IMAGEM'", 
			"'DESC'", null, null, null, "':'", null, null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CRIAR_FICHA", "CLASSE", "LVL", "RACA", "NOME", "IMAGEM", "DESC", 
			"RACAS", "CLASSES", "WS", "DELIMITADOR", "NOME_USUARIO", "LEVEL", "ABRECHAV", 
			"FECHACHAV", "NOME_IMAGEM", "DESCR"
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
	public String getGrammarFileName() { return "Projetolexico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjetolexicoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicialContext extends ParserRuleContext {
		public TerminalNode CRIAR_FICHA() { return getToken(ProjetolexicoParser.CRIAR_FICHA, 0); }
		public TerminalNode ABRECHAV() { return getToken(ProjetolexicoParser.ABRECHAV, 0); }
		public TerminalNode IMAGEM() { return getToken(ProjetolexicoParser.IMAGEM, 0); }
		public List<TerminalNode> DELIMITADOR() { return getTokens(ProjetolexicoParser.DELIMITADOR); }
		public TerminalNode DELIMITADOR(int i) {
			return getToken(ProjetolexicoParser.DELIMITADOR, i);
		}
		public TerminalNode NOME_IMAGEM() { return getToken(ProjetolexicoParser.NOME_IMAGEM, 0); }
		public TerminalNode NOME() { return getToken(ProjetolexicoParser.NOME, 0); }
		public TerminalNode NOME_USUARIO() { return getToken(ProjetolexicoParser.NOME_USUARIO, 0); }
		public TerminalNode RACA() { return getToken(ProjetolexicoParser.RACA, 0); }
		public TerminalNode RACAS() { return getToken(ProjetolexicoParser.RACAS, 0); }
		public TerminalNode CLASSE() { return getToken(ProjetolexicoParser.CLASSE, 0); }
		public TerminalNode CLASSES() { return getToken(ProjetolexicoParser.CLASSES, 0); }
		public TerminalNode LVL() { return getToken(ProjetolexicoParser.LVL, 0); }
		public TerminalNode LEVEL() { return getToken(ProjetolexicoParser.LEVEL, 0); }
		public TerminalNode DESC() { return getToken(ProjetolexicoParser.DESC, 0); }
		public TerminalNode DESCR() { return getToken(ProjetolexicoParser.DESCR, 0); }
		public TerminalNode FECHACHAV() { return getToken(ProjetolexicoParser.FECHACHAV, 0); }
		public TerminalNode EOF() { return getToken(ProjetolexicoParser.EOF, 0); }
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjetolexicoListener ) ((ProjetolexicoListener)listener).enterInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjetolexicoListener ) ((ProjetolexicoListener)listener).exitInicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetolexicoVisitor ) return ((ProjetolexicoVisitor<? extends T>)visitor).visitInicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(CRIAR_FICHA);
			setState(3);
			match(ABRECHAV);
			setState(4);
			match(IMAGEM);
			setState(5);
			match(DELIMITADOR);
			setState(6);
			match(NOME_IMAGEM);
			setState(7);
			match(NOME);
			setState(8);
			match(DELIMITADOR);
			setState(9);
			match(NOME_USUARIO);
			setState(10);
			match(RACA);
			setState(11);
			match(DELIMITADOR);
			setState(12);
			match(RACAS);
			setState(13);
			match(CLASSE);
			setState(14);
			match(DELIMITADOR);
			setState(15);
			match(CLASSES);
			setState(16);
			match(LVL);
			setState(17);
			match(DELIMITADOR);
			setState(18);
			match(LEVEL);
			setState(19);
			match(DESC);
			setState(20);
			match(DELIMITADOR);
			setState(21);
			match(DESCR);
			setState(22);
			match(FECHACHAV);
			setState(23);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u001a\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0000\u0018\u0000\u0002\u0001\u0000\u0000\u0000\u0002\u0003\u0005"+
		"\u0001\u0000\u0000\u0003\u0004\u0005\u000e\u0000\u0000\u0004\u0005\u0005"+
		"\u0006\u0000\u0000\u0005\u0006\u0005\u000b\u0000\u0000\u0006\u0007\u0005"+
		"\u0010\u0000\u0000\u0007\b\u0005\u0005\u0000\u0000\b\t\u0005\u000b\u0000"+
		"\u0000\t\n\u0005\f\u0000\u0000\n\u000b\u0005\u0004\u0000\u0000\u000b\f"+
		"\u0005\u000b\u0000\u0000\f\r\u0005\b\u0000\u0000\r\u000e\u0005\u0002\u0000"+
		"\u0000\u000e\u000f\u0005\u000b\u0000\u0000\u000f\u0010\u0005\t\u0000\u0000"+
		"\u0010\u0011\u0005\u0003\u0000\u0000\u0011\u0012\u0005\u000b\u0000\u0000"+
		"\u0012\u0013\u0005\r\u0000\u0000\u0013\u0014\u0005\u0007\u0000\u0000\u0014"+
		"\u0015\u0005\u000b\u0000\u0000\u0015\u0016\u0005\u0011\u0000\u0000\u0016"+
		"\u0017\u0005\u000f\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018"+
		"\u0001\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}