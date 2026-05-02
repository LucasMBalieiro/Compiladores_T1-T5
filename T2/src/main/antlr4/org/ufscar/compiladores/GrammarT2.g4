grammar GrammarT2;

// ---- SINTATICO --- //

programa: declaracoes 'algoritmo' corpo 'fim_algoritmo' EOF;

declaracoes: (declaracaoLocal | declaracaoGlobal)*;

declaracaoLocal: 'declare' variavel
    | 'constante' IDENT ':' tipoBasico '=' valorConstante
    | 'tipo' IDENT ':' tipo;

declaracaoGlobal: 'procedimento' IDENT '(' parametros? ')' corpo 'fim_procedimento'
    | 'funcao' IDENT '(' parametros? ')' ':' tipoEstendido corpo 'fim_funcao';

variavel: identificador (',' identificador)* ':' tipo;

identificador: IDENT ('.' IDENT)* dimensao;

dimensao: ('[' expAritmetica ']')*;

tipo: registro | tipoEstendido;

tipoBasico: 'literal' | 'inteiro' | 'real' | 'logico';

tipoBasicoIdentificador: tipoBasico | IDENT;

tipoEstendido: '^'? tipoBasicoIdentificador;

valorConstante: CADEIA | NUMINT | NUMREAL | 'verdadeiro' | 'falso';

registro: 'registro' variavel* 'fim_registro';

parametro: 'var'? identificador (',' identificador)* ':' tipoEstendido;

parametros: parametro (',' parametro)*;

corpo: declaracaoLocal* comando*;


comando: 'leia' '(' '^'? identificador (',' '^'? identificador)* ')'                        # ComandoLeia
       | 'escreva' '(' expressao (',' expressao)* ')'                                       # ComandoEscreva
       | 'se' expressao 'entao' comando* ('senao' comando*)? 'fim_se'                       # ComandoSe
       | 'caso' expAritmetica 'seja' itemSelecao* ('senao' comando*)? 'fim_caso'            # ComandoCaso
       | 'para' IDENT '<-' expAritmetica 'ate' expAritmetica 'faca' comando* 'fim_para'     # ComandoPara
       | 'enquanto' expressao 'faca' comando* 'fim_enquanto'                                # ComandoEnquanto
       | 'faca' comando* 'ate' expressao                                                    # ComandoFaca
       | '^'? identificador '<-' expressao                                                  # ComandoAtribuicao
       | IDENT '(' (expressao (',' expressao)*)? ')'                                        # ComandoChamada
       | 'retorne' expressao                                                                # ComandoRetorne
       ;

itemSelecao: constantes ':' comando*;

constantes: numero (',' numero)*;

numero: paridade? NUMINT ( '..' paridade? NUMINT)?;

// Using the professor's Lexer approach for operators!
expAritmetica: termo (OP_ARIT1 termo)*;
termo: fator (OP_ARIT2 fator)*;
fator: parcela (OP_ARIT3 parcela)*;

paridade: '-';

parcela: paridade? parcelaUnitaria | parcelaNaoUnitaria;

parcelaUnitaria: '^'? identificador
    | IDENT '(' (expressao (',' expressao)*)? ')'
    | NUMINT
    | NUMREAL
    | '(' expressao ')';

parcelaNaoUnitaria: '&' identificador | CADEIA;

expRelacional: expAritmetica (OP_REL expAritmetica)?;

expressao: termoLogico (OP_BOOL_OU termoLogico)*;
termoLogico: fatorLogico (OP_BOOL_E fatorLogico)*;
fatorLogico: 'nao'? parcelaLogica;
parcelaLogica: 'verdadeiro' | 'falso' | expRelacional;


// ---- LEXICO --- //

//Operadores
OP_ARIT1: '+' | '-';
OP_ARIT2: '*' | '/';
OP_ARIT3: '%';
OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';
OP_BOOL_OU: 'ou';
OP_BOOL_E: 'e';

//Variaveis
IDENT: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

//Numeros
NUMINT: ('0'..'9')+;
NUMREAL: ('0'..'9')+ '.' ('0'..'9')+;

//Strings e comentarios devem iniciar e fechar na mesma linha
CADEIA: '"' ~('"' | '\r' | '\n')* '"';
COMENTARIO: '{' ~('\r' | '\n' | '}')* '}' -> skip;

//Skippar espacos e quebras de linha
WS: (' ' | '\t' | '\r' | '\n') -> skip;

// ESC
fragment ESC_SEQ : '\\\'';

//Erros
CADEIANAOFECHADA: '"' ~('"' | '\r' | '\n')*;
COMENTARIONAOFECHADO: '{' ~('}' | '\r' | '\n')*;
ERRO: . ;