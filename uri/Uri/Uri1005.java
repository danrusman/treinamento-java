package Uri;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner entradaNota = new Scanner(System.in);

        do {
            nota1 = entradaNota.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            nota2 = entradaNota.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        media = (nota1 * 3.5 + nota2 * 7.5) / 11;

        if (media > 10) {
            media = 10;
        }

        System.out.printf("MEDIA = %.5f\n", media);
        
        entradaNota.close();
    }
}
