public class ID extends Operand{

    String id;

    public ID(String id){
        this.id = id;
    }

    public int getValue(){
        return Statement.vars.get(id);
    }

}
