public class Produccion {

    String prod;
    int numSymbols;
    String LHS;
    String RHS;

    public Produccion(String prod, int numSymbols){
        this.prod = prod;
        this.numSymbols = numSymbols;
        String[] temp = prod.split("->");
        this.LHS = temp[0];
        this.RHS = temp[1];
    }

}
