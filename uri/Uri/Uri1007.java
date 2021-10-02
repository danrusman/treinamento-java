package Uri;

import java.util.Scanner;

/**
 * Uri1007
 */
public class Uri1007 {

    public static void main(String[] args) {
        int value1, value2, value3, value4;

        Scanner inputValue = new Scanner(System.in);

        value1 = inputValue.nextInt();
        value2 = inputValue.nextInt();
        value3 = inputValue.nextInt();
        value4 = inputValue.nextInt();

        System.out.printf("DIFERENCA = %d\n", (value1 * value2 - value3 * value4));

        inputValue.close();
    }
}
