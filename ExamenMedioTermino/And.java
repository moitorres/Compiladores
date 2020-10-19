public class And extends Operand{

    Operand o1;
    Operand o2;

    public And(Operand o1, Operand o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    public int getValue() {
        int result;

        if( (o1.getValue() == 1) && (o2.getValue() == 1))
            result = 1;
        else
            result = 0;

        return result;
    }
}
