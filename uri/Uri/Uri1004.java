package Uri;

import java.util.Scanner;

/**
 * Uri1004
 */
public class Uri1004 {
    public static void main(String[] args) {
        int num1, num2, prod;

        Scanner entrada = new Scanner(System.in);

        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        prod = num1 * num2;

        System.out.println("PROD = " + prod);

        entrada.close();

    }   
}