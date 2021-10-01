package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        int numero, chances;

        chances = 3;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite um número positivo: ");
            numero = entrada.nextInt();
            chances--;
        } while (numero < 0 && chances > 0);

        if (chances > 0) {
            System.out.println("Obrigado");
        } else {
            System.out.println("Leia com mais atenção!");
        }

        entrada.close();
    }
}
