package exercicios.exercicio01;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Especial");
            System.out.println("3- Nova Conta Poupança");
            System.out.println("4- Depositar");
            System.out.println("5- Sacar");
            System.out.println("6- Consultar saldo");
            System.out.println("7- Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1");
                    break;

                case 2:
                    System.out.println("Opção 2");
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                default: // se não for nenhuma das opções
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        entrada.close();
    }
}