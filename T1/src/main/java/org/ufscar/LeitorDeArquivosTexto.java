package org.ufscar;

import java.io.*;

public class LeitorDeArquivosTexto
{
    private final static int TAMANHO_BUFFER = 20;

    private InputStream is;

    private int [] buffer;
    private int bufferAtual;
    private int ponteiro;

    private int inicioLexema;
    private String lexema;


    public LeitorDeArquivosTexto(String arquivo) {
        try {
            is = new FileInputStream(new File(arquivo));
            InicializarBuffer();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void IncrementarPonteiro(){
        ponteiro++;
        if(ponteiro == TAMANHO_BUFFER){
            RecarregarBuffer2();
        }else if(ponteiro == TAMANHO_BUFFER * 2){
            RecarregarBuffer1();
            ponteiro = 0;
        }
    }

    private void InicializarBuffer()
    {
        bufferAtual = 2;
        inicioLexema = 0;
        lexema = "";
        buffer = new int[TAMANHO_BUFFER * 2];
        ponteiro = 0;

        RecarregarBuffer1();
    }

    private void RecarregarBuffer1() {
        if(bufferAtual == 2){

            bufferAtual = 1;

            for (int i = 0; i < TAMANHO_BUFFER; i++) {
                try {
                    buffer[i] = is.read();

                    if (buffer[i] == -1) {
                        break;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void RecarregarBuffer2(){

        if(bufferAtual == 1) {

            bufferAtual = 2;

            for (int i = TAMANHO_BUFFER; i < TAMANHO_BUFFER * 2; i++) {
                try {
                    buffer[i] = is.read();

                    if (buffer[i] == -1) {
                        break;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private int LerCaractereDoBuffer()
    {
        int ret = buffer[ponteiro];
        IncrementarPonteiro();
        return ret;
    }

    public int LerProximoCaractere()
    {
        int c = LerCaractereDoBuffer();
        lexema += (char)c;
        return c;
    }

    public void RetrocederPonteiro()
    {
        ponteiro--;
        lexema = lexema.substring(0, lexema.length()-1);
        if(ponteiro < 0)
        {
            ponteiro = (TAMANHO_BUFFER * 2) -1;
        }
    }

    public void Zerar()
    {
        ponteiro = inicioLexema;
        lexema = "";
    }

    public void Confirmar()
    {
        inicioLexema = ponteiro;
        lexema = "";
    }

    public String GetLexema()
    {
        return lexema;
    }
}
