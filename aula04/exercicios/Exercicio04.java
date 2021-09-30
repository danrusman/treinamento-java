import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int soma = 0, numero = 1, i = 0;

        Scanner entrada = new Scanner(System.in);

        while (numero != 0) {
            i++;
            System.out.print("Digite o " + i + "º número: ");
            numero = entrada.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma dos números é de " + soma );

        entrada.close();
    }
}
