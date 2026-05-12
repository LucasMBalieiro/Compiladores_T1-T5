// Generated from org/ufscar/compiladores/GrammarT3.g4 by ANTLR 4.13.1
package org.ufscar.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarT3Parser}.
 */
public interface GrammarT3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GrammarT3Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GrammarT3Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(GrammarT3Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(GrammarT3Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#declaracaoLocal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoLocal(GrammarT3Parser.DeclaracaoLocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#declaracaoLocal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoLocal(GrammarT3Parser.DeclaracaoLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoGlobal(GrammarT3Parser.DeclaracaoGlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoGlobal(GrammarT3Parser.DeclaracaoGlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GrammarT3Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GrammarT3Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(GrammarT3Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(GrammarT3Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(GrammarT3Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(GrammarT3Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GrammarT3Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GrammarT3Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void enterTipoBasico(GrammarT3Parser.TipoBasicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void exitTipoBasico(GrammarT3Parser.TipoBasicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#tipoBasicoIdentificador}.
	 * @param ctx the parse tree
	 */
	void enterTipoBasicoIdentificador(GrammarT3Parser.TipoBasicoIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#tipoBasicoIdentificador}.
	 * @param ctx the parse tree
	 */
	void exitTipoBasicoIdentificador(GrammarT3Parser.TipoBasicoIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#tipoEstendido}.
	 * @param ctx the parse tree
	 */
	void enterTipoEstendido(GrammarT3Parser.TipoEstendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#tipoEstendido}.
	 * @param ctx the parse tree
	 */
	void exitTipoEstendido(GrammarT3Parser.TipoEstendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void enterValorConstante(GrammarT3Parser.ValorConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void exitValorConstante(GrammarT3Parser.ValorConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(GrammarT3Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(GrammarT3Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(GrammarT3Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(GrammarT3Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GrammarT3Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GrammarT3Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(GrammarT3Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(GrammarT3Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoLeia}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoLeia(GrammarT3Parser.ComandoLeiaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoLeia}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoLeia(GrammarT3Parser.ComandoLeiaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoEscreva}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoEscreva(GrammarT3Parser.ComandoEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoEscreva}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoEscreva(GrammarT3Parser.ComandoEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoSe}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoSe(GrammarT3Parser.ComandoSeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoSe}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoSe(GrammarT3Parser.ComandoSeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoCaso}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoCaso(GrammarT3Parser.ComandoCasoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoCaso}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoCaso(GrammarT3Parser.ComandoCasoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoPara}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoPara(GrammarT3Parser.ComandoParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoPara}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoPara(GrammarT3Parser.ComandoParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoEnquanto}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoEnquanto(GrammarT3Parser.ComandoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoEnquanto}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoEnquanto(GrammarT3Parser.ComandoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoFaca}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoFaca(GrammarT3Parser.ComandoFacaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoFaca}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoFaca(GrammarT3Parser.ComandoFacaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(GrammarT3Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(GrammarT3Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoChamada}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoChamada(GrammarT3Parser.ComandoChamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoChamada}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoChamada(GrammarT3Parser.ComandoChamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComandoRetorne}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComandoRetorne(GrammarT3Parser.ComandoRetorneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComandoRetorne}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComandoRetorne(GrammarT3Parser.ComandoRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#itemSelecao}.
	 * @param ctx the parse tree
	 */
	void enterItemSelecao(GrammarT3Parser.ItemSelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#itemSelecao}.
	 * @param ctx the parse tree
	 */
	void exitItemSelecao(GrammarT3Parser.ItemSelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(GrammarT3Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(GrammarT3Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(GrammarT3Parser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(GrammarT3Parser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#expAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpAritmetica(GrammarT3Parser.ExpAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#expAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpAritmetica(GrammarT3Parser.ExpAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GrammarT3Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GrammarT3Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GrammarT3Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GrammarT3Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#paridade}.
	 * @param ctx the parse tree
	 */
	void enterParidade(GrammarT3Parser.ParidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#paridade}.
	 * @param ctx the parse tree
	 */
	void exitParidade(GrammarT3Parser.ParidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(GrammarT3Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(GrammarT3Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#parcelaUnitaria}.
	 * @param ctx the parse tree
	 */
	void enterParcelaUnitaria(GrammarT3Parser.ParcelaUnitariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#parcelaUnitaria}.
	 * @param ctx the parse tree
	 */
	void exitParcelaUnitaria(GrammarT3Parser.ParcelaUnitariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#parcelaNaoUnitaria}.
	 * @param ctx the parse tree
	 */
	void enterParcelaNaoUnitaria(GrammarT3Parser.ParcelaNaoUnitariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#parcelaNaoUnitaria}.
	 * @param ctx the parse tree
	 */
	void exitParcelaNaoUnitaria(GrammarT3Parser.ParcelaNaoUnitariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#expRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpRelacional(GrammarT3Parser.ExpRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#expRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpRelacional(GrammarT3Parser.ExpRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GrammarT3Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GrammarT3Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#termoLogico}.
	 * @param ctx the parse tree
	 */
	void enterTermoLogico(GrammarT3Parser.TermoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#termoLogico}.
	 * @param ctx the parse tree
	 */
	void exitTermoLogico(GrammarT3Parser.TermoLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#fatorLogico}.
	 * @param ctx the parse tree
	 */
	void enterFatorLogico(GrammarT3Parser.FatorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#fatorLogico}.
	 * @param ctx the parse tree
	 */
	void exitFatorLogico(GrammarT3Parser.FatorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarT3Parser#parcelaLogica}.
	 * @param ctx the parse tree
	 */
	void enterParcelaLogica(GrammarT3Parser.ParcelaLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarT3Parser#parcelaLogica}.
	 * @param ctx the parse tree
	 */
	void exitParcelaLogica(GrammarT3Parser.ParcelaLogicaContext ctx);
}