package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero;
        double metade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = teclado.nextInt();

        if (numero > 20) {
            int divisor = 2;
            metade = (double)numero / divisor; // casting = "forçar" uma conversão
            System.out.println("A metade do número é " + metade);
        }

        teclado.close();

    }
    
}
