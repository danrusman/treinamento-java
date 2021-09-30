package Uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        double valor, media, soma = 0;
        int qtdNumeroPositivo = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            valor = entrada.nextDouble();
            if (valor > 0) {
                soma = soma + valor;
                qtdNumeroPositivo += 1;
            }
        }

        media = soma / qtdNumeroPositivo;

        System.out.println(qtdNumeroPositivo + " valores positivos");
        System.out.printf("%.1f\n", media);

        entrada.close();

    }
}
