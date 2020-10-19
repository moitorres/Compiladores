// Generated from C:/Users/Moisés Uriel Torres/Desktop/Compiladores/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TACParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TACVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TACParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TACParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TACParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(TACParser.OperandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TACParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#assignArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArray(TACParser.AssignArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#goTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoTo(TACParser.GoToContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#ifFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFalse(TACParser.IfFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#ifFalseArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFalseArray(TACParser.IfFalseArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#ifTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTrue(TACParser.IfTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#ifTrueArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTrueArray(TACParser.IfTrueArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TACParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#printArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArray(TACParser.PrintArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TACParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(TACParser.OperadorContext ctx);
}