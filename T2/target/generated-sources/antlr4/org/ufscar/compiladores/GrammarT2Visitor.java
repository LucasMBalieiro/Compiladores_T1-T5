// Generated from org/ufscar/compiladores/GrammarT2.g4 by ANTLR 4.13.1
package org.ufscar.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarT2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarT2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GrammarT2Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(GrammarT2Parser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#declaracaoLocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoLocal(GrammarT2Parser.DeclaracaoLocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoGlobal(GrammarT2Parser.DeclaracaoGlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GrammarT2Parser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(GrammarT2Parser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(GrammarT2Parser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GrammarT2Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#tipoBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBasico(GrammarT2Parser.TipoBasicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#tipoBasicoIdentificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBasicoIdentificador(GrammarT2Parser.TipoBasicoIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#tipoEstendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEstendido(GrammarT2Parser.TipoEstendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#valorConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorConstante(GrammarT2Parser.ValorConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(GrammarT2Parser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(GrammarT2Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(GrammarT2Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(GrammarT2Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoLeia}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLeia(GrammarT2Parser.ComandoLeiaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoEscreva}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEscreva(GrammarT2Parser.ComandoEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoSe}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSe(GrammarT2Parser.ComandoSeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoCaso}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCaso(GrammarT2Parser.ComandoCasoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoPara}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPara(GrammarT2Parser.ComandoParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoEnquanto}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEnquanto(GrammarT2Parser.ComandoEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoFaca}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoFaca(GrammarT2Parser.ComandoFacaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(GrammarT2Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoChamada}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoChamada(GrammarT2Parser.ComandoChamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoRetorne}
	 * labeled alternative in {@link GrammarT2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRetorne(GrammarT2Parser.ComandoRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#itemSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemSelecao(GrammarT2Parser.ItemSelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(GrammarT2Parser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(GrammarT2Parser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(GrammarT2Parser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(GrammarT2Parser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#paridade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParidade(GrammarT2Parser.ParidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(GrammarT2Parser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#parcelaUnitaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaUnitaria(GrammarT2Parser.ParcelaUnitariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#parcelaNaoUnitaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaNaoUnitaria(GrammarT2Parser.ParcelaNaoUnitariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#expAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAritmetica(GrammarT2Parser.ExpAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#expRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRelacional(GrammarT2Parser.ExpRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GrammarT2Parser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#termoLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoLogico(GrammarT2Parser.TermoLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#fatorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorLogico(GrammarT2Parser.FatorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarT2Parser#parcelaLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaLogica(GrammarT2Parser.ParcelaLogicaContext ctx);
}