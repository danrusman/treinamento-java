package examples;
public class Exemplo07 {

    public static void main(String[] args) {
        // operadores de incremento/decremento
        int numero = 10;

        numero++; // soma 1 no valor da variável

        System.out.println(numero); // 11

        // numero = numero + 1; altera o conteúdo da variável
        System.out.println(numero + 1); // 12 não altera o conteúdo

        System.out.println(numero); // 11

        numero--; // subtrai 1 do valor da variável

        System.out.println(numero); // 10

        // Outros operdores

        numero = 10;

        // numero = numero + 5;
        // += -= *= /=
        numero += 5;

        System.out.println(numero); // 15
    }
    
}
