public class Array extends Operand{

    String id;
    int position;

    public Array(String id, int position){
        this.id = id;
        this.position = position;
    }

    public int getValue(){
        return Statement.arrays.get(id).get(position);
    }

}
