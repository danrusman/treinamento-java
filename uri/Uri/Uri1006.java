package Uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        double a, b, c, media;

        Scanner entrada = new Scanner(System.in);

        do {
            a = entrada.nextDouble();
        } while (a < 0 || a > 10);

        do {
            b = entrada.nextDouble();
        } while (b < 0 || b > 10);

        do {
            c = entrada.nextDouble();
        } while (c < 0 || c > 10);

        media = a* 0.2 + b * 0.3 + c * 0.5;

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();
    }
}
