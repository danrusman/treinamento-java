package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        int [] numeros = new int[5];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um valor inteiro: ");
            numeros[i] = entrada.nextInt();
        }


        System.out.println("Você digitou: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();

    }
}
