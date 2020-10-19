import java.util.*;

public class MiListener extends TACBaseListener {

    Stack<Operand> pila = new Stack<>();

    @Override
    public void exitAssign(TACParser.AssignContext ctx) {
        String id = null;

        //The assign has a label
        if(ctx.ID().size()==2){
            Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
            id = ctx.ID(1).getText();
        }
        //The assign doesn't have a label
        else{
            id = ctx.ID(0).getText();
        }

        Statement s = null;

        //The assign is a direct assignment
        if(ctx.operador() == null){
            s = new Assign(id, pila.pop());
        }

        //The assign is the assignment of an operation
        else{
            Operand o2 = pila.pop();
            Operand o1 = pila.pop();

            switch (ctx.operador().getText()){

                case "+":
                    Add add = new Add(o1,o2);
                    s = new Assign(id, add.evaluateOperation());
                    break;
                case "-":
                    Subtract subtract = new Subtract(o1,o2);
                    s = new Assign(id, subtract.evaluateOperation());
                    break;
                case "*":
                    Multiply multiply = new Multiply(o1,o2);
                    s = new Assign(id, multiply.evaluateOperation());
                    break;
                case "/":
                    Divide divide = new Divide(o1,o2);
                    s = new Assign(id, divide.evaluateOperation());
                    break;
                case "<":
                    LessThan lessThan = new LessThan(o1,o2);
                    s = new Assign(id, lessThan.evaluateOperation());
                    break;
                case "==":
                    Equals equals = new Equals(o1,o2);
                    s = new Assign(id, equals.evaluateOperation());
                    break;
                case "&&":
                    And and = new And(o1,o2);
                    s = new Assign(id, and.evaluateOperation());
                    break;
                case "||":
                    Or or = new Or(o1,o2);
                    s = new Assign(id, or.evaluateOperation());
                    break;
            }
        }
        Statement.stmnts.add(s);
    }

    @Override public void exitOperando(TACParser.OperandoContext ctx) {

        //The operand is a num
        if(ctx.ID() == null){
            Number n = new Number(Integer.parseInt(ctx.INT().getText()));
            pila.push(n);
        }
        //The operand is an id
        else{
            ID id = new ID(ctx.ID().getText());
            pila.push(id);
        }
    }

    @Override public void exitPrint(TACParser.PrintContext ctx) {

        //The assign has a label
        if(ctx.ID() != null){
            Statement.labels.put(ctx.ID().getText(), Statement.stmnts.size());
        }
        Print p = new Print(pila.pop());
        Statement.stmnts.add(p);
    }

    @Override public void exitGoTo(TACParser.GoToContext ctx) {
        String label;

        //The goTo has a label
        if(ctx.ID().size()==2){
            Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
            label = ctx.ID(1).getText();
        }
        //The goTo doesn't have a label
        else{
            label = ctx.ID(0).getText();
        }

        Label l = new Label(label);
        GoTo gt = new GoTo(l);
        Statement.stmnts.add(gt);
    }

    @Override public void exitIfTrue(TACParser.IfTrueContext ctx) {
        String label;

        //The ifTrue has a label
        if(ctx.ID().size()==2){
            Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
            label = ctx.ID(1).getText();
        }
        //The ifTrue doesn't have a label
        else{
            label = ctx.ID(0).getText();
        }
        Label l = new Label(label);
        IfTrue ift = new IfTrue(pila.pop(),l);
        Statement.stmnts.add(ift);
    }

    @Override public void exitIfFalse(TACParser.IfFalseContext ctx) {
        String label;

        //The ifFalse has a label
        if(ctx.ID().size()==2){
            Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
            label = ctx.ID(1).getText();
        }
        //The ifFalse doesn't have a label
        else{
            label = ctx.ID(0).getText();
        }
        Label l = new Label(label);
        IfFalse iff = new IfFalse(pila.pop(),l);
        Statement.stmnts.add(iff);
    }

}
