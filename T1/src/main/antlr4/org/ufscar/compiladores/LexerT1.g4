lexer grammar LexerT1;

PALAVRA_CHAVE: 'algoritmo'| 'fim_algoritmo' | 'declare' | 'leia' | 'escreva' |
               'se' | 'fim_se' |  'entao' | 'senao' | 'e' | 'ou' | 'nao' |
               'caso' | 'fim_caso' | 'seja' | 'para' | 'fim_para' |
               'tipo' | 'var' | 'inteiro' | 'literal'  | 'constante' | 'logico' | 'real' | 'falso' | 'verdadeiro' |
               'registro' | 'fim_registro' | 'procedimento' | 'fim_procedimento' |
               'enquanto' | 'fim_enquanto' | 'ate' | 'faca' |
               'funcao' | 'fim_funcao' | 'retorne';

//Variaveis
IDENT: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

//Numeros
NUMINT: ('0'..'9')+;
NUMREAL: ('0'..'9')+ '.' ('0'..'9')+;

//Strings e comentarios devem iniciar e fechar na mesma linha
CADEIA: '"' ~('"' | '\r' | '\n')* '"';
COMENTARIO: '{' ~('\r' | '\n' | '}')* '}' -> skip;

//Operadores
OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';
OP_ARIT : '+' | '-' | '*' | '/' | '&' | '%' | '^';
OP_ATR: '<-';
OP_ACESSO: '.';

DELIM: ':';
VIRGULA: ',';
DOIS_PONTOS: '..';

ABRE_PAR : '(';
FECHA_PAR: ')';
ABRE_COL : '[';
FECHA_COL : ']';

//Skippar espacos e quebras de linha
WS: (' ' | '\t' | '\r' | '\n') -> skip;

//Erros
CadeioNaoFechada: '"' ~('"' | '\r' | '\n')*;
ComentarioNaoFechado: '{' ~('}' | '\r' | '\n')*;
Erro: . ;