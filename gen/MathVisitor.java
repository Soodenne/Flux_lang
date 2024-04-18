// Generated from /Users/ambrose/Repos/flux_lang/parser/Math.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Math}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Math#op_level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level1(Math.Op_level1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Math#op_level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level2(Math.Op_level2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Math#op_level3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level3(Math.Op_level3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Math#op_level4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level4(Math.Op_level4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Math#op_level5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level5(Math.Op_level5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Math#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expression(Math.Numeric_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#text_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_expression(Math.Text_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(Math.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#comparative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_expression(Math.Comparative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#get_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_var(Math.Get_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(Math.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#get_array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_array_element(Math.Get_array_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#get_child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_child(Math.Get_childContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Math.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Math#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Math.ArgsContext ctx);
}