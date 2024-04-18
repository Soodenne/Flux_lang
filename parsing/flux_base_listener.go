// Code generated from Flux.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parsing // Flux
import "github.com/antlr4-go/antlr/v4"

// BaseFluxListener is a complete listener for a parse tree produced by Flux.
type BaseFluxListener struct{}

var _ FluxListener = &BaseFluxListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseFluxListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseFluxListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseFluxListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseFluxListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterProgram is called when production program is entered.
func (s *BaseFluxListener) EnterProgram(ctx *ProgramContext) {}

// ExitProgram is called when production program is exited.
func (s *BaseFluxListener) ExitProgram(ctx *ProgramContext) {}

// EnterStatement is called when production statement is entered.
func (s *BaseFluxListener) EnterStatement(ctx *StatementContext) {}

// ExitStatement is called when production statement is exited.
func (s *BaseFluxListener) ExitStatement(ctx *StatementContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseFluxListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseFluxListener) ExitExpression(ctx *ExpressionContext) {}

// EnterBlock is called when production block is entered.
func (s *BaseFluxListener) EnterBlock(ctx *BlockContext) {}

// ExitBlock is called when production block is exited.
func (s *BaseFluxListener) ExitBlock(ctx *BlockContext) {}

// EnterLoop_statement is called when production loop_statement is entered.
func (s *BaseFluxListener) EnterLoop_statement(ctx *Loop_statementContext) {}

// ExitLoop_statement is called when production loop_statement is exited.
func (s *BaseFluxListener) ExitLoop_statement(ctx *Loop_statementContext) {}

// EnterIf_statement is called when production if_statement is entered.
func (s *BaseFluxListener) EnterIf_statement(ctx *If_statementContext) {}

// ExitIf_statement is called when production if_statement is exited.
func (s *BaseFluxListener) ExitIf_statement(ctx *If_statementContext) {}

// EnterLoop is called when production loop is entered.
func (s *BaseFluxListener) EnterLoop(ctx *LoopContext) {}

// ExitLoop is called when production loop is exited.
func (s *BaseFluxListener) ExitLoop(ctx *LoopContext) {}

// EnterReturn_statement is called when production return_statement is entered.
func (s *BaseFluxListener) EnterReturn_statement(ctx *Return_statementContext) {}

// ExitReturn_statement is called when production return_statement is exited.
func (s *BaseFluxListener) ExitReturn_statement(ctx *Return_statementContext) {}

// EnterData_type is called when production data_type is entered.
func (s *BaseFluxListener) EnterData_type(ctx *Data_typeContext) {}

// ExitData_type is called when production data_type is exited.
func (s *BaseFluxListener) ExitData_type(ctx *Data_typeContext) {}

// EnterFunc_declaration is called when production func_declaration is entered.
func (s *BaseFluxListener) EnterFunc_declaration(ctx *Func_declarationContext) {}

// ExitFunc_declaration is called when production func_declaration is exited.
func (s *BaseFluxListener) ExitFunc_declaration(ctx *Func_declarationContext) {}

// EnterVar_type is called when production var_type is entered.
func (s *BaseFluxListener) EnterVar_type(ctx *Var_typeContext) {}

// ExitVar_type is called when production var_type is exited.
func (s *BaseFluxListener) ExitVar_type(ctx *Var_typeContext) {}

// EnterVar_name is called when production var_name is entered.
func (s *BaseFluxListener) EnterVar_name(ctx *Var_nameContext) {}

// ExitVar_name is called when production var_name is exited.
func (s *BaseFluxListener) ExitVar_name(ctx *Var_nameContext) {}

// EnterVar_value is called when production var_value is entered.
func (s *BaseFluxListener) EnterVar_value(ctx *Var_valueContext) {}

// ExitVar_value is called when production var_value is exited.
func (s *BaseFluxListener) ExitVar_value(ctx *Var_valueContext) {}

// EnterOp_one_expression is called when production op_one_expression is entered.
func (s *BaseFluxListener) EnterOp_one_expression(ctx *Op_one_expressionContext) {}

// ExitOp_one_expression is called when production op_one_expression is exited.
func (s *BaseFluxListener) ExitOp_one_expression(ctx *Op_one_expressionContext) {}

// EnterOp_one_declaration is called when production op_one_declaration is entered.
func (s *BaseFluxListener) EnterOp_one_declaration(ctx *Op_one_declarationContext) {}

// ExitOp_one_declaration is called when production op_one_declaration is exited.
func (s *BaseFluxListener) ExitOp_one_declaration(ctx *Op_one_declarationContext) {}

// EnterString_var_declaration is called when production string_var_declaration is entered.
func (s *BaseFluxListener) EnterString_var_declaration(ctx *String_var_declarationContext) {}

// ExitString_var_declaration is called when production string_var_declaration is exited.
func (s *BaseFluxListener) ExitString_var_declaration(ctx *String_var_declarationContext) {}

// EnterNumber_var_declaration is called when production number_var_declaration is entered.
func (s *BaseFluxListener) EnterNumber_var_declaration(ctx *Number_var_declarationContext) {}

// ExitNumber_var_declaration is called when production number_var_declaration is exited.
func (s *BaseFluxListener) ExitNumber_var_declaration(ctx *Number_var_declarationContext) {}

// EnterBoolean_var_declaration is called when production boolean_var_declaration is entered.
func (s *BaseFluxListener) EnterBoolean_var_declaration(ctx *Boolean_var_declarationContext) {}

// ExitBoolean_var_declaration is called when production boolean_var_declaration is exited.
func (s *BaseFluxListener) ExitBoolean_var_declaration(ctx *Boolean_var_declarationContext) {}

// EnterSingle_var_declaration is called when production single_var_declaration is entered.
func (s *BaseFluxListener) EnterSingle_var_declaration(ctx *Single_var_declarationContext) {}

// ExitSingle_var_declaration is called when production single_var_declaration is exited.
func (s *BaseFluxListener) ExitSingle_var_declaration(ctx *Single_var_declarationContext) {}

// EnterArray_var_declaration is called when production array_var_declaration is entered.
func (s *BaseFluxListener) EnterArray_var_declaration(ctx *Array_var_declarationContext) {}

// ExitArray_var_declaration is called when production array_var_declaration is exited.
func (s *BaseFluxListener) ExitArray_var_declaration(ctx *Array_var_declarationContext) {}

// EnterVar_assignment is called when production var_assignment is entered.
func (s *BaseFluxListener) EnterVar_assignment(ctx *Var_assignmentContext) {}

// ExitVar_assignment is called when production var_assignment is exited.
func (s *BaseFluxListener) ExitVar_assignment(ctx *Var_assignmentContext) {}

// EnterOp_level1 is called when production op_level1 is entered.
func (s *BaseFluxListener) EnterOp_level1(ctx *Op_level1Context) {}

// ExitOp_level1 is called when production op_level1 is exited.
func (s *BaseFluxListener) ExitOp_level1(ctx *Op_level1Context) {}

// EnterOp_level2 is called when production op_level2 is entered.
func (s *BaseFluxListener) EnterOp_level2(ctx *Op_level2Context) {}

// ExitOp_level2 is called when production op_level2 is exited.
func (s *BaseFluxListener) ExitOp_level2(ctx *Op_level2Context) {}

// EnterOp_level3 is called when production op_level3 is entered.
func (s *BaseFluxListener) EnterOp_level3(ctx *Op_level3Context) {}

// ExitOp_level3 is called when production op_level3 is exited.
func (s *BaseFluxListener) ExitOp_level3(ctx *Op_level3Context) {}

// EnterOp_level4 is called when production op_level4 is entered.
func (s *BaseFluxListener) EnterOp_level4(ctx *Op_level4Context) {}

// ExitOp_level4 is called when production op_level4 is exited.
func (s *BaseFluxListener) ExitOp_level4(ctx *Op_level4Context) {}

// EnterOp_level5 is called when production op_level5 is entered.
func (s *BaseFluxListener) EnterOp_level5(ctx *Op_level5Context) {}

// ExitOp_level5 is called when production op_level5 is exited.
func (s *BaseFluxListener) ExitOp_level5(ctx *Op_level5Context) {}

// EnterNumeric_expression is called when production numeric_expression is entered.
func (s *BaseFluxListener) EnterNumeric_expression(ctx *Numeric_expressionContext) {}

// ExitNumeric_expression is called when production numeric_expression is exited.
func (s *BaseFluxListener) ExitNumeric_expression(ctx *Numeric_expressionContext) {}

// EnterText_expression is called when production text_expression is entered.
func (s *BaseFluxListener) EnterText_expression(ctx *Text_expressionContext) {}

// ExitText_expression is called when production text_expression is exited.
func (s *BaseFluxListener) ExitText_expression(ctx *Text_expressionContext) {}

// EnterLogical_expression is called when production logical_expression is entered.
func (s *BaseFluxListener) EnterLogical_expression(ctx *Logical_expressionContext) {}

// ExitLogical_expression is called when production logical_expression is exited.
func (s *BaseFluxListener) ExitLogical_expression(ctx *Logical_expressionContext) {}

// EnterGet_var is called when production get_var is entered.
func (s *BaseFluxListener) EnterGet_var(ctx *Get_varContext) {}

// ExitGet_var is called when production get_var is exited.
func (s *BaseFluxListener) ExitGet_var(ctx *Get_varContext) {}

// EnterMath_expression is called when production math_expression is entered.
func (s *BaseFluxListener) EnterMath_expression(ctx *Math_expressionContext) {}

// ExitMath_expression is called when production math_expression is exited.
func (s *BaseFluxListener) ExitMath_expression(ctx *Math_expressionContext) {}

// EnterGet_array_element is called when production get_array_element is entered.
func (s *BaseFluxListener) EnterGet_array_element(ctx *Get_array_elementContext) {}

// ExitGet_array_element is called when production get_array_element is exited.
func (s *BaseFluxListener) ExitGet_array_element(ctx *Get_array_elementContext) {}

// EnterGet_child is called when production get_child is entered.
func (s *BaseFluxListener) EnterGet_child(ctx *Get_childContext) {}

// ExitGet_child is called when production get_child is exited.
func (s *BaseFluxListener) ExitGet_child(ctx *Get_childContext) {}

// EnterFunction_call is called when production function_call is entered.
func (s *BaseFluxListener) EnterFunction_call(ctx *Function_callContext) {}

// ExitFunction_call is called when production function_call is exited.
func (s *BaseFluxListener) ExitFunction_call(ctx *Function_callContext) {}

// EnterArgs is called when production args is entered.
func (s *BaseFluxListener) EnterArgs(ctx *ArgsContext) {}

// ExitArgs is called when production args is exited.
func (s *BaseFluxListener) ExitArgs(ctx *ArgsContext) {}
