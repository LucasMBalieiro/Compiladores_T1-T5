package org.ufscar.compiladores;

import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.PrintWriter;


/*
        Analisador Sintatico para Tarefa 2

        Le arquivo de input (args[0]) e escreve no output (args[1])

        O analisador ainda realiza a analise lexica, agora apenas incrementado com a analise sintatica.
        O print dos erros estao sendo tratados em CustomErrorListener, onde serao escritos com base nos requisitos da tarefa
*/

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Argumentos inválidos. Executar com <entrada> e <saida>");
            return;
        }

        try (PrintWriter pw = new PrintWriter(args[1])) {

            // Le o arquivo de entrada e passa para o analisador sintatico analisar
            CharStream cs = CharStreams.fromFileName(args[0]);
            GrammarT2Parser parser = getGrammarT2Parser(cs, pw);

            parser.programa();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getter do analisador ja configurado com as mensagens de erro
    private static GrammarT2Parser getGrammarT2Parser(CharStream cs, PrintWriter pw) {

        // Inicializa o sintatico com os tokens gerados pelo lexico
        GrammarT2Lexer lexer = new GrammarT2Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarT2Parser parser = new GrammarT2Parser(tokens);

        // Remove as mensagens de erro default em ingles e adiciona erros customizados em portugues
        CustomErrorListener errorListener = new CustomErrorListener(pw);
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        return parser;
    }
}