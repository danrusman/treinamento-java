package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        a = entrada.nextInt();
        System.out.print("Digite o segundo lado: ");
        b = entrada.nextInt();
        System.out.print("Digite o terceiro lado: ");
        c = entrada.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Não existe triângulo");
        } else {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else {
                if (a == b || b == c || a == c) {
                    System.out.println("Triângulo isósceles");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            }
        }

        entrada.close();

    }
}
