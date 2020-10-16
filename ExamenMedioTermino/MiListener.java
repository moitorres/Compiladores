import java.util.*;

public class MiListener extends TACBaseListener {

    Stack<Integer> pila = new Stack<>();

    @Override
    public void exitProg(TACParser.ProgContext ctx) {
    }

    @Override
    public void enterExpr(TACParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(TACParser.ExprContext ctx) {

    }

}
