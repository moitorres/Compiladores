public class IfTrue extends Statement{

    Operand op1;
    Label label;

    public IfTrue(Operand op1, Label label){
        this.op1 = op1;
        this.label = label;
    }
    public void eval(){
        super.eval();
        if(op1.getValue() == 1){
            Statement.PC = label.getValue();
        }
    }

}
