# Gerador de código - Compiladores (T5)

## Aluno / RA

### - Lucas Maciel Balieiro / 800534

## Sobre o projeto

Consiste em um **Compilador completo** (Analisador Léxico, Sintático, Semântico e Gerador de Código) construído utilizando Java e ANTLR4. 

O programa recebe como entrada um arquivo de código-fonte escrito na linguagem LA, 
realiza todas as etapas de validação estrutural e de tipagem, retornando mensagens de erro. 
Caso o código seja válido, ele é traduzido para a linguagem C.

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
java -jar T4-1.0-SNAPSHOT-jar-with-dependencies.jar ~/CAMINHO/DO/INPUT.txt ~/CAMINHO/DO/OUTPUT.txt
```
