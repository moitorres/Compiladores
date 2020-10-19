import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(System.in);

            TACLexer lexer = new TACLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TACParser parser = new TACParser(tokens);
            ParseTree tree = parser.prog();
            MiListener listener = new MiListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);

            //System.out.println(Arrays.toString(Statement.stmnts.toArray()));

            Statement.exec();
        }
        catch(Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }

}
