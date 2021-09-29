package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double numero1, numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = teclado.nextDouble();

        System.out.println("Ordem decrescente:");

        if (numero1 > numero2) {
            System.out.printf("%.2f e %.2f", numero1, numero2);
        } else {
            System.out.printf("%.2f e %.2f", numero2, numero1);

        }

        teclado.close();

    }
}
