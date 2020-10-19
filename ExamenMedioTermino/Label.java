public class Label extends Statement{
    String label;
    int position;

    public Label(String label){
        this.label = label;
        this.position = Statement.labels.size();
    }

    public void eval(){
        super.eval();
        Statement.labels.put(label,position);
    }
    public int getValue(){
        return Statement.labels.get(label);
    }
}
