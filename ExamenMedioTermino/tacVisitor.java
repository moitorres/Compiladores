// Generated from C:/Users/Moisés Uriel Torres/Desktop/Compiladores/Proyecto Principal/src\tac.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tacParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tacVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tacParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(tacParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(tacParser.ExprContext ctx);
}