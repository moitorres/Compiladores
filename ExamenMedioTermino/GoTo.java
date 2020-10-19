public class GoTo extends Statement{

    Label label;

    public GoTo(Label label){
        this.label = label;
    }

    public void eval(){
        super.eval();
        Statement.PC = label.getValue();
    }

}
