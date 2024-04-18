// Generated from /Users/ambrose/Repos/flux_lang/parser/Variables.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Variables}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VariablesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Variables#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(Variables.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(Variables.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_value(Variables.Var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#string_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_var_declaration(Variables.String_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#number_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_var_declaration(Variables.Number_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#boolean_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_var_declaration(Variables.Boolean_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#single_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_var_declaration(Variables.Single_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#array_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_var_declaration(Variables.Array_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#var_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assignment(Variables.Var_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#op_level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level1(Variables.Op_level1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#op_level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level2(Variables.Op_level2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#op_level3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level3(Variables.Op_level3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#op_level4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level4(Variables.Op_level4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#op_level5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level5(Variables.Op_level5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expression(Variables.Numeric_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(Variables.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#comparative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_expression(Variables.Comparative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(Variables.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#get_array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_array_element(Variables.Get_array_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#get_child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_child(Variables.Get_childContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#get_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_var(Variables.Get_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link Variables#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Variables.Function_callContext ctx);
}