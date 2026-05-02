# Analisador Sintático - Compiladores (T2)

## Aluno / RA

### - Lucas Maciel Balieiro / 800534

## Sobre o projeto

Consiste em um **Analisador Sintático** construído utilizando **Java** e **ANTLR4**.

O programa recebe como entrada um arquivo de código-fonte escrito na linguagem LA (Linguagem Algorítmica)
 e realiza a análise sintática e léxica sobre o programa, retornando mensagens de erro 
caso um seja encontrado no meio da execução.

## Pré-requisitos
* **Java Development Kit (JDK):** Versão 21 (ou compatível configurada no `pom.xml`)
* **Apache Maven:** Versão 3.6 ou superior

## Como Compilar e Rodar

Abra o terminal na raiz do projeto e execute o comando:
```bash
mvn clean package
```

Depois execute o programa passando também o caminho para o arquivo de entrada (linguagem LA) e também o caminho onde será escrita a saida.

```bash
java -jar T2-1.0-SNAPSHOT-jar-with-dependencies.jar ~/CAMINHO/DO/INPUT.txt ~/CAMINHO/DO/OUTPUT.txt
```