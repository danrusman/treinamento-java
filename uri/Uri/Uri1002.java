package Uri;

import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        double raio, area;

        Scanner entrada = new Scanner(System.in);

        raio = entrada.nextDouble();

        area = 3.14159 * Math.pow(raio, 2); // Valor Pi para este problema: 3.14159

        System.out.printf("A=%.4f\n", area);

        entrada.close();
    }
}
