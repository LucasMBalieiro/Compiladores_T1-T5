package org.ufscar.compiladores;

public class AnalisadorSemantico extends GrammarT4BaseVisitor<Void> {

    Escopos escopos = new Escopos();

    @Override
    public Void visitPrograma(GrammarT4Parser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracaoGlobal(GrammarT4Parser.DeclaracaoGlobalContext ctx) {
        String nomeRotina = ctx.IDENT().getText();

        // 1. Registra a função/procedimento no escopo atual (Global)
        if (escopos.escopoAtual().existe(nomeRotina)) {
            SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), nomeRotina + " ja declarado anteriormente");
        } else {
            TabelaDeSimbolos.Categoria cat = ctx.getText().startsWith("procedimento") ?
                    TabelaDeSimbolos.Categoria.PROCEDIMENTO : TabelaDeSimbolos.Categoria.FUNCAO;

            // Se for uma função, extraímos o tipo de retorno para validar o comando 'retorne' depois
            TabelaDeSimbolos.TipoLA tipoRetorno = TabelaDeSimbolos.TipoLA.INVALIDO;
            if (cat == TabelaDeSimbolos.Categoria.FUNCAO && ctx.tipoEstendido() != null) {
                tipoRetorno = determinarTipoDeString(ctx.tipoEstendido().getText());
            }

            escopos.escopoAtual().adicionar(nomeRotina, tipoRetorno, cat);
        }

        // 2. Cria o NOVO escopo para a rotina
        escopos.criarNovoEscopo();

        // 3. Verifica se existem parâmetros e os adiciona no escopo local
        if (ctx.parametros() != null) {
            for (GrammarT4Parser.ParametroContext paramCtx : ctx.parametros().parametro()) {
                // Pega o tipo declarado
                String tipoStr = paramCtx.tipoEstendido().getText();
                TabelaDeSimbolos.TipoLA tipoParam = determinarTipoDeString(tipoStr);

                for (GrammarT4Parser.IdentificadorContext identCtx : paramCtx.identificador()) {
                    String nomeParam = identCtx.IDENT(0).getText();

                    // Adiciona o paramwtro na tabela local
                    if (escopos.escopoAtual().existe(nomeParam)) {
                        SemanticoUtils.adicionarErroSemantico(identCtx.start, "identificador " + nomeParam + " ja declarado anteriormente");
                    } else {
                        escopos.escopoAtual().adicionar(nomeParam, tipoParam, TabelaDeSimbolos.Categoria.VARIAVEL);
                    }
                }
            }
        }

        // 4. Continua a visitação
        super.visitDeclaracaoGlobal(ctx);

        // 5. Destroi o escopo local ao sair da rotina
        escopos.abandonarEscopo();

        return null;
    }

    @Override
    public Void visitDeclaracaoLocal(GrammarT4Parser.DeclaracaoLocalContext ctx) {
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

            for (GrammarT4Parser.IdentificadorContext identCtx : ctx.variavel().identificador()) {
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
                        // Variável de tipo básico
                        TabelaDeSimbolos.TipoLA tipo = determinarTipoDeString(tipoSintatico);
                        tabela.adicionar(nomeVar, tipo, TabelaDeSimbolos.Categoria.VARIAVEL);
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
    public Void visitTipoBasicoIdentificador(GrammarT4Parser.TipoBasicoIdentificadorContext ctx) {
        if (ctx.IDENT() != null) {
            if (escopos.buscar(ctx.IDENT().getText()) == null) {
                SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "tipo " + ctx.IDENT().getText() + " nao declarado");
            }
        }
        return super.visitTipoBasicoIdentificador(ctx);
    }

    // Ignora a checagem se o identificador estiver dentro de uma declaração de variável ou parâmetro.
    @Override
    public Void visitIdentificador(GrammarT4Parser.IdentificadorContext ctx) {
        if (!(ctx.getParent() instanceof GrammarT4Parser.VariavelContext) &&
                !(ctx.getParent() instanceof GrammarT4Parser.ParametroContext)) {

            String nomeVar = ctx.IDENT(0).getText();

            // Verifica se a variável foi declarada
            if (escopos.buscar(nomeVar) == null) {
                SemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeVar + " nao declarado");
            }
        }

        return super.visitIdentificador(ctx);
    }

    @Override
    public Void visitComandoAtribuicao(GrammarT4Parser.ComandoAtribuicaoContext ctx) {
        String nomeVar = ctx.identificador().getText();

        TabelaDeSimbolos.TipoLA tipoExpressao = SemanticoUtils.verificarTipo(escopos, ctx.expressao());
        boolean erro = false;

        if (tipoExpressao != TabelaDeSimbolos.TipoLA.INVALIDO) {
            TabelaDeSimbolos.TipoLA tipoVar = SemanticoUtils.verificarTipo(escopos, ctx.identificador());

            if (tipoVar != TabelaDeSimbolos.TipoLA.INVALIDO) {
                boolean expNumerica = (tipoExpressao == TabelaDeSimbolos.TipoLA.INTEIRO || tipoExpressao == TabelaDeSimbolos.TipoLA.REAL);
                boolean varNumerica = (tipoVar == TabelaDeSimbolos.TipoLA.INTEIRO || tipoVar == TabelaDeSimbolos.TipoLA.REAL);

                // Erro 4: Se não forem ambos numéricos e forem de tipos diferentes, é incompatível.
                if (!(expNumerica && varNumerica) && tipoExpressao != tipoVar) {
                    erro = true;
                }
            } else {
                erro = false;
            }
        } else {
            erro = true;
        }

        if (erro) {
            SemanticoUtils.adicionarErroSemantico(ctx.identificador().start, "atribuicao nao compativel para " + nomeVar);
        }

        return super.visitComandoAtribuicao(ctx);
    }

    private TabelaDeSimbolos criarTabelaParaRegistro(GrammarT4Parser.RegistroContext ctx) {
        TabelaDeSimbolos tabelaCampos = new TabelaDeSimbolos();

        for (GrammarT4Parser.VariavelContext varCtx : ctx.variavel()) {
            String tipoStr = varCtx.tipo().getText();
            TabelaDeSimbolos.TipoLA tipoCampo = determinarTipoDeString(tipoStr);

            for (GrammarT4Parser.IdentificadorContext identCtx : varCtx.identificador()) {
                String nomeCampo = identCtx.IDENT(0).getText();
                tabelaCampos.adicionar(nomeCampo, tipoCampo, TabelaDeSimbolos.Categoria.VARIAVEL);
            }
        }
        return tabelaCampos;
    }

    private TabelaDeSimbolos.TipoLA determinarTipoDeString(String tipoStr) {
        // Verifica ponteiros primeiro
        if (tipoStr.startsWith("^")) {
            return TabelaDeSimbolos.TipoLA.ENDERECO;
        }

        if (tipoStr.contains("literal")) return TabelaDeSimbolos.TipoLA.LITERAL;
        if (tipoStr.contains("inteiro")) return TabelaDeSimbolos.TipoLA.INTEIRO;
        if (tipoStr.contains("real")) return TabelaDeSimbolos.TipoLA.REAL;
        if (tipoStr.contains("logico")) return TabelaDeSimbolos.TipoLA.LOGICO;

        return TabelaDeSimbolos.TipoLA.INVALIDO;
    }
}