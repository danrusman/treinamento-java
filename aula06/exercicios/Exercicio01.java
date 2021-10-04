package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero;
        boolean resultado;

        Scanner entradaNumero = new Scanner(System.in);

        System.out.println("Informe um número para verificar se é par ou não");
        numero = entradaNumero.nextInt();
        entradaNumero.close();

        resultado = numeroPar(numero);
        System.out.print("O número é par? " + resultado);

    }

    static boolean numeroPar(int numero) {
       /* if (numero % 2 == 0) {
            return true;
        }

        return false;*/
        return(numero % 2 == 0);
    }
}
