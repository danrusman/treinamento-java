package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String [] nome = new String[7];

        Scanner entradaNome = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome: ");
            nome[i] = entradaNome.nextLine();
        }

        System.out.println("Nome inverso: ");

        for (int i = nome.length - 1; i >= 0; i--) {
            System.out.print(nome[i] + " ");
        }

        entradaNome.close();
    }
}
