package org.ufscar.compiladores;

public class AnalisadorSemantico extends GrammarT5BaseVisitor<Void> {

    Escopos escopos = new Escopos();

    TabelaDeSimbolos.Categoria rotinaAtual = null;

    @Override
    public Void visitPrograma(GrammarT5Parser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracaoGlobal(GrammarT5Parser.DeclaracaoGlobalContext ctx) {
        String nomeRotina = ctx.IDENT().getText();

        TabelaDeSimbolos.Categoria cat = ctx.getText().startsWith("procedimento") ?
                TabelaDeSimbolos.Categoria.PROCEDIMENTO : TabelaDeSimbolos.Categoria.FUNCAO;

        TabelaDeSimbolos.EntradaTabelaDeSimbolos rotinaVar = null;

        // 1. Registra a funçao/procedimento no escopo atual
        if (escopos.escopoAtual().existe(nomeRotina)) {
            SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), nomeRotina + " ja declarado anteriormente");
        } else {
            TabelaDeSimbolos.TipoLA tipoRetorno = TabelaDeSimbolos.TipoLA.INVALIDO;
            if (cat == TabelaDeSimbolos.Categoria.FUNCAO && ctx.tipoEstendido() != null) {
                tipoRetorno = determinarTipoDeString(ctx.tipoEstendido().getText());
            }
            // Guarda a referencia da entrada
            rotinaVar = escopos.escopoAtual().adicionar(nomeRotina, tipoRetorno, cat);
        }

        escopos.criarNovoEscopo();
        rotinaAtual = cat;

        // Verifica se existem parâmetros e os adiciona no escopo local
        if (ctx.parametros() != null) {
            for (GrammarT5Parser.ParametroContext paramCtx : ctx.parametros().parametro()) {
                String tipoStr = paramCtx.tipoEstendido().getText();
                TabelaDeSimbolos.TipoLA tipoParam = determinarTipoDeString(tipoStr);

                for (GrammarT5Parser.IdentificadorContext identCtx : paramCtx.identificador()) {
                    String nomeParam = identCtx.IDENT(0).getText();

                    if (escopos.escopoAtual().existe(nomeParam)) {
                        SemanticoUtils.adicionarErroSemantico(identCtx.start, "identificador " + nomeParam + " ja declarado anteriormente");
                    } else {
                        TabelaDeSimbolos.EntradaTabelaDeSimbolos paramEntry = escopos.escopoAtual().adicionar(nomeParam, tipoParam, TabelaDeSimbolos.Categoria.VARIAVEL);

                        // Recupera os campos de registro
                        TabelaDeSimbolos.EntradaTabelaDeSimbolos tipoDeclarado = escopos.buscar(tipoStr);
                        if (tipoDeclarado != null && tipoDeclarado.categoria == TabelaDeSimbolos.Categoria.TIPO) {
                            paramEntry.nomeTipoCustomizado = tipoDeclarado.nome;
                            paramEntry.camposRegistro = tipoDeclarado.camposRegistro;
                        }

                        // Guarda na assinatura
                        if (rotinaVar != null) {
                            rotinaVar.parametrosFormais.add(paramEntry);
                        }
                    }
                }
            }
        }

        // 4. Continua a visitação
        super.visitDeclaracaoGlobal(ctx);

        // 5. Destroi o escopo local
        escopos.abandonarEscopo();
        rotinaAtual = null;

        return null;
    }

    @Override
    public Void visitDeclaracaoLocal(GrammarT5Parser.DeclaracaoLocalContext ctx) {
        TabelaDeSimbolos tabela = escopos.escopoAtual();

        if (ctx.tipo() != null) { // É uma declaração de tipo customizado
            String nomeTipo = ctx.IDENT().getText();

            if (tabela.existe(nomeTipo)) {
                SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "tipo " + nomeTipo + " declarado duas vezes num mesmo escopo");
            } else {
                TabelaDeSimbolos.EntradaTabelaDeSimbolos entradaTipo = tabela.adicionar(nomeTipo, TabelaDeSimbolos.TipoLA.REGISTRO, TabelaDeSimbolos.Categoria.TIPO);

                // Se o tipo sendo criado for um registro
                if (ctx.tipo().registro() != null) {
                    entradaTipo.camposRegistro = criarTabelaParaRegistro(ctx.tipo().registro());
                }
            }
        }
        else if (ctx.variavel() != null) { // É um 'declare'
            String tipoSintatico = ctx.variavel().tipo().getText();

            for (GrammarT5Parser.IdentificadorContext identCtx : ctx.variavel().identificador()) {
                String nomeVar = identCtx.IDENT(0).getText();

                if (tabela.existe(nomeVar)) {
                    SemanticoUtils.adicionarErroSemantico(identCtx.start, "identificador " + nomeVar + " ja declarado anteriormente");
                } else {
                    TabelaDeSimbolos.EntradaTabelaDeSimbolos tipoDeclarado = escopos.buscar(tipoSintatico);

                    // Se a variável é de um tipo customizado que já existe
                    if (tipoDeclarado != null && tipoDeclarado.categoria == TabelaDeSimbolos.Categoria.TIPO) {
                        TabelaDeSimbolos.EntradaTabelaDeSimbolos novaVar = tabela.adicionar(nomeVar, TabelaDeSimbolos.TipoLA.REGISTRO, TabelaDeSimbolos.Categoria.VARIAVEL);
                        novaVar.nomeTipoCustomizado = tipoDeclarado.nome;
                        novaVar.camposRegistro = tipoDeclarado.camposRegistro;
                    }
                    else if (ctx.variavel().tipo().registro() != null) {
                        // É um registro criado "in-line"
                        TabelaDeSimbolos.EntradaTabelaDeSimbolos novaVar = tabela.adicionar(nomeVar, TabelaDeSimbolos.TipoLA.REGISTRO, TabelaDeSimbolos.Categoria.VARIAVEL);
                        novaVar.camposRegistro = criarTabelaParaRegistro(ctx.variavel().tipo().registro());
                    }
                    else {
                        // Variável de tipo basico ou ponteiro
                        TabelaDeSimbolos.TipoLA tipo = determinarTipoDeString(tipoSintatico);
                        TabelaDeSimbolos.EntradaTabelaDeSimbolos novaVar = tabela.adicionar(nomeVar, tipo, TabelaDeSimbolos.Categoria.VARIAVEL);

                        novaVar.nomeTipoCustomizado = tipoSintatico;
                    }
                }
            }
        }
        else if (ctx.tipoBasico() != null) { // É uma 'constante'
            String nomeConst = ctx.IDENT().getText();
            if (tabela.existe(nomeConst)) {
                SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "constante " + nomeConst + " ja declarado anteriormente");
            } else {
                TabelaDeSimbolos.TipoLA tipo = determinarTipoDeString(ctx.tipoBasico().getText());
                tabela.adicionar(nomeConst, tipo, TabelaDeSimbolos.Categoria.CONSTANTE);
            }
        }

        return super.visitDeclaracaoLocal(ctx);
    }

    @Override
    public Void visitTipoBasicoIdentificador(GrammarT5Parser.TipoBasicoIdentificadorContext ctx) {
        if (ctx.IDENT() != null) {
            if (escopos.buscar(ctx.IDENT().getText()) == null) {
                SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "tipo " + ctx.IDENT().getText() + " nao declarado");
            }
        }
        return super.visitTipoBasicoIdentificador(ctx);
    }

    @Override
    public Void visitIdentificador(GrammarT5Parser.IdentificadorContext ctx) {
        if (!(ctx.getParent() instanceof GrammarT5Parser.VariavelContext) &&
                !(ctx.getParent() instanceof GrammarT5Parser.ParametroContext)) {

            String nomeCompleto = ctx.getText();

            if (SemanticoUtils.verificarTipo(escopos, ctx) == TabelaDeSimbolos.TipoLA.INVALIDO) {
                SemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeCompleto + " nao declarado");
            }
        }
        return super.visitIdentificador(ctx);
    }

    @Override
    public Void visitComandoAtribuicao(GrammarT5Parser.ComandoAtribuicaoContext ctx) {
        String textoLadoEsquerdo = ctx.identificador().getText();
        boolean isDesreferenciacao = ctx.getText().startsWith("^");
        if (isDesreferenciacao) {
            textoLadoEsquerdo = "^" + textoLadoEsquerdo;
        }

        TabelaDeSimbolos.TipoLA tipoExpressao = SemanticoUtils.verificarTipo(escopos, ctx.expressao());
        TabelaDeSimbolos.TipoLA tipoVar = SemanticoUtils.verificarTipo(escopos, ctx.identificador());
        boolean erro = false;

        if (isDesreferenciacao) {
            tipoVar = obterTipoBasePonteiro(ctx.identificador());
        }

        if (tipoVar == TabelaDeSimbolos.TipoLA.INVALIDO) {
            // A variavel a esquerda n foi declarada
            erro = false;
        } else if (tipoExpressao == TabelaDeSimbolos.TipoLA.INVALIDO) {
            // Variavel existe mas o lado direito é inválido
            erro = true;
        } else {
            boolean expNumerica = (tipoExpressao == TabelaDeSimbolos.TipoLA.INTEIRO || tipoExpressao == TabelaDeSimbolos.TipoLA.REAL);
            boolean varNumerica = (tipoVar == TabelaDeSimbolos.TipoLA.INTEIRO || tipoVar == TabelaDeSimbolos.TipoLA.REAL);

            if (expNumerica && varNumerica) {
            } else if (tipoVar == TabelaDeSimbolos.TipoLA.REGISTRO && tipoExpressao == TabelaDeSimbolos.TipoLA.REGISTRO) {
                String nomeTipoVar = obterNomeTipoCustomizado(ctx.identificador());
                String nomeTipoExp = SemanticoUtils.obterNomeTipoCustomizado(escopos, ctx.expressao());
                if (nomeTipoVar == null || !nomeTipoVar.equals(nomeTipoExp)) {
                    erro = true;
                }
            } else if (tipoExpressao != tipoVar) {
                erro = true;
            }
        }

        if (erro) {
            SemanticoUtils.adicionarErroSemantico(ctx.identificador().start, "atribuicao nao compativel para " + textoLadoEsquerdo);
        }
        return super.visitComandoAtribuicao(ctx);
    }

    @Override
    public Void visitComandoChamada(GrammarT5Parser.ComandoChamadaContext ctx) {
        String nomeRotina = ctx.IDENT().getText();
        TabelaDeSimbolos.EntradaTabelaDeSimbolos rotina = escopos.buscar(nomeRotina);

        if (rotina != null) {
            java.util.List<GrammarT5Parser.ExpressaoContext> expressoes = ctx.expressao();
            if (expressoes.size() != rotina.parametrosFormais.size()) {
                SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + nomeRotina);
            } else {
                for (int i = 0; i < expressoes.size(); i++) {
                    TabelaDeSimbolos.TipoLA tipoArg = SemanticoUtils.verificarTipo(escopos, expressoes.get(i));
                    TabelaDeSimbolos.EntradaTabelaDeSimbolos paramForm = rotina.parametrosFormais.get(i);
                    TabelaDeSimbolos.TipoLA tipoParam = paramForm.tipo;

                    boolean erroParam = false;
                    if (tipoArg != tipoParam) erroParam = true;
                    if (tipoArg == TabelaDeSimbolos.TipoLA.REGISTRO && tipoParam == TabelaDeSimbolos.TipoLA.REGISTRO) {
                        String nomeTipoArg = SemanticoUtils.obterNomeTipoCustomizado(escopos, expressoes.get(i));
                        if (paramForm.nomeTipoCustomizado == null || !paramForm.nomeTipoCustomizado.equals(nomeTipoArg)) {
                            erroParam = true;
                        } else {
                            erroParam = false;
                        }
                    }

                    if (erroParam && tipoArg != TabelaDeSimbolos.TipoLA.INVALIDO) {
                        SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + nomeRotina);
                        break;
                    }
                }
            }
        }
        return super.visitComandoChamada(ctx);
    }

    @Override
    public Void visitComandoEscreva(GrammarT5Parser.ComandoEscrevaContext ctx) {
        for (GrammarT5Parser.ExpressaoContext exp : ctx.expressao()) {
            SemanticoUtils.verificarTipo(escopos, exp);
        }
        return super.visitComandoEscreva(ctx);
    }

    @Override
    public Void visitComandoSe(GrammarT5Parser.ComandoSeContext ctx) {
        SemanticoUtils.verificarTipo(escopos, ctx.expressao());
        return super.visitComandoSe(ctx);
    }

    @Override
    public Void visitComandoEnquanto(GrammarT5Parser.ComandoEnquantoContext ctx) {
        SemanticoUtils.verificarTipo(escopos, ctx.expressao());
        return super.visitComandoEnquanto(ctx);
    }

    private TabelaDeSimbolos.TipoLA determinarTipoDeString(String tipoStr) {
        if (tipoStr.startsWith("^")) return TabelaDeSimbolos.TipoLA.ENDERECO;
        if (tipoStr.contains("literal")) return TabelaDeSimbolos.TipoLA.LITERAL;
        if (tipoStr.contains("inteiro")) return TabelaDeSimbolos.TipoLA.INTEIRO;
        if (tipoStr.contains("real")) return TabelaDeSimbolos.TipoLA.REAL;
        if (tipoStr.contains("logico")) return TabelaDeSimbolos.TipoLA.LOGICO;

        TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada = escopos.buscar(tipoStr);
        if (entrada != null && entrada.categoria == TabelaDeSimbolos.Categoria.TIPO) {
            return TabelaDeSimbolos.TipoLA.REGISTRO;
        }
        return TabelaDeSimbolos.TipoLA.INVALIDO;
    }

    @Override
    public Void visitComandoRetorne(GrammarT5Parser.ComandoRetorneContext ctx) {
        if (rotinaAtual != TabelaDeSimbolos.Categoria.FUNCAO) {
            SemanticoUtils.adicionarErroSemantico(ctx.start, "comando retorne nao permitido nesse escopo");
        }

        return super.visitComandoRetorne(ctx);
    }


    private TabelaDeSimbolos criarTabelaParaRegistro(GrammarT5Parser.RegistroContext ctx) {
        TabelaDeSimbolos tabelaCampos = new TabelaDeSimbolos();

        for (GrammarT5Parser.VariavelContext varCtx : ctx.variavel()) {
            String tipoStr = varCtx.tipo().getText();
            TabelaDeSimbolos.TipoLA tipoCampo = determinarTipoDeString(tipoStr);

            for (GrammarT5Parser.IdentificadorContext identCtx : varCtx.identificador()) {
                String nomeCampo = identCtx.IDENT(0).getText();
                tabelaCampos.adicionar(nomeCampo, tipoCampo, TabelaDeSimbolos.Categoria.VARIAVEL);
            }
        }
        return tabelaCampos;
    }


    private String obterNomeTipoCustomizado(GrammarT5Parser.IdentificadorContext ctx) {
        String nomeVar = ctx.IDENT(0).getText();
        TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada = escopos.buscar(nomeVar);
        if (entrada != null) {
            return entrada.nomeTipoCustomizado;
        }
        return null;
    }

    private TabelaDeSimbolos.TipoLA obterTipoBasePonteiro(GrammarT5Parser.IdentificadorContext ctx) {
        String nomeVar = ctx.IDENT(0).getText();
        TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada = escopos.buscar(nomeVar);
        if (entrada != null && entrada.nomeTipoCustomizado != null) {
            if (entrada.nomeTipoCustomizado.contains("inteiro")) return TabelaDeSimbolos.TipoLA.INTEIRO;
            if (entrada.nomeTipoCustomizado.contains("real")) return TabelaDeSimbolos.TipoLA.REAL;
            if (entrada.nomeTipoCustomizado.contains("logico")) return TabelaDeSimbolos.TipoLA.LOGICO;
            if (entrada.nomeTipoCustomizado.contains("literal")) return TabelaDeSimbolos.TipoLA.LITERAL;
        }
        return TabelaDeSimbolos.TipoLA.INVALIDO;
    }
}