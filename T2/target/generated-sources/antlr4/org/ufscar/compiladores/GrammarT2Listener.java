// Generated from org/ufscar/compiladores/GrammarT2.g4 by ANTLR 4.13.1
package org.ufscar.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarT2Parser}.
 */
public interface GrammarT2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GrammarT2Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GrammarT2Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(GrammarT2Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(GrammarT2Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#declaracaoLocal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoLocal(GrammarT2Parser.DeclaracaoLocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#declaracaoLocal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoLocal(GrammarT2Parser.DeclaracaoLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoGlobal(GrammarT2Parser.DeclaracaoGlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoGlobal(GrammarT2Parser.DeclaracaoGlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GrammarT2Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GrammarT2Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(GrammarT2Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(GrammarT2Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(GrammarT2Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(GrammarT2Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GrammarT2Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GrammarT2Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void enterTipoBasico(GrammarT2Parser.TipoBasicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void exitTipoBasico(GrammarT2Parser.TipoBasicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#tipoBasicoIdentificador}.
	 * @param ctx the parse tree
	 */
	void enterTipoBasicoIdentificador(GrammarT2Parser.TipoBasicoIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#tipoBasicoIdentificador}.
	 * @param ctx the parse tree
	 */
	void exitTipoBasicoIdentificador(GrammarT2Parser.TipoBasicoIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#tipoEstendido}.
	 * @param ctx the parse tree
	 */
	void enterTipoEstendido(GrammarT2Parser.TipoEstendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#tipoEstendido}.
	 * @param ctx the parse tree
	 */
	void exitTipoEstendido(GrammarT2Parser.TipoEstendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void enterValorConstante(GrammarT2Parser.ValorConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void exitValorConstante(GrammarT2Parser.ValorConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(GrammarT2Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(GrammarT2Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(GrammarT2Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(GrammarT2Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GrammarT2Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GrammarT2Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(GrammarT2Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(GrammarT2Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoLeia}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoLeia(GrammarT2Parser.ComandoLeiaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoLeia}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoLeia(GrammarT2Parser.ComandoLeiaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoEscreva}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoEscreva(GrammarT2Parser.ComandoEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoEscreva}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoEscreva(GrammarT2Parser.ComandoEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoSe}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoSe(GrammarT2Parser.ComandoSeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoSe}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoSe(GrammarT2Parser.ComandoSeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoCaso}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoCaso(GrammarT2Parser.ComandoCasoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoCaso}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoCaso(GrammarT2Parser.ComandoCasoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoPara}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoPara(GrammarT2Parser.ComandoParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoPara}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoPara(GrammarT2Parser.ComandoParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoEnquanto}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoEnquanto(GrammarT2Parser.ComandoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoEnquanto}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoEnquanto(GrammarT2Parser.ComandoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoFaca}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoFaca(GrammarT2Parser.ComandoFacaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoFaca}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoFaca(GrammarT2Parser.ComandoFacaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(GrammarT2Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(GrammarT2Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoChamada}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoChamada(GrammarT2Parser.ComandoChamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoChamada}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoChamada(GrammarT2Parser.ComandoChamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoRetorne}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoRetorne(GrammarT2Parser.ComandoRetorneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoRetorne}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoRetorne(GrammarT2Parser.ComandoRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#itemSelecao}.
	 * @param ctx the parse tree
	 */
	void enterItemSelecao(GrammarT2Parser.ItemSelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#itemSelecao}.
	 * @param ctx the parse tree
	 */
	void exitItemSelecao(GrammarT2Parser.ItemSelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(GrammarT2Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(GrammarT2Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(GrammarT2Parser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(GrammarT2Parser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#expAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpAritmetica(GrammarT2Parser.ExpAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#expAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpAritmetica(GrammarT2Parser.ExpAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GrammarT2Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GrammarT2Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GrammarT2Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GrammarT2Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#paridade}.
	 * @param ctx the parse tree
	 */
	void enterParidade(GrammarT2Parser.ParidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#paridade}.
	 * @param ctx the parse tree
	 */
	void exitParidade(GrammarT2Parser.ParidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(GrammarT2Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(GrammarT2Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#parcelaUnitaria}.
	 * @param ctx the parse tree
	 */
	void enterParcelaUnitaria(GrammarT2Parser.ParcelaUnitariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#parcelaUnitaria}.
	 * @param ctx the parse tree
	 */
	void exitParcelaUnitaria(GrammarT2Parser.ParcelaUnitariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#parcelaNaoUnitaria}.
	 * @param ctx the parse tree
	 */
	void enterParcelaNaoUnitaria(GrammarT2Parser.ParcelaNaoUnitariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#parcelaNaoUnitaria}.
	 * @param ctx the parse tree
	 */
	void exitParcelaNaoUnitaria(GrammarT2Parser.ParcelaNaoUnitariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#expRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpRelacional(GrammarT2Parser.ExpRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#expRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpRelacional(GrammarT2Parser.ExpRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GrammarT2Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GrammarT2Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#termoLogico}.
	 * @param ctx the parse tree
	 */
	void enterTermoLogico(GrammarT2Parser.TermoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#termoLogico}.
	 * @param ctx the parse tree
	 */
	void exitTermoLogico(GrammarT2Parser.TermoLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#fatorLogico}.
	 * @param ctx the parse tree
	 */
	void enterFatorLogico(GrammarT2Parser.FatorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#fatorLogico}.
	 * @param ctx the parse tree
	 */
	void exitFatorLogico(GrammarT2Parser.FatorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT2Parser#parcelaLogica}.
	 * @param ctx the parse tree
	 */
	void enterParcelaLogica(GrammarT2Parser.ParcelaLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT2Parser#parcelaLogica}.
	 * @param ctx the parse tree
	 */
	void exitParcelaLogica(GrammarT2Parser.ParcelaLogicaContext ctx);
}