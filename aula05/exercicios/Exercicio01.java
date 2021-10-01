package exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {
    public static void main(String[] args) {
        int maiorNumero = 0, numeroDigitado;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        maiorNumero = entrada.nextInt();

         //maiorNumero = Integer.MIN_VALUE; // o menor inteiro possível
         //menorNumero = Integer.MAX_VALUE; // o maior inteiro possível

        for (int i = 1; i <= 9; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }
        }

        System.out.println("O maior número digitado foi: " + maiorNumero);

        entrada.close();
    }

}
