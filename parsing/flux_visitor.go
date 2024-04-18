// Code generated from Flux.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parsing // Flux
import "github.com/antlr4-go/antlr/v4"

// A complete Visitor for a parse tree produced by Flux.
type FluxVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by Flux#program.
	VisitProgram(ctx *ProgramContext) interface{}

	// Visit a parse tree produced by Flux#statement.
	VisitStatement(ctx *StatementContext) interface{}

	// Visit a parse tree produced by Flux#expression.
	VisitExpression(ctx *ExpressionContext) interface{}

	// Visit a parse tree produced by Flux#block.
	VisitBlock(ctx *BlockContext) interface{}

	// Visit a parse tree produced by Flux#loop_statement.
	VisitLoop_statement(ctx *Loop_statementContext) interface{}

	// Visit a parse tree produced by Flux#if_statement.
	VisitIf_statement(ctx *If_statementContext) interface{}

	// Visit a parse tree produced by Flux#loop.
	VisitLoop(ctx *LoopContext) interface{}

	// Visit a parse tree produced by Flux#return_statement.
	VisitReturn_statement(ctx *Return_statementContext) interface{}

	// Visit a parse tree produced by Flux#data_type.
	VisitData_type(ctx *Data_typeContext) interface{}

	// Visit a parse tree produced by Flux#func_declaration.
	VisitFunc_declaration(ctx *Func_declarationContext) interface{}

	// Visit a parse tree produced by Flux#var_type.
	VisitVar_type(ctx *Var_typeContext) interface{}

	// Visit a parse tree produced by Flux#var_name.
	VisitVar_name(ctx *Var_nameContext) interface{}

	// Visit a parse tree produced by Flux#var_value.
	VisitVar_value(ctx *Var_valueContext) interface{}

	// Visit a parse tree produced by Flux#op_one_expression.
	VisitOp_one_expression(ctx *Op_one_expressionContext) interface{}

	// Visit a parse tree produced by Flux#op_one_declaration.
	VisitOp_one_declaration(ctx *Op_one_declarationContext) interface{}

	// Visit a parse tree produced by Flux#string_var_declaration.
	VisitString_var_declaration(ctx *String_var_declarationContext) interface{}

	// Visit a parse tree produced by Flux#number_var_declaration.
	VisitNumber_var_declaration(ctx *Number_var_declarationContext) interface{}

	// Visit a parse tree produced by Flux#boolean_var_declaration.
	VisitBoolean_var_declaration(ctx *Boolean_var_declarationContext) interface{}

	// Visit a parse tree produced by Flux#single_var_declaration.
	VisitSingle_var_declaration(ctx *Single_var_declarationContext) interface{}

	// Visit a parse tree produced by Flux#array_var_declaration.
	VisitArray_var_declaration(ctx *Array_var_declarationContext) interface{}

	// Visit a parse tree produced by Flux#var_assignment.
	VisitVar_assignment(ctx *Var_assignmentContext) interface{}

	// Visit a parse tree produced by Flux#op_level1.
	VisitOp_level1(ctx *Op_level1Context) interface{}

	// Visit a parse tree produced by Flux#op_level2.
	VisitOp_level2(ctx *Op_level2Context) interface{}

	// Visit a parse tree produced by Flux#op_level3.
	VisitOp_level3(ctx *Op_level3Context) interface{}

	// Visit a parse tree produced by Flux#op_level4.
	VisitOp_level4(ctx *Op_level4Context) interface{}

	// Visit a parse tree produced by Flux#op_level5.
	VisitOp_level5(ctx *Op_level5Context) interface{}

	// Visit a parse tree produced by Flux#numeric_expression.
	VisitNumeric_expression(ctx *Numeric_expressionContext) interface{}

	// Visit a parse tree produced by Flux#text_expression.
	VisitText_expression(ctx *Text_expressionContext) interface{}

	// Visit a parse tree produced by Flux#logical_expression.
	VisitLogical_expression(ctx *Logical_expressionContext) interface{}

	// Visit a parse tree produced by Flux#get_var.
	VisitGet_var(ctx *Get_varContext) interface{}

	// Visit a parse tree produced by Flux#math_expression.
	VisitMath_expression(ctx *Math_expressionContext) interface{}

	// Visit a parse tree produced by Flux#get_array_element.
	VisitGet_array_element(ctx *Get_array_elementContext) interface{}

	// Visit a parse tree produced by Flux#get_child.
	VisitGet_child(ctx *Get_childContext) interface{}

	// Visit a parse tree produced by Flux#function_call.
	VisitFunction_call(ctx *Function_callContext) interface{}

	// Visit a parse tree produced by Flux#args.
	VisitArgs(ctx *ArgsContext) interface{}
}
