import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int acumulaPar = 0, acumulaImpar = 0, numero;
        //final int QTD_NUMEROS = 10; // final = constante, não muda de valor

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                acumulaPar += 1;
            } else {
                acumulaImpar += 1;
            }
        }

        System.out.println("O total de pares é: " + acumulaPar);
        System.out.println("O total de ímpares é: " + acumulaImpar);

        entrada.close();
    }
}
