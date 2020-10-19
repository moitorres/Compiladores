public class Assign extends Statement{
    String id;
    Operand operand;

    public Assign(String id, Operand operand){
        this.id = id;
        this.operand = operand;
    }

    public void eval(){
        Statement.vars.put(id, operand.getValue());
        super.eval();
    }

}
