
public class Produccion {

    String prod; //String to store the entire production
    int numSymbols; //Int for the number of symbols in the production
    String LHS; //String to store the left hand side of the production
    String RHS; //String to store the right hand side of the production
    String function; //String to store the semantic function of the production

    //The constructor receives the string for the production, the number of symbols and the semantic function
    public Produccion(String prod, int numSymbols, String function){
        this.prod = prod;
        this.numSymbols = numSymbols;
        this.function = function;

        //To obtain the LHS and RHS part of the production, the production string is split using the arrow key as a separator
        String[] temp = prod.split("->");
        this.LHS = temp[0];
        this.RHS = temp[1];
    }

    //Constructor that doesn't receive the semantic function
    public Produccion(String prod, int numSymbols){
        this.prod = prod;
        this.numSymbols = numSymbols;

        //To obtain the LHS and RHS part of the production, the production string is split using the arrow key as a separator
        String[] temp = prod.split("->");
        this.LHS = temp[0];
        this.RHS = temp[1];
    }

}
