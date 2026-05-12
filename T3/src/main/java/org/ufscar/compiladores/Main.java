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

            // Opcional: Você pode manter o seu CustomErrorListener aqui se quiser pegar
            // erros léxicos/sintáticos que possam ter sobrado, mas o foco do T3 é a semântica.
            // parser.removeErrorListeners();
            // parser.addErrorListener(new CustomErrorListener(pw));

            // Limpa a lista de erros semânticos (útil para garantir que execuções sequenciais não acumulem lixo)
            SemanticoUtils.errosSemanticos.clear();

            // 2. Executa o parser e gera a Árvore de Sintaxe Abstrata (AST) a partir da regra inicial
            GrammarT3Parser.ProgramaContext arvore = parser.programa();

            // 3. Instancia e executa o Analisador Semântico (Visitor)
            AnalisadorSemantico semantico = new AnalisadorSemantico();
            semantico.visitPrograma(arvore);

            // 4. Escreve os erros semânticos acumulados no arquivo de saída
            for (String erro : SemanticoUtils.errosSemanticos) {
                pw.println(erro);
            }

            // 5. Imprime a mensagem final exigida pela especificação
            pw.println("Fim da compilacao");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}