public class Subtract extends Operand{

    Operand o1;
    Operand o2;

    public Subtract(Operand o1, Operand o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    public int getValue() {
        return o1.getValue() - o2.getValue();
    }
}
