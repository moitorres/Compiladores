/**
 * Class that does the function of an LR parser
 * 
 * 
 * @version 1.0, 26/11/20
 * @author Alister Estrada, Moisés Torres
 */

import java.util.function.Function;
import javax.script.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.lang.*;

public class Main {

    //Input example: java Main ./Pruebas/action2.csv ./Pruebas/goto2.csv ./Pruebas/producciones2.txt ./Pruebas/entrada2.txt
    public static void main(String[] args) {

        List<Map<String, String>> action = lee(args[0]); //The actions table is read
        List<Map<String, String>> goto_ = lee(args[1]); //The goTo table is read
        List<Produccion> prods = leeProds(args[2]); //The productions of the grammar are read
        String[] input = leeEntrada(args[3]); //The input to validate is read
        parserLR(input, action, goto_, prods); //Function to run the LR parser
    }

    public static void parserLR(String[] input, List<Map<String, String>> action, List<Map<String, String>> goto_, List<Produccion> prods){
        
        int index = 0; //Index for the position of the current symbol of the input
        String currentSymbol = ""; //String for the current symbol of the input
        int currentState = 0; //Int for the current state of the stack
        String currentAction = ""; //String for the current action (from the action table) according to the state and the symbol
        String resultingString = Arrays.toString(input); //String to store the input going through the productions

        Stack<Map<String, Integer>> semanticValues = new Stack<Map<String, Integer>>(); //Stack of Maps to store the semantic values from the productions
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn"); //Create a nashorn script engine to execute js functions

        ArrayList<String> rsf = new ArrayList<>(); //Arraylist to store the right sentential form of the production at each step

        //Fill the rsf with the initial input from the user
        for(int i=0;i<input.length;i++){
            rsf.add(input[i]);
        }

        //Stack to store the states of the action table. 
        Stack<Integer> stack = new Stack<Integer>(); 
        //It always starts with state 0
        stack.push(0);

        //The program runs through all the symbols from the input
        while(index < input.length){
            
            //The current symbol and the current state are obtainend
            currentSymbol = input[index];
            currentState = stack.peek();

            //The current action is obtained by searching the arraylist of actions
            //First the arraylist index is obtained with the state, and then the map is searched with the current symbol as a key
            currentAction = action.get(currentState).get(currentSymbol);

            //If the current action is a 'shift'. Example: s1
            if(currentAction.charAt(0) == 's'){

                //The state number of the shift is added to the stack
                //Delete the "s" in the string so it only stays the number of the shift
                stack.push(Integer.parseInt(currentAction.replaceAll("s","")));

                //The index increments to search for the next symbol in the next cycle
                index++;

                //The stack and the current action are printed
                System.out.println(resultingString + "  " + stack.toString()  + " " + currentAction);

                /*Semantic Parsing Section*/

                //a new map is created and added to the semantic stack
                Map<String, Integer> temp = new HashMap<>();
                semanticValues.push(temp);
            }

            //If the current action is a 'replace'. Example: r1
            else if(currentAction.charAt(0) == 'r' || currentAction.charAt(0) == 'R'){

                //Get the current production with the action (minus 1, because the productions start at 1 instead of 0)
                //Delete the "r" in the string so it only stays the number of the replace
                Produccion prod = prods.get(Integer.parseInt(currentAction.replaceAll("r",""))-1);

                //The stack and the production are printed
                System.out.println(resultingString + "  " + stack.toString()  + " " + prod.prod);

                //Pop the same number of states as the symbols of the production
                for(int i=0;i<prod.numSymbols;i++){
                    stack.pop();
                }
                                
                //Replace the string with the production in the resultingString
                resultingString = resultingString.replaceFirst(Pattern.quote(prod.RHS.replaceAll(" ",", ")),Matcher.quoteReplacement(prod.LHS));

                //Change the current state and symbol after the pops
                currentState = stack.peek();
                currentSymbol = prod.LHS;

                //The goTo action is obtained using the current state and the current symbol
                String goToState = goto_.get(currentState).get(currentSymbol);
                
                //The state number in the goTo table is added to the stack
                stack.push(Integer.parseInt(goToState));
                
                /*Semantic Parsing Section*/

                try{
                    //The semanticParsing function is called
                    //The semantic values are updated with the function
                    semanticValues = semanticParsing(semanticValues, prod, engine);
                }
                catch(Exception e){
                    System.out.println("Exception: "+e);
                }
            }

            //If the current action is 'accept'
            else if(currentAction.equals("accept")){
                break;
            }

            //Else, there is an error with the action
            else{
                System.out.println("Error in the action");
                System.exit(0); 
            }

        }

        //The stack and the current action are printed
        //This is for the last iteration of the cyle
        System.out.println(resultingString + "  " + stack.toString()  + " " + currentAction);

        //The semantic result is printed
        System.out.println("\n Resultado semántico: "+ semanticValues.pop().get("n") + "\n");
    }

    public static Stack<Map<String, Integer>> semanticParsing(Stack<Map<String, Integer>> semanticValues, Produccion prod, ScriptEngine engine) throws Exception{

        //A temporal arrayList of hashmaps is created to store the hashmaps of the last symbols
        List<Map<String, Integer>> list = new ArrayList<>(); 

        //A new hashMap is added to store the value of the production
        list.add(new HashMap<String, Integer>());

        //Pop the same number of hashmaps according to the number of symbols in the production and add them to the list
        //They are all added to position 1 because they are in reverse order in the stack 
        for(int i=0; i<prod.numSymbols; i++){
            list.add(1, semanticValues.pop());
        }   
        
        //Create the function 'f' (using the script engine) to execute the js function stored in the production
        @SuppressWarnings("unchecked")
        Function<Object,Object> f = (Function<Object,Object>)engine.eval(String.format("new java.util.function.Function(%s)", prod.function));
        //Apply the function to the temporal list
        f.apply(list);

        //Push the resulting value in the list to the stack
        semanticValues.push(list.get(0));

        //The updated semanticValues is returned
        return semanticValues;
    }


    //Function for reading the actions and goTo table from the csv
    public static List<Map<String, String>> lee(String filename){

        //List that will store all the maps of the csv
        List<Map<String, String>> result = new ArrayList<>();
        //Array for the symbols (headers) of the csv
        String[] symbols;

        //Temporal string to store the line
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            //Read the first line to store the symbols (headers) in a separate array
            line = br.readLine();
            //Split into 'symbols' array and use comma as separator
            symbols = line.split(",");

            //Read the rest of the csv
            while ((line = br.readLine()) != null) {
                
                //Trnsform the line to lowercase
                line = line.toLowerCase();

               //Split into array and use comma as separator
                String[] actions = line.split(",", -1);

                //Create a temporal map to store the actions of this line
                Map<String, String> temp = new HashMap<>();
                
                //There will be one action for each symbol (header)
                for(int i=0;i<symbols.length; i++){

                    //The symbol is used as a key and the action is used as the value
                    //And they are inserted to the temporal map
                    temp.put(symbols[i],actions[i]);
                }
                //Add the map to the resulting list
                result.add(temp);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    //Function for reading the productions
    public static List<Produccion> leeProds(String filename){

        //List that will store all the productions of the csv
        List<Produccion> result = new ArrayList<>();

        //Temporal string to store the line
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            //Read the csv
            while ((line = br.readLine()) != null) {

                //Split into array and use comma as separator
                String[] temp = line.split(",");

                //Create a new production object
                Produccion prod = null;

                //If the length of the production array is equal to 2, it means the user didn't add a semantic function to their productions
                if(temp.length == 2){
                    //The first value is the string of the production
                    //The second value is the number of symbols of the production
                    prod = new Produccion(temp[0], Integer.parseInt(temp[1]));
                }
                //If the user added a semantic function
                else{

                    //String to store the function
                    String function = temp[2];
                    //If there was a comma inside the semantic function it would get split in the temporal array as well
                    //So this cycle checks if therea are any missing parts of the function and adds them to the string
                    for(int i=3; i<temp.length; i++){
                        function += "," + temp[i];
                    }

                    //The first value is the string of the production
                    //The second value is the number of symbols of the production
                    //The third value is the semantic function of the production
                    prod = new Produccion(temp[0], Integer.parseInt(temp[1]), function);
                }

                //Add the production to the resulting list
                result.add(prod);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    //function for reading the input string for the LR
    public static String[] leeEntrada(String filename){

        //String array for the resulting input
        //One symbol from the input will be stored at each position of the array
        String[] result = null;

        //Temporal string to store the line
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            //Read the input
            line = br.readLine();

            //Split the input into its different symbols
            //The space was used as a separator for the split
            result = line.split(" ");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}