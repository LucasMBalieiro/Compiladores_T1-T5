package org.ufscar.compiladores;

import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.io.PrintWriter;

/*
        Analisador Semântico para o T3

        Lê arquivo de input (args[0]) e escreve no output (args[1]).
        Gera a árvore sintática e passa para o Visitor (AnalisadorSemantico)
        fazer as verificações de escopo e tipagem.
*/

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Argumentos inválidos. Executar com <entrada> e <saida>");
            return;
        }

        try (PrintWriter pw = new PrintWriter(args[1])) {
            CharStream cs = CharStreams.fromFileName(args[0]);

            GrammarT5Lexer lexer = new GrammarT5Lexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarT5Parser parser = new GrammarT5Parser(tokens);

            // =================================================================
            // FASE 1: ANÁLISE LÉXICA E SINTÁTICA
            // =================================================================

            CustomErrorListener errorListener = new CustomErrorListener(pw);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Gera a Árvore de Sintaxe Abstrata (AST)
            GrammarT5Parser.ProgramaContext arvore = parser.programa();

            // Se o listener detectou qualquer erro léxico ou sintático, 
            // a compilação DEVE parar aqui. (Os erros já foram impressos no arquivo pelo Listener)
            if (errorListener.hasError) {
                return;
            }

            // =================================================================
            // FASE 2: ANÁLISE SEMÂNTICA
            // =================================================================

            // Instancia o Visitor semântico que você construiu no T4
            AnalisadorSemantico semantico = new AnalisadorSemantico();
            semantico.visitPrograma(arvore);

            // Verifica se a lista de erros do seu SemanticoUtils possui algum item
            if (!SemanticoUtils.errosSemanticos.isEmpty()) {
                for (String erro : SemanticoUtils.errosSemanticos) {
                    pw.println(erro);
                }
                pw.println("Fim da compilacao");
                return; // Aborta antes de gerar o código C
            }

            // =================================================================
            // FASE 3: GERAÇÃO DE CÓDIGO (T5)
            // =================================================================

            // Se chegamos aqui, o código-fonte está 100% correto. 
            // Agora instanciamos o Visitor focado apenas em gerar o C.
            GeradorDeCodigoVisitor gerador = new GeradorDeCodigoVisitor();
            gerador.visitPrograma(arvore);

            // Escreve o código C final no arquivo de saída
            pw.print(gerador.codigoC.toString());

        } catch (IOException ex) {
            System.err.println("Erro ao manipular os arquivos de entrada/saída: " + ex.getMessage());
        }
    }
}