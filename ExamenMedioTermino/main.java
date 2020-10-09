import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            tacLexer lexer = new tacLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tacParser parser = new tacParser(tokens);
            //ParseTree tree = parser.prog();
            //System.out.println(tree.toStringTree(parser));

            /*ParseTreeWalker walker = new ParseTreeWalker();
            MiListener listener = new MiListener();
            walker.walk(listener, tree);*/

        }
        catch(Exception e) {
            System.out.println("Error"); }
    }




}


