parser grammar Flux;
import Variables, Math;

options {
  tokenVocab = Primitives;
}
program: statement* EOF;

statement
    :   expression
    |   loop_statement
    |   if_statement
    |   func_declaration
    |   return_statement
    |   NEWLINE
    ;

expression
    : function_call
    |   single_var_declaration
    |   var_assignment
    |   array_var_declaration
    |   get_var
    ;

block
    :   L_BLOCK statement* R_BLOCK;

loop_statement: AT LOOP loop block;
if_statement: AT IF logical_expression block (AT ELSE block)?;

loop
    :   get_var (SEMICOLON NEWLINE* var_name op_level4 math_expression(SEMICOLON NEWLINE* var_assignment)) NEWLINE*
    |   NUMBER_TYPE var_name L_BLOCK NEWLINE* numeric_expression NEWLINE* R_BLOCK (SEMICOLON NEWLINE* var_name op_level4 math_expression(SEMICOLON NEWLINE* var_assignment)) NEWLINE*
    ;

return_statement: AT RETURN expression;

data_type
    : TEXT_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | COMMON_IDENTIFIER
    ;

func_declaration: AT FUNC VAR_IDENTIFIER L_PAREN (VAR_IDENTIFIER (COMMA VAR_IDENTIFIER)*)? R_PAREN (RETURN_TYPE data_type)?  block;