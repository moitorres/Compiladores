
public class IfFalse extends Statement{
    Operand op1;
    Label label;

    public IfFalse(Operand op1, Label label){
        this.op1 = op1;
        this.label = label;
    }
    public void eval(){
        super.eval();
        if(op1.getValue() == 0){
            Statement.PC = label.getValue();
        }
    }

}
