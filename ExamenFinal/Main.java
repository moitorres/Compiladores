import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Map<String, String>> action = lee(args[0]);
        List<Map<String, String>> goto_ = lee(args[1]);
        List<Produccion> prods = leeProds(args[2]);
        String[] input = leeEntrada(args[3]);
        analyzer(input, action, goto_, prods);

    }

    public static void analyzer(String[] input, List<Map<String, String>> action, List<Map<String, String>> goto_, List<Produccion> prods){
        
        
        int index = 0; //Index for the position of the current symbol of the input
        String currentSymbol = ""; //String for the current symbol of the inpuut
        int currentState = 0; //Int for the current state of the stack
        String currentAction = ""; //String for the current action according to the state and the symbol
        String resultingString = "$"; //String to store the input going through the productions
        String stackString = "";

        //Stack to store the states of the action table. It always starts with state 0
        Stack<Integer> stack = new Stack<Integer>(); 
        stack.push(0);

        while(index < input.length){
            
            currentSymbol = input[index];
            currentState = stack.peek();

            //The current action is obtained by searching the arraylist first by index with the state, and then searching the map with the current symbol as a key
            currentAction = action.get(currentState).get(currentSymbol);

            //Change the stack to a string before the stack is changed. So it can be printed properly at the end of the loop
            stackString = stack.toString();

            //If the current action is a 'shift'. Example: s1
            if(currentAction.charAt(0) == 's'){

                //The stack and the current action are printed
                System.out.println(resultingString + "\t" + stack.toString()  + " " + currentAction);

                //The state of the shift is added to the stack
                stack.push(Character.getNumericValue(currentAction.charAt(1)));
                //The symbol is added to the resulting string
                resultingString += currentSymbol;
                //The symbol is changed to the next one
                index++;
            }

            //If the current action is a 'replace'. Example: r1
            else if(currentAction.charAt(0) == 'r'){

                //Get the current prod from the action (minus 1, because the productions start at 1 instead of 0)
                Produccion prod = prods.get(Character.getNumericValue(currentAction.charAt(1) - 1));
                //Change the action so it prints the replace production correctly at the end
                currentAction = currentAction + ": " + prod.prod;

                //The stack and the current action are printed
                System.out.println(resultingString + "\t" + stack.toString()  + " " + currentAction);

                //Pop the same number of states as the symbols of the production
                for(int i=0;i<prod.numSymbols;i++){
                    stack.pop();
                }

                //Replace the string with the production in the resultingString
                resultingString = resultingString.replace(prod.RHS, prod.LHS);

                //Change the current state and symbol after the pops
                currentState = stack.peek();
                currentSymbol = prod.LHS;

                String goToState = goto_.get(currentState).get(currentSymbol);

                stack.push(Integer.parseInt(goToState));
                
            }

            //If the current action is 'accept'
            else if(currentAction.equals("accept")){
                break;
            }

            //Else, there is an error with the action
            else{
                System.out.println("Error in the action");
            }

        }

        //The stack and the current action are printed
        System.out.println(resultingString + "\t" + stack.toString()  + " " + currentAction);
    }

    //Function for reading the actions and goTo table from the csv
    public static List<Map<String, String>> lee(String filename){

        //List that will store all the maps of the csv
        List<Map<String, String>> result = new ArrayList<>();
        //Array for the symbols of the csv
        String[] symbols;

        //Temporal string to store the line
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            //Read the first line to store the symbols in a separate array
            line = br.readLine();
            symbols = line.split(",");

            //Read the rest of the csv
            while ((line = br.readLine()) != null) {
                
                // use comma as separator
                String[] actions = line.split(",", -1);

                //Create a temporal map to store the actions of this line
                Map<String, String> temp = new HashMap<>();

                for(int i=0;i<symbols.length; i++){

                    temp.put(symbols[i],actions[i]);
                }
                //Add the map to the results list
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

        List<Produccion> result = new ArrayList<>();

        //Temporal string to store the line
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            //Read the csv
            while ((line = br.readLine()) != null) {

                //Eliminate whitespace
                line = line.replaceAll("\\s+","");
                // use comma as separator
                String[] temp = line.split(",");
                //Create a new production with the values of this line
                Produccion prod = new Produccion(temp[0],Integer.parseInt(temp[1]));
                //Add the production to the list
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

        //Resulting input string
        String[] result = null;

        //Temporal string to store the line
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            //Read the input
            line = br.readLine();

            //split the input into its different characters
            result = line.split(" ");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}