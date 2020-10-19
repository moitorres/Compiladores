public class Print extends Statement{

    Operand operand;

    public Print(Operand operand){
        this.operand = operand;
    }

    public void eval(){
        super.eval();
        System.out.println(operand.getValue());
    }

}
