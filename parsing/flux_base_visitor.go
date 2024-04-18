// Code generated from Flux.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parsing // Flux
import "github.com/antlr4-go/antlr/v4"

type BaseFluxVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseFluxVisitor) VisitProgram(ctx *ProgramContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitStatement(ctx *StatementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitExpression(ctx *ExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitBlock(ctx *BlockContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitLoop_statement(ctx *Loop_statementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitIf_statement(ctx *If_statementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitLoop(ctx *LoopContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitReturn_statement(ctx *Return_statementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitData_type(ctx *Data_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitFunc_declaration(ctx *Func_declarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitVar_type(ctx *Var_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitVar_name(ctx *Var_nameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitVar_value(ctx *Var_valueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitOp_one_expression(ctx *Op_one_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitOp_one_declaration(ctx *Op_one_declarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitString_var_declaration(ctx *String_var_declarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitNumber_var_declaration(ctx *Number_var_declarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitBoolean_var_declaration(ctx *Boolean_var_declarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitSingle_var_declaration(ctx *Single_var_declarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitArray_var_declaration(ctx *Array_var_declarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitVar_assignment(ctx *Var_assignmentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitOp_level1(ctx *Op_level1Context) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitOp_level2(ctx *Op_level2Context) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitOp_level3(ctx *Op_level3Context) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitOp_level4(ctx *Op_level4Context) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitOp_level5(ctx *Op_level5Context) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitNumeric_expression(ctx *Numeric_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitText_expression(ctx *Text_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitLogical_expression(ctx *Logical_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitGet_var(ctx *Get_varContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitMath_expression(ctx *Math_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitGet_array_element(ctx *Get_array_elementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitGet_child(ctx *Get_childContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitFunction_call(ctx *Function_callContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseFluxVisitor) VisitArgs(ctx *ArgsContext) interface{} {
	return v.VisitChildren(ctx)
}
