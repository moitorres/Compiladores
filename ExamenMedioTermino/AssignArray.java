import java.util.HashMap;
import java.util.Map;

public class AssignArray extends Statement{

    Array array;
    int value;

    public AssignArray(Array array, int value){
        this.array = array;
        this.value = value;
    }

    public void eval(){
        super.eval();

        //If the array hasn't been created yet
        Statement.arrays.putIfAbsent(array.id, new HashMap<>());

        Map<Integer, Integer> temp = Statement.arrays.get(array.id);

        temp.put(array.position, value);

        Statement.arrays.put(array.id, temp);
    }

}
