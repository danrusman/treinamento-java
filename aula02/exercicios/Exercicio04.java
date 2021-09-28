package exercicios;

import java.util.Scanner;

public class Exercicio04 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, quiloWatt, qtdQuiloWatt, valorRealQuiloWatt, valorPago, valorDesconto;

        System.out.println("Informe o salário mínimo: ");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Informe a quantidade de quiloWatt: ");
        qtdQuiloWatt = entrada.nextDouble();

        quiloWatt = qtdQuiloWatt * 1 / 500 * salarioMinimo; 
        valorRealQuiloWatt = quiloWatt;
        valorPago = salarioMinimo * valorRealQuiloWatt;
        valorDesconto = valorPago * 0.85;

        System.out.println("O valor em quiloWatt em reais é de R$" + valorRealQuiloWatt);
        System.out.println("O valor pago é de R$" + valorPago);
        System.out.println("O valor com desconto de 15% é de " + valorDesconto);

        entrada.close();

    }

}
