// Code generated from Flux.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parsing // Flux
import "github.com/antlr4-go/antlr/v4"

// FluxListener is a complete listener for a parse tree produced by Flux.
type FluxListener interface {
	antlr.ParseTreeListener

	// EnterProgram is called when entering the program production.
	EnterProgram(c *ProgramContext)

	// EnterStatement is called when entering the statement production.
	EnterStatement(c *StatementContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterBlock is called when entering the block production.
	EnterBlock(c *BlockContext)

	// EnterLoop_statement is called when entering the loop_statement production.
	EnterLoop_statement(c *Loop_statementContext)

	// EnterIf_statement is called when entering the if_statement production.
	EnterIf_statement(c *If_statementContext)

	// EnterLoop is called when entering the loop production.
	EnterLoop(c *LoopContext)

	// EnterReturn_statement is called when entering the return_statement production.
	EnterReturn_statement(c *Return_statementContext)

	// EnterData_type is called when entering the data_type production.
	EnterData_type(c *Data_typeContext)

	// EnterFunc_declaration is called when entering the func_declaration production.
	EnterFunc_declaration(c *Func_declarationContext)

	// EnterVar_type is called when entering the var_type production.
	EnterVar_type(c *Var_typeContext)

	// EnterVar_name is called when entering the var_name production.
	EnterVar_name(c *Var_nameContext)

	// EnterVar_value is called when entering the var_value production.
	EnterVar_value(c *Var_valueContext)

	// EnterOp_one_expression is called when entering the op_one_expression production.
	EnterOp_one_expression(c *Op_one_expressionContext)

	// EnterOp_one_declaration is called when entering the op_one_declaration production.
	EnterOp_one_declaration(c *Op_one_declarationContext)

	// EnterString_var_declaration is called when entering the string_var_declaration production.
	EnterString_var_declaration(c *String_var_declarationContext)

	// EnterNumber_var_declaration is called when entering the number_var_declaration production.
	EnterNumber_var_declaration(c *Number_var_declarationContext)

	// EnterBoolean_var_declaration is called when entering the boolean_var_declaration production.
	EnterBoolean_var_declaration(c *Boolean_var_declarationContext)

	// EnterSingle_var_declaration is called when entering the single_var_declaration production.
	EnterSingle_var_declaration(c *Single_var_declarationContext)

	// EnterArray_var_declaration is called when entering the array_var_declaration production.
	EnterArray_var_declaration(c *Array_var_declarationContext)

	// EnterVar_assignment is called when entering the var_assignment production.
	EnterVar_assignment(c *Var_assignmentContext)

	// EnterOp_level1 is called when entering the op_level1 production.
	EnterOp_level1(c *Op_level1Context)

	// EnterOp_level2 is called when entering the op_level2 production.
	EnterOp_level2(c *Op_level2Context)

	// EnterOp_level3 is called when entering the op_level3 production.
	EnterOp_level3(c *Op_level3Context)

	// EnterOp_level4 is called when entering the op_level4 production.
	EnterOp_level4(c *Op_level4Context)

	// EnterOp_level5 is called when entering the op_level5 production.
	EnterOp_level5(c *Op_level5Context)

	// EnterNumeric_expression is called when entering the numeric_expression production.
	EnterNumeric_expression(c *Numeric_expressionContext)

	// EnterText_expression is called when entering the text_expression production.
	EnterText_expression(c *Text_expressionContext)

	// EnterLogical_expression is called when entering the logical_expression production.
	EnterLogical_expression(c *Logical_expressionContext)

	// EnterGet_var is called when entering the get_var production.
	EnterGet_var(c *Get_varContext)

	// EnterMath_expression is called when entering the math_expression production.
	EnterMath_expression(c *Math_expressionContext)

	// EnterGet_array_element is called when entering the get_array_element production.
	EnterGet_array_element(c *Get_array_elementContext)

	// EnterGet_child is called when entering the get_child production.
	EnterGet_child(c *Get_childContext)

	// EnterFunction_call is called when entering the function_call production.
	EnterFunction_call(c *Function_callContext)

	// EnterArgs is called when entering the args production.
	EnterArgs(c *ArgsContext)

	// ExitProgram is called when exiting the program production.
	ExitProgram(c *ProgramContext)

	// ExitStatement is called when exiting the statement production.
	ExitStatement(c *StatementContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitBlock is called when exiting the block production.
	ExitBlock(c *BlockContext)

	// ExitLoop_statement is called when exiting the loop_statement production.
	ExitLoop_statement(c *Loop_statementContext)

	// ExitIf_statement is called when exiting the if_statement production.
	ExitIf_statement(c *If_statementContext)

	// ExitLoop is called when exiting the loop production.
	ExitLoop(c *LoopContext)

	// ExitReturn_statement is called when exiting the return_statement production.
	ExitReturn_statement(c *Return_statementContext)

	// ExitData_type is called when exiting the data_type production.
	ExitData_type(c *Data_typeContext)

	// ExitFunc_declaration is called when exiting the func_declaration production.
	ExitFunc_declaration(c *Func_declarationContext)

	// ExitVar_type is called when exiting the var_type production.
	ExitVar_type(c *Var_typeContext)

	// ExitVar_name is called when exiting the var_name production.
	ExitVar_name(c *Var_nameContext)

	// ExitVar_value is called when exiting the var_value production.
	ExitVar_value(c *Var_valueContext)

	// ExitOp_one_expression is called when exiting the op_one_expression production.
	ExitOp_one_expression(c *Op_one_expressionContext)

	// ExitOp_one_declaration is called when exiting the op_one_declaration production.
	ExitOp_one_declaration(c *Op_one_declarationContext)

	// ExitString_var_declaration is called when exiting the string_var_declaration production.
	ExitString_var_declaration(c *String_var_declarationContext)

	// ExitNumber_var_declaration is called when exiting the number_var_declaration production.
	ExitNumber_var_declaration(c *Number_var_declarationContext)

	// ExitBoolean_var_declaration is called when exiting the boolean_var_declaration production.
	ExitBoolean_var_declaration(c *Boolean_var_declarationContext)

	// ExitSingle_var_declaration is called when exiting the single_var_declaration production.
	ExitSingle_var_declaration(c *Single_var_declarationContext)

	// ExitArray_var_declaration is called when exiting the array_var_declaration production.
	ExitArray_var_declaration(c *Array_var_declarationContext)

	// ExitVar_assignment is called when exiting the var_assignment production.
	ExitVar_assignment(c *Var_assignmentContext)

	// ExitOp_level1 is called when exiting the op_level1 production.
	ExitOp_level1(c *Op_level1Context)

	// ExitOp_level2 is called when exiting the op_level2 production.
	ExitOp_level2(c *Op_level2Context)

	// ExitOp_level3 is called when exiting the op_level3 production.
	ExitOp_level3(c *Op_level3Context)

	// ExitOp_level4 is called when exiting the op_level4 production.
	ExitOp_level4(c *Op_level4Context)

	// ExitOp_level5 is called when exiting the op_level5 production.
	ExitOp_level5(c *Op_level5Context)

	// ExitNumeric_expression is called when exiting the numeric_expression production.
	ExitNumeric_expression(c *Numeric_expressionContext)

	// ExitText_expression is called when exiting the text_expression production.
	ExitText_expression(c *Text_expressionContext)

	// ExitLogical_expression is called when exiting the logical_expression production.
	ExitLogical_expression(c *Logical_expressionContext)

	// ExitGet_var is called when exiting the get_var production.
	ExitGet_var(c *Get_varContext)

	// ExitMath_expression is called when exiting the math_expression production.
	ExitMath_expression(c *Math_expressionContext)

	// ExitGet_array_element is called when exiting the get_array_element production.
	ExitGet_array_element(c *Get_array_elementContext)

	// ExitGet_child is called when exiting the get_child production.
	ExitGet_child(c *Get_childContext)

	// ExitFunction_call is called when exiting the function_call production.
	ExitFunction_call(c *Function_callContext)

	// ExitArgs is called when exiting the args production.
	ExitArgs(c *ArgsContext)
}
