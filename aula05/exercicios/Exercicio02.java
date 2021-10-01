package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double mediaAluno, mediaTurma, acumularMediaAluno, acumularMediaTurma = 0;
        final int NUMERO_ALUNOS = 3;
        final int NUMERO_TURMAS = 4;

        Scanner entradaMediaAluno = new Scanner(System.in);

        for (int turma = 1; turma <= NUMERO_TURMAS; turma++) {
            System.out.println("--------- TURMA " + turma + " ---------");
            acumularMediaAluno = 0;
            for (int aluno = 1; aluno <= NUMERO_ALUNOS; aluno++) {
                mediaAluno = 0;
                System.out.print("Media do aluno " + aluno + ": ");
                mediaAluno = entradaMediaAluno.nextDouble();
                acumularMediaAluno += mediaAluno;
            }
            mediaTurma = acumularMediaAluno / NUMERO_ALUNOS;
            acumularMediaTurma += mediaTurma;

            System.out.printf("Media da turma %2d: %.2f\n", turma, mediaTurma);
        }

        System.out.printf("Média geral: %.2f\n", acumularMediaTurma / NUMERO_TURMAS);

        entradaMediaAluno.close();
    }
}
