// Generated from org/ufscar/compiladores/GrammarT3.g4 by ANTLR 4.13.1
package org.ufscar.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarT3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, OP_ARIT1=49, OP_ARIT2=50, OP_ARIT3=51, OP_REL=52, 
		OP_BOOL_OU=53, OP_BOOL_E=54, IDENT=55, NUMINT=56, NUMREAL=57, CADEIA=58, 
		COMENTARIO=59, WS=60, CADEIANAOFECHADA=61, COMENTARIONAOFECHADO=62, ERRO=63;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_declaracaoLocal = 2, RULE_declaracaoGlobal = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipoBasico = 8, RULE_tipoBasicoIdentificador = 9, RULE_tipoEstendido = 10, 
		RULE_valorConstante = 11, RULE_registro = 12, RULE_parametro = 13, RULE_parametros = 14, 
		RULE_corpo = 15, RULE_comando = 16, RULE_itemSelecao = 17, RULE_constantes = 18, 
		RULE_numero = 19, RULE_expAritmetica = 20, RULE_termo = 21, RULE_fator = 22, 
		RULE_paridade = 23, RULE_parcela = 24, RULE_parcelaUnitaria = 25, RULE_parcelaNaoUnitaria = 26, 
		RULE_expRelacional = 27, RULE_expressao = 28, RULE_termoLogico = 29, RULE_fatorLogico = 30, 
		RULE_parcelaLogica = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "declaracaoLocal", "declaracaoGlobal", "variavel", 
			"identificador", "dimensao", "tipo", "tipoBasico", "tipoBasicoIdentificador", 
			"tipoEstendido", "valorConstante", "registro", "parametro", "parametros", 
			"corpo", "comando", "itemSelecao", "constantes", "numero", "expAritmetica", 
			"termo", "fator", "paridade", "parcela", "parcelaUnitaria", "parcelaNaoUnitaria", 
			"expRelacional", "expressao", "termoLogico", "fatorLogico", "parcelaLogica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
			"'='", "'tipo'", "'procedimento'", "'('", "')'", "'fim_procedimento'", 
			"'funcao'", "'fim_funcao'", "','", "'.'", "'['", "']'", "'literal'", 
			"'inteiro'", "'real'", "'logico'", "'^'", "'verdadeiro'", "'falso'", 
			"'registro'", "'fim_registro'", "'var'", "'leia'", "'escreva'", "'se'", 
			"'entao'", "'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", 
			"'<-'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", 
			"'retorne'", "'..'", "'-'", "'&'", "'nao'", null, null, "'%'", null, 
			"'ou'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OP_ARIT1", "OP_ARIT2", "OP_ARIT3", "OP_REL", "OP_BOOL_OU", "OP_BOOL_E", 
			"IDENT", "NUMINT", "NUMREAL", "CADEIA", "COMENTARIO", "WS", "CADEIANAOFECHADA", 
			"COMENTARIONAOFECHADO", "ERRO"
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
	public String getGrammarFileName() { return "GrammarT3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarT3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarT3Parser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			declaracoes();
			setState(65);
			match(T__0);
			setState(66);
			corpo();
			setState(67);
			match(T__1);
			setState(68);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoLocalContext> declaracaoLocal() {
			return getRuleContexts(DeclaracaoLocalContext.class);
		}
		public DeclaracaoLocalContext declaracaoLocal(int i) {
			return getRuleContext(DeclaracaoLocalContext.class,i);
		}
		public List<DeclaracaoGlobalContext> declaracaoGlobal() {
			return getRuleContexts(DeclaracaoGlobalContext.class);
		}
		public DeclaracaoGlobalContext declaracaoGlobal(int i) {
			return getRuleContext(DeclaracaoGlobalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504L) != 0)) {
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__6:
					{
					setState(70);
					declaracaoLocal();
					}
					break;
				case T__7:
				case T__11:
					{
					setState(71);
					declaracaoGlobal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class DeclaracaoLocalContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarT3Parser.IDENT, 0); }
		public TipoBasicoContext tipoBasico() {
			return getRuleContext(TipoBasicoContext.class,0);
		}
		public ValorConstanteContext valorConstante() {
			return getRuleContext(ValorConstanteContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracaoLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoLocal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterDeclaracaoLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitDeclaracaoLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitDeclaracaoLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoLocalContext declaracaoLocal() throws RecognitionException {
		DeclaracaoLocalContext _localctx = new DeclaracaoLocalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoLocal);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__2);
				setState(78);
				variavel();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__3);
				setState(80);
				match(IDENT);
				setState(81);
				match(T__4);
				setState(82);
				tipoBasico();
				setState(83);
				match(T__5);
				setState(84);
				valorConstante();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(T__6);
				setState(87);
				match(IDENT);
				setState(88);
				match(T__4);
				setState(89);
				tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoGlobalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarT3Parser.IDENT, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TipoEstendidoContext tipoEstendido() {
			return getRuleContext(TipoEstendidoContext.class,0);
		}
		public DeclaracaoGlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoGlobal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterDeclaracaoGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitDeclaracaoGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitDeclaracaoGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoGlobalContext declaracaoGlobal() throws RecognitionException {
		DeclaracaoGlobalContext _localctx = new DeclaracaoGlobalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoGlobal);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__7);
				setState(93);
				match(IDENT);
				setState(94);
				match(T__8);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==IDENT) {
					{
					setState(95);
					parametros();
					}
				}

				setState(98);
				match(T__9);
				setState(99);
				corpo();
				setState(100);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__11);
				setState(103);
				match(IDENT);
				setState(104);
				match(T__8);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==IDENT) {
					{
					setState(105);
					parametros();
					}
				}

				setState(108);
				match(T__9);
				setState(109);
				match(T__4);
				setState(110);
				tipoEstendido();
				setState(111);
				corpo();
				setState(112);
				match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			identificador();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(117);
				match(T__13);
				setState(118);
				identificador();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__4);
			setState(125);
			tipo();
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
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarT3Parser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarT3Parser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IDENT);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(128);
				match(T__14);
				setState(129);
				match(IDENT);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			dimensao();
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
	public static class DimensaoContext extends ParserRuleContext {
		public List<ExpAritmeticaContext> expAritmetica() {
			return getRuleContexts(ExpAritmeticaContext.class);
		}
		public ExpAritmeticaContext expAritmetica(int i) {
			return getRuleContext(ExpAritmeticaContext.class,i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(137);
				match(T__15);
				setState(138);
				expAritmetica();
				setState(139);
				match(T__16);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TipoEstendidoContext tipoEstendido() {
			return getRuleContext(TipoEstendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				registro();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				tipoEstendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoBasicoContext extends ParserRuleContext {
		public TipoBasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBasico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterTipoBasico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitTipoBasico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitTipoBasico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoBasicoContext tipoBasico() throws RecognitionException {
		TipoBasicoContext _localctx = new TipoBasicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipoBasico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
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
	public static class TipoBasicoIdentificadorContext extends ParserRuleContext {
		public TipoBasicoContext tipoBasico() {
			return getRuleContext(TipoBasicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarT3Parser.IDENT, 0); }
		public TipoBasicoIdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBasicoIdentificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterTipoBasicoIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitTipoBasicoIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitTipoBasicoIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoBasicoIdentificadorContext tipoBasicoIdentificador() throws RecognitionException {
		TipoBasicoIdentificadorContext _localctx = new TipoBasicoIdentificadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipoBasicoIdentificador);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				tipoBasico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoEstendidoContext extends ParserRuleContext {
		public TipoBasicoIdentificadorContext tipoBasicoIdentificador() {
			return getRuleContext(TipoBasicoIdentificadorContext.class,0);
		}
		public TipoEstendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEstendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterTipoEstendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitTipoEstendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitTipoEstendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEstendidoContext tipoEstendido() throws RecognitionException {
		TipoEstendidoContext _localctx = new TipoEstendidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoEstendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(156);
				match(T__21);
				}
			}

			setState(159);
			tipoBasicoIdentificador();
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
	public static class ValorConstanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(GrammarT3Parser.CADEIA, 0); }
		public TerminalNode NUMINT() { return getToken(GrammarT3Parser.NUMINT, 0); }
		public TerminalNode NUMREAL() { return getToken(GrammarT3Parser.NUMREAL, 0); }
		public ValorConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorConstante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterValorConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitValorConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitValorConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorConstanteContext valorConstante() throws RecognitionException {
		ValorConstanteContext _localctx = new ValorConstanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valorConstante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158290661376L) != 0)) ) {
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
	public static class RegistroContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__24);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(164);
				variavel();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__25);
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
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TipoEstendidoContext tipoEstendido() {
			return getRuleContext(TipoEstendidoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(172);
				match(T__26);
				}
			}

			setState(175);
			identificador();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(176);
				match(T__13);
				setState(177);
				identificador();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(T__4);
			setState(184);
			tipoEstendido();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			parametro();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(187);
				match(T__13);
				setState(188);
				parametro();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class CorpoContext extends ParserRuleContext {
		public List<DeclaracaoLocalContext> declaracaoLocal() {
			return getRuleContexts(DeclaracaoLocalContext.class);
		}
		public DeclaracaoLocalContext declaracaoLocal(int i) {
			return getRuleContext(DeclaracaoLocalContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 152L) != 0)) {
				{
				{
				setState(194);
				declaracaoLocal();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
				{
				{
				setState(200);
				comando();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoLeiaContext extends ComandoContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public ComandoLeiaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoLeia(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoAtribuicaoContext extends ComandoContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoAtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoRetorneContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoRetorneContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoRetorne(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoChamadaContext extends ComandoContext {
		public TerminalNode IDENT() { return getToken(GrammarT3Parser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoChamadaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoChamada(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoCasoContext extends ComandoContext {
		public ExpAritmeticaContext expAritmetica() {
			return getRuleContext(ExpAritmeticaContext.class,0);
		}
		public List<ItemSelecaoContext> itemSelecao() {
			return getRuleContexts(ItemSelecaoContext.class);
		}
		public ItemSelecaoContext itemSelecao(int i) {
			return getRuleContext(ItemSelecaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoCasoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoCaso(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoParaContext extends ComandoContext {
		public TerminalNode IDENT() { return getToken(GrammarT3Parser.IDENT, 0); }
		public List<ExpAritmeticaContext> expAritmetica() {
			return getRuleContexts(ExpAritmeticaContext.class);
		}
		public ExpAritmeticaContext expAritmetica(int i) {
			return getRuleContext(ExpAritmeticaContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoParaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoPara(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoFacaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoFacaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoFaca(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoEscrevaContext extends ComandoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoEscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoEscreva(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoEnquantoContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoEnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoSeContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoSeContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterComandoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitComandoSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitComandoSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ComandoLeiaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__27);
				setState(207);
				match(T__8);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(208);
					match(T__21);
					}
				}

				setState(211);
				identificador();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(212);
					match(T__13);
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(213);
						match(T__21);
						}
					}

					setState(216);
					identificador();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new ComandoEscrevaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__28);
				setState(225);
				match(T__8);
				setState(226);
				expressao();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(227);
					match(T__13);
					setState(228);
					expressao();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ComandoSeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__29);
				setState(237);
				expressao();
				setState(238);
				match(T__30);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
					{
					{
					setState(239);
					comando();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(245);
					match(T__31);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
						{
						{
						setState(246);
						comando();
						}
						}
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(254);
				match(T__32);
				}
				break;
			case 4:
				_localctx = new ComandoCasoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(T__33);
				setState(257);
				expAritmetica();
				setState(258);
				match(T__34);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==NUMINT) {
					{
					{
					setState(259);
					itemSelecao();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(265);
					match(T__31);
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
						{
						{
						setState(266);
						comando();
						}
						}
						setState(271);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(274);
				match(T__35);
				}
				break;
			case 5:
				_localctx = new ComandoParaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(T__36);
				setState(277);
				match(IDENT);
				setState(278);
				match(T__37);
				setState(279);
				expAritmetica();
				setState(280);
				match(T__38);
				setState(281);
				expAritmetica();
				setState(282);
				match(T__39);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
					{
					{
					setState(283);
					comando();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				match(T__40);
				}
				break;
			case 6:
				_localctx = new ComandoEnquantoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				match(T__41);
				setState(292);
				expressao();
				setState(293);
				match(T__39);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
					{
					{
					setState(294);
					comando();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(T__42);
				}
				break;
			case 7:
				_localctx = new ComandoFacaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				match(T__39);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
					{
					{
					setState(303);
					comando();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(T__38);
				setState(310);
				expressao();
				}
				break;
			case 8:
				_localctx = new ComandoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(311);
					match(T__21);
					}
				}

				setState(314);
				identificador();
				setState(315);
				match(T__37);
				setState(316);
				expressao();
				}
				break;
			case 9:
				_localctx = new ComandoChamadaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(318);
				match(IDENT);
				setState(319);
				match(T__8);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540924536523063808L) != 0)) {
					{
					setState(320);
					expressao();
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(321);
						match(T__13);
						setState(322);
						expressao();
						}
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(330);
				match(T__9);
				}
				break;
			case 10:
				_localctx = new ComandoRetorneContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(331);
				match(T__43);
				setState(332);
				expressao();
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
	public static class ItemSelecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ItemSelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemSelecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterItemSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitItemSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitItemSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemSelecaoContext itemSelecao() throws RecognitionException {
		ItemSelecaoContext _localctx = new ItemSelecaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_itemSelecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			constantes();
			setState(336);
			match(T__4);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36052043265212416L) != 0)) {
				{
				{
				setState(337);
				comando();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ConstantesContext extends ParserRuleContext {
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			numero();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(344);
				match(T__13);
				setState(345);
				numero();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class NumeroContext extends ParserRuleContext {
		public List<TerminalNode> NUMINT() { return getTokens(GrammarT3Parser.NUMINT); }
		public TerminalNode NUMINT(int i) {
			return getToken(GrammarT3Parser.NUMINT, i);
		}
		public List<ParidadeContext> paridade() {
			return getRuleContexts(ParidadeContext.class);
		}
		public ParidadeContext paridade(int i) {
			return getRuleContext(ParidadeContext.class,i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(351);
				paridade();
				}
			}

			setState(354);
			match(NUMINT);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(355);
				match(T__44);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(356);
					paridade();
					}
				}

				setState(359);
				match(NUMINT);
				}
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
	public static class ExpAritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP_ARIT1() { return getTokens(GrammarT3Parser.OP_ARIT1); }
		public TerminalNode OP_ARIT1(int i) {
			return getToken(GrammarT3Parser.OP_ARIT1, i);
		}
		public ExpAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterExpAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitExpAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitExpAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAritmeticaContext expAritmetica() throws RecognitionException {
		ExpAritmeticaContext _localctx = new ExpAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			termo();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT1) {
				{
				{
				setState(363);
				match(OP_ARIT1);
				setState(364);
				termo();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> OP_ARIT2() { return getTokens(GrammarT3Parser.OP_ARIT2); }
		public TerminalNode OP_ARIT2(int i) {
			return getToken(GrammarT3Parser.OP_ARIT2, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			fator();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT2) {
				{
				{
				setState(371);
				match(OP_ARIT2);
				setState(372);
				fator();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<TerminalNode> OP_ARIT3() { return getTokens(GrammarT3Parser.OP_ARIT3); }
		public TerminalNode OP_ARIT3(int i) {
			return getToken(GrammarT3Parser.OP_ARIT3, i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			parcela();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT3) {
				{
				{
				setState(379);
				match(OP_ARIT3);
				setState(380);
				parcela();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ParidadeContext extends ParserRuleContext {
		public ParidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paridade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterParidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitParidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitParidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParidadeContext paridade() throws RecognitionException {
		ParidadeContext _localctx = new ParidadeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_paridade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__45);
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
	public static class ParcelaContext extends ParserRuleContext {
		public ParcelaUnitariaContext parcelaUnitaria() {
			return getRuleContext(ParcelaUnitariaContext.class,0);
		}
		public ParidadeContext paridade() {
			return getRuleContext(ParidadeContext.class,0);
		}
		public ParcelaNaoUnitariaContext parcelaNaoUnitaria() {
			return getRuleContext(ParcelaNaoUnitariaContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parcela);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__21:
			case T__45:
			case IDENT:
			case NUMINT:
			case NUMREAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(388);
					paridade();
					}
				}

				setState(391);
				parcelaUnitaria();
				}
				break;
			case T__46:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				parcelaNaoUnitaria();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParcelaUnitariaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarT3Parser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode NUMINT() { return getToken(GrammarT3Parser.NUMINT, 0); }
		public TerminalNode NUMREAL() { return getToken(GrammarT3Parser.NUMREAL, 0); }
		public ParcelaUnitariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcelaUnitaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterParcelaUnitaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitParcelaUnitaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitParcelaUnitaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaUnitariaContext parcelaUnitaria() throws RecognitionException {
		ParcelaUnitariaContext _localctx = new ParcelaUnitariaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parcelaUnitaria);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(395);
					match(T__21);
					}
				}

				setState(398);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(IDENT);
				setState(400);
				match(T__8);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540924536523063808L) != 0)) {
					{
					setState(401);
					expressao();
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(402);
						match(T__13);
						setState(403);
						expressao();
						}
						}
						setState(408);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(411);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(NUMINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(NUMREAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				match(T__8);
				setState(415);
				expressao();
				setState(416);
				match(T__9);
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
	public static class ParcelaNaoUnitariaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(GrammarT3Parser.CADEIA, 0); }
		public ParcelaNaoUnitariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcelaNaoUnitaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterParcelaNaoUnitaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitParcelaNaoUnitaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitParcelaNaoUnitaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaNaoUnitariaContext parcelaNaoUnitaria() throws RecognitionException {
		ParcelaNaoUnitariaContext _localctx = new ParcelaNaoUnitariaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parcelaNaoUnitaria);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(T__46);
				setState(421);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpRelacionalContext extends ParserRuleContext {
		public List<ExpAritmeticaContext> expAritmetica() {
			return getRuleContexts(ExpAritmeticaContext.class);
		}
		public ExpAritmeticaContext expAritmetica(int i) {
			return getRuleContext(ExpAritmeticaContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(GrammarT3Parser.OP_REL, 0); }
		public ExpRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterExpRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitExpRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitExpRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpRelacionalContext expRelacional() throws RecognitionException {
		ExpRelacionalContext _localctx = new ExpRelacionalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			expAritmetica();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_REL) {
				{
				setState(426);
				match(OP_REL);
				setState(427);
				expAritmetica();
				}
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoLogicoContext> termoLogico() {
			return getRuleContexts(TermoLogicoContext.class);
		}
		public TermoLogicoContext termoLogico(int i) {
			return getRuleContext(TermoLogicoContext.class,i);
		}
		public List<TerminalNode> OP_BOOL_OU() { return getTokens(GrammarT3Parser.OP_BOOL_OU); }
		public TerminalNode OP_BOOL_OU(int i) {
			return getToken(GrammarT3Parser.OP_BOOL_OU, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			termoLogico();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_BOOL_OU) {
				{
				{
				setState(431);
				match(OP_BOOL_OU);
				setState(432);
				termoLogico();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TermoLogicoContext extends ParserRuleContext {
		public List<FatorLogicoContext> fatorLogico() {
			return getRuleContexts(FatorLogicoContext.class);
		}
		public FatorLogicoContext fatorLogico(int i) {
			return getRuleContext(FatorLogicoContext.class,i);
		}
		public List<TerminalNode> OP_BOOL_E() { return getTokens(GrammarT3Parser.OP_BOOL_E); }
		public TerminalNode OP_BOOL_E(int i) {
			return getToken(GrammarT3Parser.OP_BOOL_E, i);
		}
		public TermoLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterTermoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitTermoLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitTermoLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoLogicoContext termoLogico() throws RecognitionException {
		TermoLogicoContext _localctx = new TermoLogicoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_termoLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			fatorLogico();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_BOOL_E) {
				{
				{
				setState(439);
				match(OP_BOOL_E);
				setState(440);
				fatorLogico();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FatorLogicoContext extends ParserRuleContext {
		public ParcelaLogicaContext parcelaLogica() {
			return getRuleContext(ParcelaLogicaContext.class,0);
		}
		public FatorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterFatorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitFatorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitFatorLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorLogicoContext fatorLogico() throws RecognitionException {
		FatorLogicoContext _localctx = new FatorLogicoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fatorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(446);
				match(T__47);
				}
			}

			setState(449);
			parcelaLogica();
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
	public static class ParcelaLogicaContext extends ParserRuleContext {
		public ExpRelacionalContext expRelacional() {
			return getRuleContext(ExpRelacionalContext.class,0);
		}
		public ParcelaLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcelaLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).enterParcelaLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarT3Listener ) ((GrammarT3Listener)listener).exitParcelaLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarT3Visitor ) return ((GrammarT3Visitor<? extends T>)visitor).visitParcelaLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaLogicaContext parcelaLogica() throws RecognitionException {
		ParcelaLogicaContext _localctx = new ParcelaLogicaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parcelaLogica);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(T__23);
				}
				break;
			case T__8:
			case T__21:
			case T__45:
			case T__46:
			case IDENT:
			case NUMINT:
			case NUMREAL:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				expRelacional();
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

	public static final String _serializedATN =
		"\u0004\u0001?\u01c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001I\b\u0001"+
		"\n\u0001\f\u0001L\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003k\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003s\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004x\b\u0004\n\u0004\f\u0004{\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008e"+
		"\b\u0006\n\u0006\f\u0006\u0091\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0095\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u009b\b\t\u0001"+
		"\n\u0003\n\u009e\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\f\u00a6\b\f\n\f\f\f\u00a9\t\f\u0001\f\u0001\f\u0001\r\u0003\r"+
		"\u00ae\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b3\b\r\n\r\f\r\u00b6\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00be\b\u000e\n\u000e\f\u000e\u00c1\t\u000e\u0001\u000f\u0005\u000f\u00c4"+
		"\b\u000f\n\u000f\f\u000f\u00c7\t\u000f\u0001\u000f\u0005\u000f\u00ca\b"+
		"\u000f\n\u000f\f\u000f\u00cd\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00d2\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00d7\b\u0010\u0001\u0010\u0005\u0010\u00da\b\u0010\n\u0010\f\u0010\u00dd"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00e6\b\u0010\n\u0010\f\u0010\u00e9\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00f1\b\u0010\n\u0010\f\u0010\u00f4\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00f8\b\u0010\n\u0010\f\u0010\u00fb\t\u0010\u0003\u0010"+
		"\u00fd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0105\b\u0010\n\u0010\f\u0010\u0108\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u010c\b\u0010\n\u0010\f\u0010\u010f\t\u0010"+
		"\u0003\u0010\u0111\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u011d\b\u0010\n\u0010\f\u0010\u0120\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0128"+
		"\b\u0010\n\u0010\f\u0010\u012b\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0131\b\u0010\n\u0010\f\u0010\u0134\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0139\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0144\b\u0010\n\u0010\f\u0010\u0147\t\u0010"+
		"\u0003\u0010\u0149\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u014e\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0153\b"+
		"\u0011\n\u0011\f\u0011\u0156\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u015b\b\u0012\n\u0012\f\u0012\u015e\t\u0012\u0001\u0013\u0003"+
		"\u0013\u0161\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0166"+
		"\b\u0013\u0001\u0013\u0003\u0013\u0169\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u016e\b\u0014\n\u0014\f\u0014\u0171\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0176\b\u0015\n\u0015\f\u0015"+
		"\u0179\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u017e\b"+
		"\u0016\n\u0016\f\u0016\u0181\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0003\u0018\u0186\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u018a\b"+
		"\u0018\u0001\u0019\u0003\u0019\u018d\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0195\b\u0019\n"+
		"\u0019\f\u0019\u0198\t\u0019\u0003\u0019\u019a\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01a3\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a8"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ad\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01b2\b\u001c\n\u001c"+
		"\f\u001c\u01b5\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01ba\b\u001d\n\u001d\f\u001d\u01bd\t\u001d\u0001\u001e\u0003\u001e\u01c0"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01c7\b\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>\u0000\u0002\u0001\u0000\u0012\u0015\u0002\u0000\u0017\u00188"+
		":\u01ec\u0000@\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000"+
		"\u0004Z\u0001\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000\bt\u0001"+
		"\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u008f\u0001\u0000"+
		"\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000"+
		"\u0000\u0000\u0012\u009a\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000"+
		"\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000"+
		"\u0000\u0000\u001a\u00ad\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000"+
		"\u0000\u0000\u001e\u00c5\u0001\u0000\u0000\u0000 \u014d\u0001\u0000\u0000"+
		"\u0000\"\u014f\u0001\u0000\u0000\u0000$\u0157\u0001\u0000\u0000\u0000"+
		"&\u0160\u0001\u0000\u0000\u0000(\u016a\u0001\u0000\u0000\u0000*\u0172"+
		"\u0001\u0000\u0000\u0000,\u017a\u0001\u0000\u0000\u0000.\u0182\u0001\u0000"+
		"\u0000\u00000\u0189\u0001\u0000\u0000\u00002\u01a2\u0001\u0000\u0000\u0000"+
		"4\u01a7\u0001\u0000\u0000\u00006\u01a9\u0001\u0000\u0000\u00008\u01ae"+
		"\u0001\u0000\u0000\u0000:\u01b6\u0001\u0000\u0000\u0000<\u01bf\u0001\u0000"+
		"\u0000\u0000>\u01c6\u0001\u0000\u0000\u0000@A\u0003\u0002\u0001\u0000"+
		"AB\u0005\u0001\u0000\u0000BC\u0003\u001e\u000f\u0000CD\u0005\u0002\u0000"+
		"\u0000DE\u0005\u0000\u0000\u0001E\u0001\u0001\u0000\u0000\u0000FI\u0003"+
		"\u0004\u0002\u0000GI\u0003\u0006\u0003\u0000HF\u0001\u0000\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0003\u0000\u0000N[\u0003\b\u0004\u0000OP\u0005"+
		"\u0004\u0000\u0000PQ\u00057\u0000\u0000QR\u0005\u0005\u0000\u0000RS\u0003"+
		"\u0010\b\u0000ST\u0005\u0006\u0000\u0000TU\u0003\u0016\u000b\u0000U[\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u00057\u0000\u0000XY\u0005"+
		"\u0005\u0000\u0000Y[\u0003\u000e\u0007\u0000ZM\u0001\u0000\u0000\u0000"+
		"ZO\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000[\u0005\u0001\u0000"+
		"\u0000\u0000\\]\u0005\b\u0000\u0000]^\u00057\u0000\u0000^`\u0005\t\u0000"+
		"\u0000_a\u0003\u001c\u000e\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\n\u0000\u0000cd\u0003\u001e"+
		"\u000f\u0000de\u0005\u000b\u0000\u0000es\u0001\u0000\u0000\u0000fg\u0005"+
		"\f\u0000\u0000gh\u00057\u0000\u0000hj\u0005\t\u0000\u0000ik\u0003\u001c"+
		"\u000e\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0005\n\u0000\u0000mn\u0005\u0005\u0000\u0000no\u0003"+
		"\u0014\n\u0000op\u0003\u001e\u000f\u0000pq\u0005\r\u0000\u0000qs\u0001"+
		"\u0000\u0000\u0000r\\\u0001\u0000\u0000\u0000rf\u0001\u0000\u0000\u0000"+
		"s\u0007\u0001\u0000\u0000\u0000ty\u0003\n\u0005\u0000uv\u0005\u000e\u0000"+
		"\u0000vx\u0003\n\u0005\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0005\u0000\u0000}~\u0003"+
		"\u000e\u0007\u0000~\t\u0001\u0000\u0000\u0000\u007f\u0084\u00057\u0000"+
		"\u0000\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0083\u00057\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0003\f\u0006\u0000\u0088\u000b\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0010\u0000\u0000\u008a\u008b\u0003(\u0014\u0000\u008b\u008c"+
		"\u0005\u0011\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u0089"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\r\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0003"+
		"\u0018\f\u0000\u0093\u0095\u0003\u0014\n\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u000f\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0007\u0000\u0000\u0000\u0097\u0011\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0003\u0010\b\u0000\u0099\u009b\u00057\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u0013\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u0016\u0000"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0012\t\u0000"+
		"\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2\u0007\u0001\u0000\u0000"+
		"\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a7\u0005\u0019\u0000\u0000"+
		"\u00a4\u00a6\u0003\b\u0004\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u001a\u0000\u0000\u00ab"+
		"\u0019\u0001\u0000\u0000\u0000\u00ac\u00ae\u0005\u001b\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b4\u0003\n\u0005\u0000\u00b0\u00b1"+
		"\u0005\u000e\u0000\u0000\u00b1\u00b3\u0003\n\u0005\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0005\u0000\u0000\u00b8\u00b9\u0003\u0014\n\u0000\u00b9\u001b\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bf\u0003\u001a\r\u0000\u00bb\u00bc\u0005\u000e\u0000"+
		"\u0000\u00bc\u00be\u0003\u001a\r\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001d\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\u0004\u0002\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00cb\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0003 \u0010\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u001f\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u001c\u0000\u0000\u00cf"+
		"\u00d1\u0005\t\u0000\u0000\u00d0\u00d2\u0005\u0016\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00db\u0003\n\u0005\u0000\u00d4\u00d6\u0005"+
		"\u000e\u0000\u0000\u00d5\u00d7\u0005\u0016\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0003\n\u0005\u0000\u00d9\u00d4\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005\n\u0000"+
		"\u0000\u00df\u014e\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u001d\u0000"+
		"\u0000\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e7\u00038\u001c\u0000"+
		"\u00e3\u00e4\u0005\u000e\u0000\u0000\u00e4\u00e6\u00038\u001c\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\n\u0000\u0000\u00eb\u014e\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005\u001e\u0000\u0000\u00ed\u00ee\u00038\u001c\u0000\u00ee\u00f2\u0005"+
		"\u001f\u0000\u0000\u00ef\u00f1\u0003 \u0010\u0000\u00f0\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00fc\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f9\u0005 \u0000"+
		"\u0000\u00f6\u00f8\u0003 \u0010\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00f5\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0005!\u0000\u0000\u00ff\u014e\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\"\u0000\u0000\u0101\u0102\u0003(\u0014\u0000\u0102\u0106"+
		"\u0005#\u0000\u0000\u0103\u0105\u0003\"\u0011\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0110\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010d\u0005"+
		" \u0000\u0000\u010a\u010c\u0003 \u0010\u0000\u010b\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0109\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005$\u0000\u0000\u0113\u014e\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005%\u0000\u0000\u0115\u0116\u00057\u0000\u0000\u0116\u0117"+
		"\u0005&\u0000\u0000\u0117\u0118\u0003(\u0014\u0000\u0118\u0119\u0005\'"+
		"\u0000\u0000\u0119\u011a\u0003(\u0014\u0000\u011a\u011e\u0005(\u0000\u0000"+
		"\u011b\u011d\u0003 \u0010\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005)\u0000\u0000\u0122\u014e"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0005*\u0000\u0000\u0124\u0125\u0003"+
		"8\u001c\u0000\u0125\u0129\u0005(\u0000\u0000\u0126\u0128\u0003 \u0010"+
		"\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005+\u0000\u0000\u012d\u014e\u0001\u0000\u0000\u0000"+
		"\u012e\u0132\u0005(\u0000\u0000\u012f\u0131\u0003 \u0010\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005\'\u0000\u0000\u0136\u014e\u00038\u001c\u0000\u0137\u0139\u0005"+
		"\u0016\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0003"+
		"\n\u0005\u0000\u013b\u013c\u0005&\u0000\u0000\u013c\u013d\u00038\u001c"+
		"\u0000\u013d\u014e\u0001\u0000\u0000\u0000\u013e\u013f\u00057\u0000\u0000"+
		"\u013f\u0148\u0005\t\u0000\u0000\u0140\u0145\u00038\u001c\u0000\u0141"+
		"\u0142\u0005\u000e\u0000\u0000\u0142\u0144\u00038\u001c\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0149"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0140"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014e\u0005\n\u0000\u0000\u014b\u014c\u0005"+
		",\u0000\u0000\u014c\u014e\u00038\u001c\u0000\u014d\u00ce\u0001\u0000\u0000"+
		"\u0000\u014d\u00e0\u0001\u0000\u0000\u0000\u014d\u00ec\u0001\u0000\u0000"+
		"\u0000\u014d\u0100\u0001\u0000\u0000\u0000\u014d\u0114\u0001\u0000\u0000"+
		"\u0000\u014d\u0123\u0001\u0000\u0000\u0000\u014d\u012e\u0001\u0000\u0000"+
		"\u0000\u014d\u0138\u0001\u0000\u0000\u0000\u014d\u013e\u0001\u0000\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e!\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0003$\u0012\u0000\u0150\u0154\u0005\u0005\u0000\u0000\u0151"+
		"\u0153\u0003 \u0010\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155#\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u015c\u0003&\u0013\u0000\u0158\u0159\u0005\u000e"+
		"\u0000\u0000\u0159\u015b\u0003&\u0013\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d%\u0001\u0000\u0000\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0161\u0003.\u0017\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0168\u00058\u0000\u0000\u0163\u0165"+
		"\u0005-\u0000\u0000\u0164\u0166\u0003.\u0017\u0000\u0165\u0164\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167\u0169\u00058\u0000\u0000\u0168\u0163\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\'\u0001\u0000\u0000\u0000"+
		"\u016a\u016f\u0003*\u0015\u0000\u016b\u016c\u00051\u0000\u0000\u016c\u016e"+
		"\u0003*\u0015\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0171\u0001"+
		"\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170)\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0177\u0003,\u0016\u0000\u0173\u0174\u00052\u0000\u0000"+
		"\u0174\u0176\u0003,\u0016\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176"+
		"\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0001\u0000\u0000\u0000\u0178+\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u017a\u017f\u00030\u0018\u0000\u017b\u017c\u0005"+
		"3\u0000\u0000\u017c\u017e\u00030\u0018\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180-\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u0005.\u0000\u0000\u0183"+
		"/\u0001\u0000\u0000\u0000\u0184\u0186\u0003.\u0017\u0000\u0185\u0184\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u018a\u00032\u0019\u0000\u0188\u018a\u00034\u001a"+
		"\u0000\u0189\u0185\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000"+
		"\u0000\u018a1\u0001\u0000\u0000\u0000\u018b\u018d\u0005\u0016\u0000\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u01a3\u0003\n\u0005\u0000\u018f"+
		"\u0190\u00057\u0000\u0000\u0190\u0199\u0005\t\u0000\u0000\u0191\u0196"+
		"\u00038\u001c\u0000\u0192\u0193\u0005\u000e\u0000\u0000\u0193\u0195\u0003"+
		"8\u001c\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000"+
		"\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000"+
		"\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0199\u0191\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u01a3\u0005\n\u0000"+
		"\u0000\u019c\u01a3\u00058\u0000\u0000\u019d\u01a3\u00059\u0000\u0000\u019e"+
		"\u019f\u0005\t\u0000\u0000\u019f\u01a0\u00038\u001c\u0000\u01a0\u01a1"+
		"\u0005\n\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u018c\u0001"+
		"\u0000\u0000\u0000\u01a2\u018f\u0001\u0000\u0000\u0000\u01a2\u019c\u0001"+
		"\u0000\u0000\u0000\u01a2\u019d\u0001\u0000\u0000\u0000\u01a2\u019e\u0001"+
		"\u0000\u0000\u0000\u01a33\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005/\u0000"+
		"\u0000\u01a5\u01a8\u0003\n\u0005\u0000\u01a6\u01a8\u0005:\u0000\u0000"+
		"\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a85\u0001\u0000\u0000\u0000\u01a9\u01ac\u0003(\u0014\u0000\u01aa\u01ab"+
		"\u00054\u0000\u0000\u01ab\u01ad\u0003(\u0014\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad7\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b3\u0003:\u001d\u0000\u01af\u01b0\u00055\u0000\u0000\u01b0"+
		"\u01b2\u0003:\u001d\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b49\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b6\u01bb\u0003<\u001e\u0000\u01b7\u01b8\u00056\u0000"+
		"\u0000\u01b8\u01ba\u0003<\u001e\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc;\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bb\u0001\u0000\u0000\u0000\u01be\u01c0\u00050\u0000\u0000\u01bf\u01be"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0003>\u001f\u0000\u01c2=\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c7\u0005\u0017\u0000\u0000\u01c4\u01c7\u0005\u0018"+
		"\u0000\u0000\u01c5\u01c7\u00036\u001b\u0000\u01c6\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c7?\u0001\u0000\u0000\u00007HJZ`jry\u0084\u008f\u0094\u009a"+
		"\u009d\u00a7\u00ad\u00b4\u00bf\u00c5\u00cb\u00d1\u00d6\u00db\u00e7\u00f2"+
		"\u00f9\u00fc\u0106\u010d\u0110\u011e\u0129\u0132\u0138\u0145\u0148\u014d"+
		"\u0154\u015c\u0160\u0165\u0168\u016f\u0177\u017f\u0185\u0189\u018c\u0196"+
		"\u0199\u01a2\u01a7\u01ac\u01b3\u01bb\u01bf\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}