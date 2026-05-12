package org.ufscar.compiladores;

import java.util.LinkedList;

public class Escopos {
    private LinkedList<TabelaDeSimbolos> pilhaDeEscopos;

    public Escopos() {
        pilhaDeEscopos = new LinkedList<>();
        criarNovoEscopo(); // Escopo Global
    }

    public void criarNovoEscopo() {
        pilhaDeEscopos.push(new TabelaDeSimbolos());
    }

    public TabelaDeSimbolos abandonarEscopo() {
        return pilhaDeEscopos.pop();
    }

    public TabelaDeSimbolos escopoAtual() {
        return pilhaDeEscopos.peek();
    }

    // Busca em todos os escopos, do mais interno para o mais externo
    public TabelaDeSimbolos.EntradaTabelaDeSimbolos buscar(String nome) {
        for (TabelaDeSimbolos tabela : pilhaDeEscopos) {
            if (tabela.existe(nome)) {
                return tabela.verificar(nome);
            }
        }
        return null;
    }
}