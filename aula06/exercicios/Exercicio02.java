package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int numeroMenor = Integer.MAX_VALUE;
        int []listaNumero = new int [3];

        Scanner entradaNumero = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            listaNumero[i] = entradaNumero.nextInt();
            numeroMenor = verificaNumeroMenor(listaNumero[i], numeroMenor);
        }

        System.out.println("O menor número digitado foi: " + numeroMenor);
        entradaNumero.close();
    }

    static int verificaNumeroMenor(int valor, int numeroMenor) {
        if (valor < numeroMenor) {
            numeroMenor = valor;
        }

        return numeroMenor;
    }
}
