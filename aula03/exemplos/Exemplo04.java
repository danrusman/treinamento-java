package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        String nome = "Daniel";

        //if (nome.equals("Daniel1")) {
        if (nome.equalsIgnoreCase("Daniel")) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }    
}
