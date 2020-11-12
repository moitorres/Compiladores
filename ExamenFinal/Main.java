import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Map<String, String>> action = lee(args[0]);
        List<Map<String, String>> goto_ = lee(args[1]);
        List<Produccion> prods = leeProds(args[2]);
        String[] entrada = leeEntrada(args[3]);
        analyzer(entrada, action, goto_, prods);

    }

    public static void analyzer(String[] entrada, List<Map<String, String>> action, List<Map<String, String>> goto_, List<Produccion> prods){
        

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
                String[] actions = line.split(",");

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

            //Read the rest of the csv
            while ((line = br.readLine()) != null) {

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