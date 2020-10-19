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
                    s = new Assign(id, new Add(o1,o2));
                    break;
                case "-":
                    s = new Assign(id, new Subtract(o1,o2));
                    break;
                case "*":
                    s = new Assign(id, new Multiply(o1,o2));
                    break;
                case "/":
                    s = new Assign(id, new Divide(o1,o2));
                    break;
                case "<":
                    s = new Assign(id, new LessThan(o1,o2));
                    break;
                case "==":
                    s = new Assign(id, new Equals(o1,o2));
                    break;
                case "&&":
                    s = new Assign(id, new And(o1,o2));
                    break;
                case "||":
                    s = new Assign(id, new Or(o1,o2));
                    break;
            }
        }
        Statement.stmnts.add(s);
    }

    @Override public void exitAssignArray(TACParser.AssignArrayContext ctx) {

        String idArray, idVariable;
        Statement s = null;

        //Assign value to an array
        if(ctx.operando().size()==2) {

            if(ctx.ID().size()==2){
                Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
                idArray = ctx.ID(1).getText();
            }
            else{
                idArray = ctx.ID(0).getText();
            }

            Operand value = pila.pop();
            Operand index = pila.pop();

            Array arr = new Array(idArray, index.getValue());
            s = new AssignArray(arr, value);
        }
        //Assign value from an array to a variable
        else{
            if(ctx.ID().size()==3){
                Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
                idVariable = ctx.ID(1).getText();
                idArray = ctx.ID(2).getText();
            }
            else{
                idVariable = ctx.ID(0).getText();
                idArray = ctx.ID(1).getText();
            }

            Array arr = new Array(idArray, pila.pop().getValue());
            s = new Assign(idVariable, arr);
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

    @Override public void exitPrintArray(TACParser.PrintArrayContext ctx) {

        String id;

        if(ctx.ID().size()==2){
            Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
            id = ctx.ID(1).getText();
        }
        else{
            id = ctx.ID(0).getText();
        }
        Array arr = new Array(id, pila.pop().getValue());
        Print p = new Print(arr);
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

    @Override public void exitIfTrueArray(TACParser.IfTrueArrayContext ctx) {
        String idArray, label;

        if(ctx.ID().size()==3){
            Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
            idArray = ctx.ID(1).getText();
            label = ctx.ID(2).getText();
        }
        else{
            idArray = ctx.ID(0).getText();
            label = ctx.ID(1).getText();
        }

        Array arr = new Array(idArray,pila.pop().getValue());
        Label l = new Label(label);
        IfTrue ift = new IfTrue(arr,l);
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

    @Override public void exitIfFalseArray(TACParser.IfFalseArrayContext ctx) {
        String idArray, label;

        if(ctx.ID().size()==3){
            Statement.labels.put(ctx.ID(0).getText(), Statement.stmnts.size());
            idArray = ctx.ID(1).getText();
            label = ctx.ID(2).getText();
        }
        else{
            idArray = ctx.ID(0).getText();
            label = ctx.ID(1).getText();
        }

        Array arr = new Array(idArray,pila.pop().getValue());
        Label l = new Label(label);
        IfFalse iff = new IfFalse(arr,l);
        Statement.stmnts.add(iff);
    }

}
