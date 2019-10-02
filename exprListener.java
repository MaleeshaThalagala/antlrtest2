// Generated from expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exprParser}.
 */
public interface exprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exprParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(exprParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(exprParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(exprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(exprParser.ExprContext ctx);
}