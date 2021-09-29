package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double salario;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ifnorme o seu salário: ");
        salario = entrada.nextDouble();
    
        if (salario <= 600) {
            System.out.println("Isento de desconto INSS");
        } else {
            if (salario <= 1200) {
                System.out.println("Desconto de 20% de INSS");
            } else {
                if (salario <= 2000) {
                    System.out.println("Desconto de 25% de INSS");
                } else {
                    System.out.println("Desconto de 30% de INSS");
                }
            }
        }

        entrada.close();
    }
}
