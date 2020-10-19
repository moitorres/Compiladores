grammar TAC;
prog:	(statement NEWLINE)* ;

    statement:  assign
         | assignArray
         | goTo
         | ifFalse
         | ifTrue
         | print
         ;

    operando: ID | INT;

    assign: (ID ':')? ID '=' operando
          | (ID ':')? ID '=' operando operador operando
          ;

    assignArray: (ID ':')? ID '[' operando ']' '=' operando
         |  (ID ':')? ID '=' ID '[' operando ']';

    goTo:  (ID ':')? 'goto' ID;

    ifFalse: (ID ':')? 'ifFalse' operando 'goto' ID;

    ifTrue: (ID ':')? 'ifTrue' operando 'goto' ID;

    print: (ID ':')? 'print(' operando ')';

    operador: '+' | '-' | '*' | '/' | '<' | '==' | '&&' | '||';

NEWLINE : [\n\r]+ ;
INT     : DIGIT+ ;
DIGIT   : [0-9];
ID      : LETTER (DIGIT | LETTER)*;
LETTER  : [A-Za-z];
WS      : [ \n\t\r]+ -> skip;