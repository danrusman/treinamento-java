package exercicios;

import java.util.Scanner;

public class Exercicio04 {
 
    public static void main(String[] args) {
        double salarioMinimo, valorTotal,valorQuiloWatt, valorDesconto;
        int qtdQuiloWattConsumido;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salário mínimo: ");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Informe a quantidade de quiloWatt: ");
        qtdQuiloWattConsumido = entrada.nextInt();

        valorQuiloWatt = salarioMinimo / 500;
        valorTotal = valorQuiloWatt * qtdQuiloWattConsumido;
        valorDesconto = valorTotal * (1 - 0.15); // ou 0.85

        System.out.printf("O valor em quiloWatt em reais é de R$ %.2f\n", valorQuiloWatt);
        System.out.printf("O valor pago é de R$ %.2f\n", valorTotal);
        System.out.printf("O valor com desconto de 15%% é de R$ %.2f\n", valorDesconto);

        entrada.close();
    }
}
