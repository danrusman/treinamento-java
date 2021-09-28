package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        double salario, novoSalario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        salario = entrada.nextDouble();

        novoSalario = salario + salario * 0.25;

        System.out.println("O seu novo salário é de R$" + novoSalario);

        entrada.close();
    }
}
