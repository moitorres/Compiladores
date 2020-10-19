grammar TAC;
prog:	(statement NEWLINE)* ;

    statement:  assign
         | assignArray
         | goTo
         | ifFalse
         | ifFalseArray
         | ifTrue
         | ifTrueArray
         | print
         | printArray
         ;

    operando: ID | INT;

    assign: (ID ':')? ID '=' operando
          | (ID ':')? ID '=' operando operador operando
          ;

    assignArray: (ID ':')? ID '[' operando ']' '=' operando
         |  (ID ':')? ID '=' ID '[' operando ']';

    goTo:  (ID ':')? 'goto' ID;

    ifFalse: (ID ':')? 'ifFalse' operando 'goto' ID;

    ifFalseArray: (ID ':')? 'ifFalse' ID '[' operando ']' 'goto' ID;

    ifTrue: (ID ':')? 'ifTrue' operando 'goto' ID;

    ifTrueArray: (ID ':')? 'ifTrue' ID '[' operando ']' 'goto' ID;

    print: (ID ':')? 'print(' operando ')';

    printArray: (ID ':')? 'print(' ID '[' operando '])';

    operador: '+' | '-' | '*' | '/' | '<' | '==' | '&&' | '||';

NEWLINE : [\n\r]+ ;
INT     : DIGIT+ ;
DIGIT   : [0-9];
ID      : LETTER (DIGIT | LETTER)*;
LETTER  : [A-Za-z];
WS      : [ \n\t\r]+ -> skip;