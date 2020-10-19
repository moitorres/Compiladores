public class Divide extends Operation{

    Operand o1;
    Operand o2;

    public Divide(Operand o1, Operand o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    public Operand evaluateOperation() {
        int result = o1.getValue() / o2.getValue();
        return new Number(result);
    }
}
