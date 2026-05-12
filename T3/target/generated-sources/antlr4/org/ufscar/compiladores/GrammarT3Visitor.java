// Generated from org/ufscar/compiladores/GrammarT3.g4 by ANTLR 4.13.1
package org.ufscar.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarT3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarT3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GrammarT3Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(GrammarT3Parser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#declaracaoLocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoLocal(GrammarT3Parser.DeclaracaoLocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoGlobal(GrammarT3Parser.DeclaracaoGlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GrammarT3Parser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(GrammarT3Parser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(GrammarT3Parser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GrammarT3Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#tipoBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBasico(GrammarT3Parser.TipoBasicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#tipoBasicoIdentificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBasicoIdentificador(GrammarT3Parser.TipoBasicoIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#tipoEstendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEstendido(GrammarT3Parser.TipoEstendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#valorConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorConstante(GrammarT3Parser.ValorConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(GrammarT3Parser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(GrammarT3Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(GrammarT3Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(GrammarT3Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoLeia}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLeia(GrammarT3Parser.ComandoLeiaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoEscreva}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEscreva(GrammarT3Parser.ComandoEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoSe}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSe(GrammarT3Parser.ComandoSeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoCaso}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCaso(GrammarT3Parser.ComandoCasoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoPara}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPara(GrammarT3Parser.ComandoParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoEnquanto}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEnquanto(GrammarT3Parser.ComandoEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoFaca}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoFaca(GrammarT3Parser.ComandoFacaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(GrammarT3Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoChamada}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoChamada(GrammarT3Parser.ComandoChamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoRetorne}
	 * labeled alternative in {@link GrammarT3Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRetorne(GrammarT3Parser.ComandoRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#itemSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemSelecao(GrammarT3Parser.ItemSelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(GrammarT3Parser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(GrammarT3Parser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#expAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAritmetica(GrammarT3Parser.ExpAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(GrammarT3Parser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(GrammarT3Parser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#paridade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParidade(GrammarT3Parser.ParidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(GrammarT3Parser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#parcelaUnitaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaUnitaria(GrammarT3Parser.ParcelaUnitariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#parcelaNaoUnitaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaNaoUnitaria(GrammarT3Parser.ParcelaNaoUnitariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#expRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRelacional(GrammarT3Parser.ExpRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GrammarT3Parser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#termoLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoLogico(GrammarT3Parser.TermoLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#fatorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorLogico(GrammarT3Parser.FatorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT3Parser#parcelaLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaLogica(GrammarT3Parser.ParcelaLogicaContext ctx);
}