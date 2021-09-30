import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int numero, i = 1;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        System.out.print("Sequência impressa: ");

        while (i <= numero) {
            if (i * 2 <= numero) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
            i = i * 2;
        }

        entrada.close();

    }
}
