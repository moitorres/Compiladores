// Generated from C:/Users/Mois�s Uriel Torres/Desktop/Compiladores/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TACParser}.
 */
public interface TACListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TACParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TACParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TACParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TACParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TACParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TACParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TACParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#goTo}.
	 * @param ctx the parse tree
	 */
	void enterGoTo(TACParser.GoToContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#goTo}.
	 * @param ctx the parse tree
	 */
	void exitGoTo(TACParser.GoToContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#ifFalse}.
	 * @param ctx the parse tree
	 */
	void enterIfFalse(TACParser.IfFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#ifFalse}.
	 * @param ctx the parse tree
	 */
	void exitIfFalse(TACParser.IfFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#ifTrue}.
	 * @param ctx the parse tree
	 */
	void enterIfTrue(TACParser.IfTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#ifTrue}.
	 * @param ctx the parse tree
	 */
	void exitIfTrue(TACParser.IfTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TACParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TACParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TACParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TACParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(TACParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(TACParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(TACParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(TACParser.OperandoContext ctx);
}