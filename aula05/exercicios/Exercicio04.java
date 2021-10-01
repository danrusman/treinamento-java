package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        final double [] NOTA_ALUNO = new double[5];
        double soma = 0, media = 0;
        int qtdNotaAcimaMedia = 0;

        Scanner entradaNota = new Scanner(System.in);

        for (int i = 0; i < NOTA_ALUNO.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            NOTA_ALUNO[i] = entradaNota.nextDouble();
            soma = soma + NOTA_ALUNO[i];
        }

        media = soma / NOTA_ALUNO.length;

        System.out.println("\nTodas as notas: ");
        for (int i = 0; i < NOTA_ALUNO.length; i++) {
            System.out.println(NOTA_ALUNO[i]);            

            if (NOTA_ALUNO[i] > media) {
                qtdNotaAcimaMedia += 1;
            }

        }

        System.out.printf("\nQuantidade de notas acima da média: %d\n", qtdNotaAcimaMedia);

        System.out.print("\nNotas que estão acima da média: \n");
        for (int i = 0; i < NOTA_ALUNO.length; i++) {
            if (NOTA_ALUNO[i] > media) {
                System.out.println(NOTA_ALUNO[i]);
            }
        }

        entradaNota.close();
    }
}
