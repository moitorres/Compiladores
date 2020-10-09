grammar tac;
prog:	(expr NEWLINE)* ;
     expr:	LETTER '=' INT ('*'| '/' | '+' | '-' | '<' | '==' | '&&' | '||') INT
         |  ID ':' LETTER '=' INT ('*'| '/' | '+' | '-' | '<' | '==' | '&&' | '||') INT

         ;
NEWLINE : [\n\r]+ ;
INT     : DIGIT+ ;
DIGIT   : [0-9];
ID      : LETTER (DIGIT | LETTER)*;
LETTER  : [A-Za-z];
WS      : [ \n\t\r]+ -> skip;