package Uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner entrada = new Scanner(System.in);

        do {
            nota1 = entrada.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
            }
        } while (nota1 < 0 || nota1 > 10);

        do {
            nota2 = entrada.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            }
        } while (nota2 < 0 || nota2 > 10);

        media = (nota1 + nota2) / 2;

        System.out.printf("media = %.2f\n", media);

        entrada.close();

    }
}
