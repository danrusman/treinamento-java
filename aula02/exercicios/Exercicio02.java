package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        double n1, n2, media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        media = (n1 + n2) / 2;

        System.out.println("A média do aluno é de " + media);

        entrada.close();

    }

}
