parser grammar Math;

options {
  tokenVocab = Primitives;
}

op_level1: OP_MULTIPLY|OP_DIVIDE|OP_MOD|OP_POWER;
op_level2: OP_PLUS|OP_MINUS;
op_level3: OP_AND|OP_OR|OP_XOR;
op_level4: OP_EQUAL|OP_NOT_EQUAL|OP_LESS|OP_LESS_EQUAL|OP_GREATER|OP_GREATER_EQUAL;
op_level5: OP_NOT;

numeric_expression
    :L_PAREN numeric_expression R_PAREN
    | numeric_expression op_level1 numeric_expression
    | numeric_expression op_level2 numeric_expression
    | NUMBER
    | get_var
    | function_call
    | OP_MINUS numeric_expression
    ;

text_expression
    : text_expression OP_PLUS text_expression
    | TEXT
    | get_var
    | function_call
    ;

logical_expression
    :   L_PAREN logical_expression R_PAREN
    |   numeric_expression op_level4 numeric_expression
    |   logical_expression op_level3 logical_expression
    |   logical_expression op_level4 logical_expression
    |   OP_NOT logical_expression
    |   BOOLEAN
    |   get_var
    |   function_call
    ;

  get_var
    : VAR_IDENTIFIER
    | get_array_element
    | get_child
    ;


  math_expression
    : get_var
    | numeric_expression
    | logical_expression
    | text_expression
    ;

  get_array_element
    : VAR_IDENTIFIER L_SQUARE numeric_expression R_SQUARE
    ;

  get_child
    : VAR_IDENTIFIER DOT VAR_IDENTIFIER
    | VAR_IDENTIFIER DOT get_array_element
    | VAR_IDENTIFIER DOT get_child
    | get_array_element DOT get_child
    | get_array_element
    | VAR_IDENTIFIER
    ;


    function_call
    : VAR_IDENTIFIER L_PAREN args? R_PAREN
    | args
    ;

   args
    : VAR_IDENTIFIER L_PAREN get_var R_PAREN
    | VAR_IDENTIFIER L_PAREN (get_var (COMMA get_var)*)? R_PAREN
    | VAR_IDENTIFIER L_PAREN (math_expression(COMMA math_expression)*)? R_PAREN
    ;

