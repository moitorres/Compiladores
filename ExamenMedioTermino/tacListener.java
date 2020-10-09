// Generated from C:/Users/Moisés Uriel Torres/Desktop/Compiladores/Proyecto Principal/src\tac.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tacParser}.
 */
public interface tacListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tacParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(tacParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link tacParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(tacParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link tacParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tacParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tacParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tacParser.ExprContext ctx);
}