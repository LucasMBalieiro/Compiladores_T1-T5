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

            // 1. Configuração do Lexer e Parser
            CharStream cs = CharStreams.fromFileName(args[0]);
            GrammarT3Lexer lexer = new GrammarT3Lexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarT3Parser parser = new GrammarT3Parser(tokens);

            // Limpa a lista de erros semânticos
            SemanticoUtils.errosSemanticos.clear();

            // 2. Executa o parser e gera a arvore
            GrammarT3Parser.ProgramaContext arvore = parser.programa();

            // 3. Instancia e executa o semantico
            AnalisadorSemantico semantico = new AnalisadorSemantico();
            semantico.visitPrograma(arvore);

            // 4. Escreve os erros semanticos acumulados no arquivo de saída
            for (String erro : SemanticoUtils.errosSemanticos) {
                pw.println(erro);
            }

            pw.println("Fim da compilacao");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}