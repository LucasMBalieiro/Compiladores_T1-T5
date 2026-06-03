package org.ufscar.compiladores;

public class GeradorDeCodigoVisitor extends GrammarT5BaseVisitor<Void> {
    public StringBuilder codigoC = new StringBuilder();

    private TabelaDeSimbolos tabela = new TabelaDeSimbolos();

    @Override
    public Void visitPrograma(GrammarT5Parser.ProgramaContext ctx) {
        codigoC.append("#include <stdio.h>\n");
        codigoC.append("#include <stdlib.h>\n");
        codigoC.append("#include <string.h>\n\n");

        if (ctx.declaracoes() != null) {
            visit(ctx.declaracoes());
            codigoC.append("\n");
        }

        codigoC.append("int main() {\n");

        if (ctx.corpo() != null) {
            visit(ctx.corpo());
        }

        codigoC.append("    return 0;\n");
        codigoC.append("}\n");

        return null;
    }

    @Override
    public Void visitDeclaracaoGlobal(GrammarT5Parser.DeclaracaoGlobalContext ctx) {
        String nomeRotina = ctx.IDENT().getText();
        boolean isFuncao = ctx.getText().startsWith("funcao");

        String tipoRetornoC = "void";
        if (isFuncao) {
            String tipoLA = ctx.tipoEstendido().getText();
            boolean isPonteiro = tipoLA.startsWith("^");
            if (isPonteiro) tipoLA = tipoLA.substring(1);

            if (tipoLA.equals("inteiro") || tipoLA.equals("logico")) tipoRetornoC = "int";
            else if (tipoLA.equals("real")) tipoRetornoC = "float";
            else if (tipoLA.equals("literal")) tipoRetornoC = "char*";

            if (isPonteiro) tipoRetornoC += "*";
        }

        codigoC.append(tipoRetornoC).append(" ").append(nomeRotina).append("(");

        if (ctx.parametros() != null) {
            boolean primeiroParametro = true;
            for (GrammarT5Parser.ParametroContext paramCtx : ctx.parametros().parametro()) {
                String tipoLAParam = paramCtx.tipoEstendido().getText();
                String tipoCParam = "";
                TabelaDeSimbolos.TipoLA tipoEnumParam = TabelaDeSimbolos.TipoLA.INVALIDO;

                boolean isPonteiro = tipoLAParam.startsWith("^");
                if (isPonteiro) tipoLAParam = tipoLAParam.substring(1);

                if (tipoLAParam.equals("inteiro") || tipoLAParam.equals("logico")) {
                    tipoCParam = "int"; tipoEnumParam = TabelaDeSimbolos.TipoLA.INTEIRO;
                } else if (tipoLAParam.equals("real")) {
                    tipoCParam = "float"; tipoEnumParam = TabelaDeSimbolos.TipoLA.REAL;
                } else if (tipoLAParam.equals("literal")) {
                    tipoCParam = "char*"; tipoEnumParam = TabelaDeSimbolos.TipoLA.LITERAL;
                }

                if (isPonteiro) tipoCParam += "*";

                if (paramCtx.getText().startsWith("var") && !tipoLAParam.equals("literal")) {
                    tipoCParam += "*";
                }

                for (GrammarT5Parser.IdentificadorContext idCtx : paramCtx.identificador()) {
                    if (!primeiroParametro) codigoC.append(", ");

                    String nomeParam = idCtx.getText();
                    codigoC.append(tipoCParam).append(" ").append(nomeParam);

                    tabela.adicionar(nomeParam, tipoEnumParam, TabelaDeSimbolos.Categoria.VARIAVEL);

                    primeiroParametro = false;
                }
            }
        }

        codigoC.append(") {\n");

        if (ctx.corpo() != null) {
            visit(ctx.corpo());
        }

        codigoC.append("}\n\n");
        return null;
    }

    @Override
    public Void visitDeclaracaoLocal(GrammarT5Parser.DeclaracaoLocalContext ctx) {
        if (ctx.variavel() != null) {
            if (ctx.variavel().tipo().registro() != null) {
                for (GrammarT5Parser.IdentificadorContext identCtx : ctx.variavel().identificador()) {
                    String nomeVar = identCtx.IDENT(0).getText();
                    String dimensao = identCtx.dimensao() != null ? identCtx.dimensao().getText() : "";

                    codigoC.append("    struct {\n");

                    TabelaDeSimbolos.EntradaTabelaDeSimbolos entradaReg = tabela.adicionar(nomeVar, TabelaDeSimbolos.TipoLA.REGISTRO, TabelaDeSimbolos.Categoria.VARIAVEL);

                    for (GrammarT5Parser.VariavelContext varInterna : ctx.variavel().tipo().registro().variavel()) {
                        String tipoLAInterno = varInterna.tipo().getText();
                        String tipoCInterno = "";
                        TabelaDeSimbolos.TipoLA tipoEnumInterno = TabelaDeSimbolos.TipoLA.INVALIDO;

                        boolean isPonteiroInterno = tipoLAInterno.startsWith("^");
                        if (isPonteiroInterno) tipoLAInterno = tipoLAInterno.substring(1);

                        if (tipoLAInterno.equals("inteiro") || tipoLAInterno.equals("logico")) {
                            tipoCInterno = "int"; tipoEnumInterno = TabelaDeSimbolos.TipoLA.INTEIRO;
                        } else if (tipoLAInterno.equals("real")) {
                            tipoCInterno = "float"; tipoEnumInterno = TabelaDeSimbolos.TipoLA.REAL;
                        } else if (tipoLAInterno.equals("literal")) {
                            tipoCInterno = "char"; tipoEnumInterno = TabelaDeSimbolos.TipoLA.LITERAL;
                        }

                        if (isPonteiroInterno) tipoCInterno += "*";

                        for (GrammarT5Parser.IdentificadorContext identIntCtx : varInterna.identificador()) {
                            String nomeCampo = identIntCtx.IDENT(0).getText();
                            String dimensaoInterna = identIntCtx.dimensao() != null ? identIntCtx.dimensao().getText() : "";

                            entradaReg.camposRegistro.adicionar(nomeCampo, tipoEnumInterno, TabelaDeSimbolos.Categoria.VARIAVEL);

                            if (tipoLAInterno.equals("literal") && !isPonteiroInterno) {
                                codigoC.append("        ").append(tipoCInterno).append(" ").append(nomeCampo).append(dimensaoInterna).append("[80];\n");
                            } else {
                                codigoC.append("        ").append(tipoCInterno).append(" ").append(nomeCampo).append(dimensaoInterna).append(";\n");
                            }
                        }
                    }
                    codigoC.append("    } ").append(nomeVar).append(dimensao).append(";\n");
                }
            }
            else {
                String tipoLA = ctx.variavel().tipo().getText();
                String tipoC = "";
                TabelaDeSimbolos.TipoLA tipoEnum = TabelaDeSimbolos.TipoLA.INVALIDO;

                boolean isPonteiro = tipoLA.startsWith("^");
                if (isPonteiro) tipoLA = tipoLA.substring(1);

                if (tipoLA.equals("inteiro") || tipoLA.equals("logico")) {
                    tipoC = "int"; tipoEnum = TabelaDeSimbolos.TipoLA.INTEIRO;
                } else if (tipoLA.equals("real")) {
                    tipoC = "float"; tipoEnum = TabelaDeSimbolos.TipoLA.REAL;
                } else if (tipoLA.equals("literal")) {
                    tipoC = "char"; tipoEnum = TabelaDeSimbolos.TipoLA.LITERAL;
                }

                TabelaDeSimbolos.EntradaTabelaDeSimbolos tipoCustomizado = null;

                // tipo customizado
                if (tipoC.isEmpty()) {
                    tipoC = tipoLA;
                    tipoCustomizado = tabela.verificar(tipoLA);
                    if (tipoCustomizado != null) {
                        tipoEnum = TabelaDeSimbolos.TipoLA.REGISTRO;
                    }
                }

                if (isPonteiro) tipoC += "*";

                for (GrammarT5Parser.IdentificadorContext identCtx : ctx.variavel().identificador()) {
                    String nomeVar = identCtx.IDENT(0).getText();
                    String dimensao = identCtx.dimensao() != null ? identCtx.dimensao().getText() : "";

                    TabelaDeSimbolos.EntradaTabelaDeSimbolos novaVar = tabela.adicionar(nomeVar, tipoEnum, TabelaDeSimbolos.Categoria.VARIAVEL);

                    if (tipoEnum == TabelaDeSimbolos.TipoLA.REGISTRO && tipoCustomizado != null) {
                        novaVar.camposRegistro = tipoCustomizado.camposRegistro;
                    }

                    if (tipoLA.equals("literal") && !isPonteiro) {
                        codigoC.append("    ").append(tipoC).append(" ").append(nomeVar).append(dimensao).append("[80];\n");
                    } else {
                        codigoC.append("    ").append(tipoC).append(" ").append(nomeVar).append(dimensao).append(";\n");
                    }
                }
            }
        }
        else if (ctx.tipoBasico() != null && ctx.valorConstante() != null) {
            String nomeConstante = ctx.IDENT().getText();
            String valor = ctx.valorConstante().getText();

            codigoC.append("#define ").append(nomeConstante).append(" ").append(valor).append("\n");

            String tipoLA = ctx.tipoBasico().getText();
            TabelaDeSimbolos.TipoLA tipoEnum = TabelaDeSimbolos.TipoLA.INTEIRO;
            if (tipoLA.equals("real")) tipoEnum = TabelaDeSimbolos.TipoLA.REAL;
            else if (tipoLA.equals("literal")) tipoEnum = TabelaDeSimbolos.TipoLA.LITERAL;

            tabela.adicionar(nomeConstante, tipoEnum, TabelaDeSimbolos.Categoria.CONSTANTE);
        }
        else if (ctx.tipo() != null && ctx.IDENT() != null && ctx.getText().startsWith("tipo")) {
            String nomeTipo = ctx.IDENT().getText();
            codigoC.append("    typedef struct {\n");

            TabelaDeSimbolos.EntradaTabelaDeSimbolos entradaTipo = tabela.adicionar(nomeTipo, TabelaDeSimbolos.TipoLA.REGISTRO, TabelaDeSimbolos.Categoria.TIPO);

            for (GrammarT5Parser.VariavelContext varInterna : ctx.tipo().registro().variavel()) {
                String tipoLAInterno = varInterna.tipo().getText();
                String tipoCInterno = "";
                TabelaDeSimbolos.TipoLA tipoEnumInterno = TabelaDeSimbolos.TipoLA.INVALIDO;

                boolean isPonteiroInterno = tipoLAInterno.startsWith("^");
                if (isPonteiroInterno) tipoLAInterno = tipoLAInterno.substring(1);

                if (tipoLAInterno.equals("inteiro") || tipoLAInterno.equals("logico")) {
                    tipoCInterno = "int"; tipoEnumInterno = TabelaDeSimbolos.TipoLA.INTEIRO;
                } else if (tipoLAInterno.equals("real")) {
                    tipoCInterno = "float"; tipoEnumInterno = TabelaDeSimbolos.TipoLA.REAL;
                } else if (tipoLAInterno.equals("literal")) {
                    tipoCInterno = "char"; tipoEnumInterno = TabelaDeSimbolos.TipoLA.LITERAL;
                }

                if (isPonteiroInterno) tipoCInterno += "*";

                for (GrammarT5Parser.IdentificadorContext identIntCtx : varInterna.identificador()) {
                    String nomeCampo = identIntCtx.IDENT(0).getText();
                    String dimensaoInterna = identIntCtx.dimensao() != null ? identIntCtx.dimensao().getText() : "";

                    entradaTipo.camposRegistro.adicionar(nomeCampo, tipoEnumInterno, TabelaDeSimbolos.Categoria.VARIAVEL);

                    if (tipoLAInterno.equals("literal") && !isPonteiroInterno) {
                        codigoC.append("        ").append(tipoCInterno).append(" ").append(nomeCampo).append(dimensaoInterna).append("[80];\n");
                    } else {
                        if (tipoCInterno.isEmpty()) tipoCInterno = tipoLAInterno;
                        codigoC.append("        ").append(tipoCInterno).append(" ").append(nomeCampo).append(dimensaoInterna).append(";\n");
                    }
                }
            }
            codigoC.append("    } ").append(nomeTipo).append(";\n");
        }

        return null;
    }

    @Override
    public Void visitComandoLeia(GrammarT5Parser.ComandoLeiaContext ctx) {
        for (GrammarT5Parser.IdentificadorContext idCtx : ctx.identificador()) {
            String nomeVar = idCtx.getText();
            TabelaDeSimbolos.TipoLA tipo = verificarTipo(nomeVar);

            if (tipo != null) {
                if (tipo == TabelaDeSimbolos.TipoLA.INTEIRO) {
                    codigoC.append("    scanf(\"%d\", &").append(nomeVar).append(");\n");
                } else if (tipo == TabelaDeSimbolos.TipoLA.REAL) {
                    codigoC.append("    scanf(\"%f\", &").append(nomeVar).append(");\n");
                } else if (tipo == TabelaDeSimbolos.TipoLA.LITERAL) {
                    codigoC.append("    fgets(").append(nomeVar).append(", 80, stdin);\n");
                    codigoC.append("    ").append(nomeVar).append("[strcspn(").append(nomeVar).append(", \"\\n\")] = 0;\n");
                }
            }
        }
        return super.visitComandoLeia(ctx);
    }

    @Override
    public Void visitComandoEscreva(GrammarT5Parser.ComandoEscrevaContext ctx) {
        for (GrammarT5Parser.ExpressaoContext expCtx : ctx.expressao()) {
            String expText = expCtx.getText();

            if (expText.startsWith("\"")) {
                codigoC.append("    printf(").append(expText).append(");\n");
            } else {
                TipoExpressaoVisitor tipoVisitor = new TipoExpressaoVisitor();
                tipoVisitor.visit(expCtx);

                if (tipoVisitor.hasLiteral) {
                    codigoC.append("    printf(\"%s\", ").append(expText).append(");\n");
                }
                else if (tipoVisitor.hasReal || expText.matches(".*\\d+\\.\\d+.*")) {
                    codigoC.append("    printf(\"%f\", ").append(expText).append(");\n");
                } else {
                    codigoC.append("    printf(\"%d\", ").append(expText).append(");\n");
                }
            }
        }
        return super.visitComandoEscreva(ctx);
    }

    private String traduzirExpressaoLogica(String expressaoLA) {
        String expC = expressaoLA;

        expC = expC.replace("=", "==");
        expC = expC.replace(">==", ">=");
        expC = expC.replace("<==", "<=");
        expC = expC.replace("!==", "!=");
        expC = expC.replace("<>", "!=");

        expC = expC.replaceAll("\\be\\b", "&&");
        expC = expC.replaceAll("\\bou\\b", "||");
        expC = expC.replaceAll("\\bnao\\b", "!");

        return expC;
    }

    @Override
    public Void visitComandoSe(GrammarT5Parser.ComandoSeContext ctx) {
        String expressao = traduzirExpressaoLogica(ctx.expressao().getText());

        codigoC.append("    if (").append(expressao).append(") {\n");

        for (GrammarT5Parser.ComandoContext cmd : ctx.cmdEntao) {
            visit(cmd);
        }
        codigoC.append("    }\n");

        if (ctx.cmdSenao != null && !ctx.cmdSenao.isEmpty()) {
            codigoC.append("    else {\n");
            for (GrammarT5Parser.ComandoContext cmd : ctx.cmdSenao) {
                visit(cmd);
            }
            codigoC.append("    }\n");
        }
        return null;
    }

    @Override
    public Void visitComandoCaso(GrammarT5Parser.ComandoCasoContext ctx) {
        String expressao = ctx.expAritmetica().getText();
        codigoC.append("    switch (").append(expressao).append(") {\n");

        for (GrammarT5Parser.ItemSelecaoContext item : ctx.itemSelecao()) {
            visit(item);
        }

        if (ctx.cmdSenao != null && !ctx.cmdSenao.isEmpty()) {
            codigoC.append("    default:\n");
            for (GrammarT5Parser.ComandoContext cmd : ctx.cmdSenao) {
                visit(cmd);
            }
        }

        codigoC.append("    }\n");
        return null;
    }

    @Override
    public Void visitComandoPara(GrammarT5Parser.ComandoParaContext ctx) {
        String varControle = ctx.IDENT().getText();
        String inicio = ctx.expAritmetica(0).getText();
        String fim = ctx.expAritmetica(1).getText();

        codigoC.append("    for (").append(varControle).append(" = ").append(inicio)
                .append("; ").append(varControle).append(" <= ").append(fim)
                .append("; ").append(varControle).append("++) {\n");

        for (GrammarT5Parser.ComandoContext cmd : ctx.comando()) {
            visit(cmd);
        }

        codigoC.append("    }\n");
        return null;
    }

    @Override
    public Void visitComandoEnquanto(GrammarT5Parser.ComandoEnquantoContext ctx) {
        String expressao = traduzirExpressaoLogica(ctx.expressao().getText());

        codigoC.append("    while (").append(expressao).append(") {\n");

        for (GrammarT5Parser.ComandoContext cmd : ctx.comando()) {
            visit(cmd);
        }

        codigoC.append("    }\n");
        return null;
    }

    @Override
    public Void visitComandoFaca(GrammarT5Parser.ComandoFacaContext ctx) {
        String expressao = traduzirExpressaoLogica(ctx.expressao().getText());

        codigoC.append("    do {\n");

        ctx.comando().forEach(this::visit);

        codigoC.append("    } while (").append(expressao).append(");\n");
        return null;
    }

    @Override
    public Void visitComandoAtribuicao(GrammarT5Parser.ComandoAtribuicaoContext ctx) {
        String variavel = ctx.identificador().getText();
        String expressao = ctx.expressao().getText();

        if (ctx.getText().startsWith("^")) {
            variavel = "*" + variavel;
        }

        String nomeBusca = variavel.replace("*", "");
        TabelaDeSimbolos.TipoLA tipo = verificarTipo(nomeBusca);

        if (tipo == TabelaDeSimbolos.TipoLA.LITERAL) {
            codigoC.append("    strcpy(").append(variavel).append(", ").append(expressao).append(");\n");
        } else {
            codigoC.append("    ").append(variavel).append(" = ").append(expressao).append(";\n");
        }
        return null;
    }

    @Override
    public Void visitComandoChamada(GrammarT5Parser.ComandoChamadaContext ctx) {
        codigoC.append("    ").append(ctx.getText()).append(";\n");
        return null;
    }

    @Override
    public Void visitComandoRetorne(GrammarT5Parser.ComandoRetorneContext ctx) {
        String expressao = ctx.expressao().getText();
        codigoC.append("    return ").append(expressao).append(";\n");
        return null;
    }

    @Override
    public Void visitItemSelecao(GrammarT5Parser.ItemSelecaoContext ctx) {
        GrammarT5Parser.ConstantesContext constantes = ctx.constantes();

        for (GrammarT5Parser.NumeroContext numeroCtx : constantes.numero()) {
            String textoNumero = numeroCtx.getText();

            if (textoNumero.contains("..")) {
                String[] limites = textoNumero.split("\\.\\.");
                int inicio = Integer.parseInt(limites[0]);
                int fim = Integer.parseInt(limites[1]);

                for (int i = inicio; i <= fim; i++) {
                    codigoC.append("        case ").append(i).append(":\n");
                }
            } else {
                codigoC.append("        case ").append(textoNumero).append(":\n");
            }
        }

        for (GrammarT5Parser.ComandoContext cmd : ctx.comando()) {
            visit(cmd);
        }

        codigoC.append("        break;\n");
        return null;
    }

    class TipoExpressaoVisitor extends GrammarT5BaseVisitor<Void> {
        boolean hasReal = false;
        boolean hasLiteral = false;

        @Override
        public Void visitIdentificador(GrammarT5Parser.IdentificadorContext ctx) {
            TabelaDeSimbolos.TipoLA tipo = verificarTipo(ctx.getText());
            if (tipo != null) {
                if (tipo == TabelaDeSimbolos.TipoLA.REAL) hasReal = true;
                if (tipo == TabelaDeSimbolos.TipoLA.LITERAL) hasLiteral = true;
            }
            return super.visitIdentificador(ctx);
        }
    }

    private TabelaDeSimbolos.TipoLA verificarTipo(String nomeVar) {
        String nomeBusca = nomeVar.replaceAll("\\[.*?\\]", "");
        String[] partes = nomeBusca.split("\\.");

        TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada = tabela.verificar(partes[0]);

        if (entrada == null) return TabelaDeSimbolos.TipoLA.INVALIDO;

        TabelaDeSimbolos tabelaAtual = entrada.camposRegistro;
        for (int i = 1; i < partes.length; i++) {
            if (tabelaAtual != null && tabelaAtual.existe(partes[i])) {
                entrada = tabelaAtual.verificar(partes[i]);
                tabelaAtual = entrada.camposRegistro;
            } else {
                return TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return entrada.tipo;
    }
}