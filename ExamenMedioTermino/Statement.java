import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract public class Statement {
    public static List<Statement> stmnts = new ArrayList<>();
    public static Map<String, Integer> vars = new HashMap<>();
    public static Map<String, Map<Integer, Integer> > arrays = new HashMap<>();
    public static Map<String, Integer> labels = new HashMap<>();
    public static int PC = 0;

    void eval(){
        PC++;
    }

    static final void exec(){
        PC=0;
        while(PC < stmnts.size()) {
            stmnts.get(PC).eval();
        }
    }
}
