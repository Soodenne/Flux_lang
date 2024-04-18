// Generated from /Users/ambrose/Repos/flux_lang/parser/Variables.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Variables}.
 */
public interface VariablesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Variables#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(Variables.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(Variables.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(Variables.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(Variables.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#var_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_value(Variables.Var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#var_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_value(Variables.Var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#string_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_var_declaration(Variables.String_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#string_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_var_declaration(Variables.String_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#number_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNumber_var_declaration(Variables.Number_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#number_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNumber_var_declaration(Variables.Number_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#boolean_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_var_declaration(Variables.Boolean_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#boolean_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_var_declaration(Variables.Boolean_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#single_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_var_declaration(Variables.Single_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#single_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_var_declaration(Variables.Single_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#array_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_var_declaration(Variables.Array_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#array_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_var_declaration(Variables.Array_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#var_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVar_assignment(Variables.Var_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#var_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVar_assignment(Variables.Var_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#op_level1}.
	 * @param ctx the parse tree
	 */
	void enterOp_level1(Variables.Op_level1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#op_level1}.
	 * @param ctx the parse tree
	 */
	void exitOp_level1(Variables.Op_level1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#op_level2}.
	 * @param ctx the parse tree
	 */
	void enterOp_level2(Variables.Op_level2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#op_level2}.
	 * @param ctx the parse tree
	 */
	void exitOp_level2(Variables.Op_level2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#op_level3}.
	 * @param ctx the parse tree
	 */
	void enterOp_level3(Variables.Op_level3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#op_level3}.
	 * @param ctx the parse tree
	 */
	void exitOp_level3(Variables.Op_level3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#op_level4}.
	 * @param ctx the parse tree
	 */
	void enterOp_level4(Variables.Op_level4Context ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#op_level4}.
	 * @param ctx the parse tree
	 */
	void exitOp_level4(Variables.Op_level4Context ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#op_level5}.
	 * @param ctx the parse tree
	 */
	void enterOp_level5(Variables.Op_level5Context ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#op_level5}.
	 * @param ctx the parse tree
	 */
	void exitOp_level5(Variables.Op_level5Context ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(Variables.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(Variables.Numeric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(Variables.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(Variables.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#comparative_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparative_expression(Variables.Comparative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#comparative_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparative_expression(Variables.Comparative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMath_expression(Variables.Math_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMath_expression(Variables.Math_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#get_array_element}.
	 * @param ctx the parse tree
	 */
	void enterGet_array_element(Variables.Get_array_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#get_array_element}.
	 * @param ctx the parse tree
	 */
	void exitGet_array_element(Variables.Get_array_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#get_child}.
	 * @param ctx the parse tree
	 */
	void enterGet_child(Variables.Get_childContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#get_child}.
	 * @param ctx the parse tree
	 */
	void exitGet_child(Variables.Get_childContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#get_var}.
	 * @param ctx the parse tree
	 */
	void enterGet_var(Variables.Get_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#get_var}.
	 * @param ctx the parse tree
	 */
	void exitGet_var(Variables.Get_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link Variables#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(Variables.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Variables#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(Variables.Function_callContext ctx);
}