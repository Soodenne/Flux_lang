lexer grammar Primitives;
// text = text;
TEXT: '"' ~["]* '"' | '\'' .*? '\'';
TEXT_TYPE: 'text';

BOOLEAN: 'true' | 'false';
BOOLEAN_TYPE: 'boolean';


NUMBER  : '-'? [0-9]+ ('.' [0-9]*)? ;
NUMBER_TYPE: 'num';


NULL : 'na' ;

DIGIT: [0-9];
OCTET:
	'0'
	| ([1-9] DIGIT?) // 1 to 99
	| '1' DIGIT DIGIT // 100 to 199
	| '2' [0-4] DIGIT // 200 to 249
	| '25' [0-5]; // 250 to 255
IPV4: OCTET '.' OCTET '.' OCTET '.' OCTET;
IPV4_TYPE: 'ipv4';


LOOP: 'loop';
IF: 'if';
ELSE: 'else';
FUNC: 'fun';
RETURN: 'return';
RETURN_TYPE: '->';

L_BLOCK: '{';
R_BLOCK: '}';
L_PAREN: '(';
R_PAREN: ')';
L_SQUARE: '[';
R_SQUARE: ']';
DOT: '.';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
AT: '@';

// operators
OP_PLUS: '+';
OP_MINUS: '-';
OP_MULTIPLY: '*';
OP_DIVIDE: '/';
OP_MOD: '%';
OP_POWER: '^';
OP_EQUAL: '=';
OP_NOT_EQUAL: '!=';
OP_LESS: '<';
OP_GREATER: '>';
OP_LESS_EQUAL: '<=';
OP_GREATER_EQUAL: '>=';
OP_AND: 'and';
OP_OR: 'or';
OP_XOR: 'xor';
OP_NOT: 'not';

// operator --, = , +=, -=, *=, /=, %=
OP_INCREMENT: '++';
OP_DECREMENT: '--';


VAR_IDENTIFIER : [a-z][a-zA-Z0-9]* ;
COMMON_IDENTIFIER : [A-Z][a-zA-Z0-9]* ;

NEWLINE : '\r'? '\n' ;
WS: [ \t\r\n]+ -> skip;