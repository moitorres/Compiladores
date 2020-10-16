grammar TAC;
prog:	(statement NEWLINE)* ;

    statement:  assign
         | goTo
         | ifFalse
         | ifTrue
         | print
         ;

    assign: (ID ':')? ID '=' operando operador operando
         |  (ID ':')? ID '=' operando
         |  (ID ':')? ID '[' operando ']' '=' operando
         |  (ID ':')? ID '=' ID '[' operando ']'
         ;

    goTo:  (ID ':')? 'goto' ID;

    ifFalse: (ID ':')? 'ifFalse' ID 'goto' ID;

    ifTrue: (ID ':')? 'ifTrue' ID 'goto' ID;

    print: (ID ':')? 'print(' ID ')';

    operador: '*'| '/' | '+' | '-' | '<' | '==' | '&&' | '||';

    operando: ID | INT;

NEWLINE : [\n\r]+ ;
INT     : DIGIT+ ;
DIGIT   : [0-9];
ID      : LETTER (DIGIT | LETTER)*;
LETTER  : [A-Za-z];
WS      : [ \n\t\r]+ -> skip;