public class LessThan extends Operation{

    Operand o1;
    Operand o2;

    public LessThan(Operand o1, Operand o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    public Operand evaluateOperation() {
        int result;

        if(o1.getValue() < o2.getValue())
            result = 1;
        else
            result = 0;

        return new Number(result);
    }
}
