import java.util.HashMap;
import java.util.Map;

public class AssignArray extends Statement{

    Array array;
    Operand operand;

    public AssignArray(Array array, Operand operand){
        this.array = array;
        this.operand = operand;
    }

    public void eval(){
        super.eval();

        //If the array hasn't been created yet
        Statement.arrays.putIfAbsent(array.id, new HashMap<>());

        Map<Integer, Integer> temp = Statement.arrays.get(array.id);

        temp.put(array.position, operand.getValue());

        Statement.arrays.put(array.id, temp);
    }

}
