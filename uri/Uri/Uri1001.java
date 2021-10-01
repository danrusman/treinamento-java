package Uri;

import java.util.Scanner;

/**
 * Uri1001
 */
public class Uri1001 {

    public static void main(String[] args) {
        int A, B;

        Scanner entrada = new Scanner(System.in);

        A = entrada.nextInt();
        B = entrada.nextInt();

        System.out.printf("X = %d\n", (A + B));

        entrada.close();
    }
}