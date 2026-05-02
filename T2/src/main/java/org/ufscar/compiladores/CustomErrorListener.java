package org.ufscar.compiladores;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import java.io.PrintWriter;


/*
        Tratamento de erros customizados com base nos pedidos da tarefa

        Todos os tratamentos de erros do analisador foram simplificados apenas a estes presentes nessa classe
*/

public class CustomErrorListener extends BaseErrorListener {

    PrintWriter pw;
    boolean hasError = false;

    public CustomErrorListener(PrintWriter pw) {
        this.pw = pw;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        if (hasError) return;

        Token t = (Token) offendingSymbol;
        String text = t.getText();

        // Checagem de erros lexicos (T1)
        if (t.getType() == GrammarT2Lexer.ERRO) {
            pw.println("Linha " + line + ": " + text + " - simbolo nao identificado");
        }
        else if (t.getType() == GrammarT2Lexer.CADEIANAOFECHADA) {
            pw.println("Linha " + line + ": cadeia literal nao fechada");
        }
        else if (t.getType() == GrammarT2Lexer.COMENTARIONAOFECHADO) {
            pw.println("Linha " + line + ": comentario nao fechado");
        }
        // Checagem de erros sintaticos
        else {
            if (text.equals("<EOF>")) {
                text = "EOF";
            }
            pw.println("Linha " + line + ": erro sintatico proximo a " + text);
        }

        pw.println("Fim da compilacao");
        hasError = true;
    }
}