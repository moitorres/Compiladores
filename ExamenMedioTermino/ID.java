public class ID extends Operand{

    String id;

    public ID(String id){
        this.id = id;
    }

    public int getValue(){
        /*System.out.println(id);
        System.out.println(Statement.vars.get(id));*/
        return Statement.vars.get(id);
    }

}
