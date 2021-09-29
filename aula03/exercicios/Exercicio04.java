package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double salarioBruto, valorPrestacao, limiteEmprestimo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário bruto: ");
        salarioBruto = entrada.nextDouble();
        System.out.print("Informe o valor da prestação: ");
        valorPrestacao = entrada.nextDouble();

        limiteEmprestimo = salarioBruto * 0.3;

        System.out.printf("Limite Empréstimo: %.2f\n", limiteEmprestimo);

        if (valorPrestacao <= limiteEmprestimo) {
            System.out.println("Você tem direito ao empréstimo.");
        } else {
            System.out.println("Solicitação de empréstimo negado.");
        }

        entrada.close();
    }
    
}
