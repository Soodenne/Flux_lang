parser grammar Variables;
import Math;

options {
    tokenVocab = Primitives;
}


var_type
    : TEXT_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | IPV4_TYPE
    ;


var_name
    : VAR_IDENTIFIER
    ;

var_value
    : IPV4
    | TEXT
    | NUMBER
    | BOOLEAN
    ;
op_one_expression
  : OP_INCREMENT
  | OP_DECREMENT

  ;

op_one_declaration
  : var_name OP_INCREMENT
  | var_name OP_DECREMENT
  | OP_INCREMENT var_name
  | OP_DECREMENT var_name
  | NUMBER_TYPE var_name OP_INCREMENT
  | NUMBER_TYPE var_name OP_DECREMENT
  ;


string_var_declaration
    : TEXT_TYPE var_name L_BLOCK NEWLINE* TEXT NEWLINE* R_BLOCK
    | TEXT_TYPE var_name L_BLOCK NEWLINE* get_var NEWLINE* R_BLOCK
    | TEXT_TYPE var_name L_BLOCK NEWLINE* text_expression NEWLINE* R_BLOCK
    ;


    number_var_declaration
    : NUMBER_TYPE var_name L_BLOCK NEWLINE* NUMBER NEWLINE* R_BLOCK
    | NUMBER_TYPE var_name L_BLOCK NEWLINE* math_expression NEWLINE* R_BLOCK
    ;

boolean_var_declaration
    : BOOLEAN_TYPE var_name L_BLOCK NEWLINE* BOOLEAN NEWLINE* R_BLOCK
    | BOOLEAN_TYPE var_name L_BLOCK NEWLINE* logical_expression NEWLINE* R_BLOCK
    ;

single_var_declaration
    : string_var_declaration
    | number_var_declaration
    | boolean_var_declaration
    | var_type var_name L_BLOCK NEWLINE* R_BLOCK
    ;

array_var_declaration
    : TEXT_TYPE var_name L_SQUARE NEWLINE* text_expression (COMMA NEWLINE* text_expression)* NEWLINE* R_SQUARE
    | NUMBER_TYPE var_name L_SQUARE NEWLINE* numeric_expression (COMMA NEWLINE* numeric_expression)* NEWLINE* R_SQUARE
    | BOOLEAN_TYPE var_name L_SQUARE NEWLINE* logical_expression (COMMA NEWLINE* logical_expression)* NEWLINE* R_SQUARE
    ;

var_assignment
    : var_name L_BLOCK NEWLINE* get_var  NEWLINE* R_BLOCK
    | var_name L_BLOCK NEWLINE* math_expression  NEWLINE* R_BLOCK
    ;