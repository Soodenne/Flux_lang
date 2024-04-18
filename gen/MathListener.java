// Generated from /Users/ambrose/Repos/flux_lang/parser/Math.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Math}.
 */
public interface MathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Math#op_level1}.
	 * @param ctx the parse tree
	 */
	void enterOp_level1(Math.Op_level1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Math#op_level1}.
	 * @param ctx the parse tree
	 */
	void exitOp_level1(Math.Op_level1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Math#op_level2}.
	 * @param ctx the parse tree
	 */
	void enterOp_level2(Math.Op_level2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Math#op_level2}.
	 * @param ctx the parse tree
	 */
	void exitOp_level2(Math.Op_level2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Math#op_level3}.
	 * @param ctx the parse tree
	 */
	void enterOp_level3(Math.Op_level3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Math#op_level3}.
	 * @param ctx the parse tree
	 */
	void exitOp_level3(Math.Op_level3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Math#op_level4}.
	 * @param ctx the parse tree
	 */
	void enterOp_level4(Math.Op_level4Context ctx);
	/**
	 * Exit a parse tree produced by {@link Math#op_level4}.
	 * @param ctx the parse tree
	 */
	void exitOp_level4(Math.Op_level4Context ctx);
	/**
	 * Enter a parse tree produced by {@link Math#op_level5}.
	 * @param ctx the parse tree
	 */
	void enterOp_level5(Math.Op_level5Context ctx);
	/**
	 * Exit a parse tree produced by {@link Math#op_level5}.
	 * @param ctx the parse tree
	 */
	void exitOp_level5(Math.Op_level5Context ctx);
	/**
	 * Enter a parse tree produced by {@link Math#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(Math.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(Math.Numeric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#text_expression}.
	 * @param ctx the parse tree
	 */
	void enterText_expression(Math.Text_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#text_expression}.
	 * @param ctx the parse tree
	 */
	void exitText_expression(Math.Text_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(Math.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(Math.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#comparative_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparative_expression(Math.Comparative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#comparative_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparative_expression(Math.Comparative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#get_var}.
	 * @param ctx the parse tree
	 */
	void enterGet_var(Math.Get_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#get_var}.
	 * @param ctx the parse tree
	 */
	void exitGet_var(Math.Get_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMath_expression(Math.Math_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMath_expression(Math.Math_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#get_array_element}.
	 * @param ctx the parse tree
	 */
	void enterGet_array_element(Math.Get_array_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#get_array_element}.
	 * @param ctx the parse tree
	 */
	void exitGet_array_element(Math.Get_array_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#get_child}.
	 * @param ctx the parse tree
	 */
	void enterGet_child(Math.Get_childContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#get_child}.
	 * @param ctx the parse tree
	 */
	void exitGet_child(Math.Get_childContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(Math.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(Math.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Math#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Math.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Math#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Math.ArgsContext ctx);
}