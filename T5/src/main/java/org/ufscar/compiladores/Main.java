package org.ufscar.compiladores;

import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.io.PrintWriter;

/*
        Gerador de código (T5)

        Lê arquivo de input (args[0]) e escreve no output (args[1]).
        Retorna o código gerado em C
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

            // LÉXICA E SINTÁTICA
            CustomErrorListener errorListener = new CustomErrorListener(pw);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            GrammarT5Parser.ProgramaContext arvore = parser.programa();

            if (errorListener.hasError) {
                return;
            }

            // ANÁLISE SEMÂNTICA
            AnalisadorSemantico semantico = new AnalisadorSemantico();
            semantico.visitPrograma(arvore);

            if (!SemanticoUtils.errosSemanticos.isEmpty()) {
                for (String erro : SemanticoUtils.errosSemanticos) {
                    pw.println(erro);
                }
                pw.println("Fim da compilacao");
                return;
            }

            // GERAÇÃO DE CÓDIGO
            GeradorDeCodigoVisitor gerador = new GeradorDeCodigoVisitor();
            gerador.visitPrograma(arvore);
            pw.print(gerador.codigoC.toString());

        } catch (IOException ex) {
            System.err.println("Erro ao manipular os arquivos de entrada/saída: " + ex.getMessage());
        }
    }
}