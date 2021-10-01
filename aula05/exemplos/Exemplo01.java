package exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite um número positivo: ");
            numero = entrada.nextInt();
        } while (numero < 0);

        entrada.close();
    }
}
