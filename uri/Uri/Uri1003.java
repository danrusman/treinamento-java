package Uri;

import java.util.Scanner;

/**
 * Uri1003
 */
public class Uri1003 {

    public static void main(String[] args) {
        int a, b, soma;

        Scanner entrada = new Scanner (System.in);

        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        entrada.close();

    }
}