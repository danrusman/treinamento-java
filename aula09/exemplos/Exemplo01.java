package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        try {
            System.out.print("Digite um número inteiro: ");
            //numero = teclado.nextInt();
            numero = Integer.parseInt(teclado.nextLine());
            System.out.print("Você digitou " + numero + "\n");

        } catch (InputMismatchException ex) {
            System.out.println("Erro de digitação.");
        }
        catch (NumberFormatException ex) {
            System.out.println("Erro de conversão.");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Fim do programa. ");
            teclado.close();
        }
    }
}
