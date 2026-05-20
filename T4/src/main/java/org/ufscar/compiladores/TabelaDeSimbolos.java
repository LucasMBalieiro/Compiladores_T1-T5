package org.ufscar.compiladores;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum TipoLA { INTEIRO, REAL, LITERAL, LOGICO, REGISTRO, ENDERECO, INVALIDO }
    public enum Categoria { VARIAVEL, CONSTANTE, PROCEDIMENTO, FUNCAO, TIPO }

    public class EntradaTabelaDeSimbolos {
        public String nome;
        public TipoLA tipo;
        public Categoria categoria;

        // Estruturas exclusivas para Registros e Tipos Customizados
        public TabelaDeSimbolos camposRegistro;
        public String nomeTipoCustomizado;

        public EntradaTabelaDeSimbolos() {
            this.camposRegistro = new TabelaDeSimbolos(); // Já inicializa a sub-tabela
        }
    }

    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    // Retorna a entrada criada para podermos manipular seus camposRegistro logo em seguida
    public EntradaTabelaDeSimbolos adicionar(String nome, TipoLA tipo, Categoria categoria) {
        EntradaTabelaDeSimbolos entrada = new EntradaTabelaDeSimbolos();
        entrada.nome = nome;
        entrada.tipo = tipo;
        entrada.categoria = categoria;
        tabela.put(nome, entrada);
        return entrada;
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public EntradaTabelaDeSimbolos verificar(String nome) {
        return tabela.get(nome);
    }
}