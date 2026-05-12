package org.ufscar.compiladores; // Lembre-se de ajustar o package para o do seu projeto

import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;

public class SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        for (var tl : ctx.termoLogico()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(escopos, tl);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.TermoLogicoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        for (var fl : ctx.fatorLogico()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(escopos, fl);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.FatorLogicoContext ctx) {
        return verificarTipo(escopos, ctx.parcelaLogica());
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.ParcelaLogicaContext ctx) {
        if (ctx.expRelacional() != null) {
            return verificarTipo(escopos, ctx.expRelacional());
        } else {
            // Se não tem expressão relacional, é 'verdadeiro' ou 'falso'
            return TabelaDeSimbolos.TipoLA.LOGICO;
        }
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.ExpRelacionalContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        if (ctx.OP_REL() != null) { // Tem operador relacional
            TabelaDeSimbolos.TipoLA aux1 = verificarTipo(escopos, ctx.expAritmetica(0));
            TabelaDeSimbolos.TipoLA aux2 = verificarTipo(escopos, ctx.expAritmetica(1));

            boolean aux1Numeric = aux1 == TabelaDeSimbolos.TipoLA.INTEIRO || aux1 == TabelaDeSimbolos.TipoLA.REAL;
            boolean aux2Numeric = aux2 == TabelaDeSimbolos.TipoLA.INTEIRO || aux2 == TabelaDeSimbolos.TipoLA.REAL;

            // Se ambos são numéricos ou do mesmo tipo (ex: literal == literal), a comparação relacional resulta em LÓGICO
            if ((aux1Numeric && aux2Numeric) || aux1 == aux2) {
                ret = TabelaDeSimbolos.TipoLA.LOGICO;
            } else {
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        } else {
            ret = verificarTipo(escopos, ctx.expAritmetica(0));
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.ExpAritmeticaContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        for (var ta : ctx.termo()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(escopos, ta);
            if (ret == null) {
                ret = aux;
            } else {
                boolean auxNumeric = aux == TabelaDeSimbolos.TipoLA.INTEIRO || aux == TabelaDeSimbolos.TipoLA.REAL;
                boolean retNumeric = ret == TabelaDeSimbolos.TipoLA.INTEIRO || ret == TabelaDeSimbolos.TipoLA.REAL;

                if (auxNumeric && retNumeric) {
                    // Promoção de tipo: inteiro + real = real
                    if (ret == TabelaDeSimbolos.TipoLA.REAL || aux == TabelaDeSimbolos.TipoLA.REAL) {
                        ret = TabelaDeSimbolos.TipoLA.REAL;
                    }
                } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
                    ret = TabelaDeSimbolos.TipoLA.INVALIDO;
                }
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.TermoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        for (var fa : ctx.fator()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(escopos, fa);
            if (ret == null) {
                ret = aux;
            } else {
                boolean auxNumeric = aux == TabelaDeSimbolos.TipoLA.INTEIRO || aux == TabelaDeSimbolos.TipoLA.REAL;
                boolean retNumeric = ret == TabelaDeSimbolos.TipoLA.INTEIRO || ret == TabelaDeSimbolos.TipoLA.REAL;

                if (auxNumeric && retNumeric) {
                    if (ret == TabelaDeSimbolos.TipoLA.REAL || aux == TabelaDeSimbolos.TipoLA.REAL) {
                        ret = TabelaDeSimbolos.TipoLA.REAL;
                    }
                } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
                    ret = TabelaDeSimbolos.TipoLA.INVALIDO;
                }
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.FatorContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        for (var pa : ctx.parcela()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(escopos, pa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.ParcelaContext ctx) {
        if (ctx.parcelaNaoUnitaria() != null) {
            return verificarTipo(escopos, ctx.parcelaNaoUnitaria());
        } else {
            return verificarTipo(escopos, ctx.parcelaUnitaria());
        }
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.ParcelaUnitariaContext ctx) {
        if (ctx.NUMINT() != null) return TabelaDeSimbolos.TipoLA.INTEIRO;
        if (ctx.NUMREAL() != null) return TabelaDeSimbolos.TipoLA.REAL;
        if (ctx.identificador() != null) return verificarTipo(escopos, ctx.identificador());

        if (ctx.IDENT() != null) {
            // Chamada de função
            String nomeFuncao = ctx.IDENT().getText();
            TabelaDeSimbolos.EntradaTabelaDeSimbolos func = escopos.buscar(nomeFuncao);
            if (func != null && func.categoria == TabelaDeSimbolos.Categoria.FUNCAO) {
                return func.tipo;
            }
            return TabelaDeSimbolos.TipoLA.INVALIDO;
        } else {
            // Expressão entre parênteses
            return verificarTipo(escopos, ctx.expressao(0));
        }
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.ParcelaNaoUnitariaContext ctx) {
        if (ctx.identificador() != null) {
            // Se possui '&', estamos pegando o endereço de memória de uma variável
            return TabelaDeSimbolos.TipoLA.ENDERECO;
        }
        return TabelaDeSimbolos.TipoLA.LITERAL; // É uma CADEIA
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(Escopos escopos, GrammarT3Parser.IdentificadorContext ctx) {
        String nomeVar = ctx.IDENT(0).getText();
        TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada = escopos.buscar(nomeVar);

        if (entrada == null) {
            return TabelaDeSimbolos.TipoLA.INVALIDO;
        }

        // Se o identificador tem partes separadas por ponto (ex: pessoa.idade)
        if (ctx.IDENT().size() > 1) {
            TabelaDeSimbolos tabelaAtual = entrada.camposRegistro;

            for (int i = 1; i < ctx.IDENT().size(); i++) {
                String parte = ctx.IDENT(i).getText();

                if (tabelaAtual != null && tabelaAtual.existe(parte)) {
                    entrada = tabelaAtual.verificar(parte);
                    tabelaAtual = entrada.camposRegistro; // Desce mais um nível se for um registro dentro de registro
                } else {
                    return TabelaDeSimbolos.TipoLA.INVALIDO; // Campo não existe no registro
                }
            }
        }

        return entrada.tipo;
    }
}