package org.ufscar.compiladores;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.io.PrintWriter;


/*
        Analisador Lexico para Tarefa 1

        Le arquivo de input (args[0]) e escreve no output (args[1])

        O analisador escreve token a token, no formato:
            <texto, tipo do token>

        Ao reconhecer erros na leitura, a execucao para.
*/

public class Main
{
    public static void main(String[] args)
    {
        // Verificação de argumentos
        if (args.length != 2)
        {
            System.out.println("Certifique que os argumentos estejam certos (ENTRADA, SAIDA)");
            return;
        }

        String input = args[0];
        String output = args[1];

        try (PrintWriter pw = new PrintWriter(output))
        {
            CharStream cs = CharStreams.fromFileName(input);
            LexerT1 lex = new LexerT1(cs);

            Token t = null;

            // Vai ler, token a token, o arquivo inteiro, parando apenas no final do arquivo
            label:
            while ((t = lex.nextToken()).getType() != Token.EOF)
            {
                int tokenType = t.getType();

                //Linha sera escrita dependendo do token chamado
                switch (tokenType)
                {
                    //Casos de erro
                    case LexerT1.ComentarioNaoFechado:
                        pw.println("Linha " + t.getLine() + ": comentario nao fechado"); // Comentário não fechado
                        break label;
                    case LexerT1.CadeioNaoFechada:
                        pw.println("Linha " + t.getLine() + ": cadeia literal nao fechada");
                        break label;
                    case LexerT1.Erro:
                        pw.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                        break label;

                    //Casos especiais <texto,texto>
                    case LexerT1.PALAVRA_CHAVE:
                    case LexerT1.OP_REL:
                    case LexerT1.OP_ARIT:
                    case LexerT1.OP_ATR:
                    case LexerT1.OP_ACESSO:
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");
                        break;

                    //Caso default <texto,tipo token>
                    default:
                        String tokenName = LexerT1.VOCABULARY.getDisplayName(tokenType);
                        pw.println("<'" + t.getText() + "'," + tokenName + ">");
                        break;
                }
            }
        } catch (IOException ex)
        {
            System.err.println("Output nao criado: " + args[1]);
        }
    }
}