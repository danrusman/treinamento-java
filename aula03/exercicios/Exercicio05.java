package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String senha;
        boolean senhaValida;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a senha: ");
        senha = entrada.nextLine();

        // equals = exatamente igual (Daniel e daniel são diferentes)
        // equalsIgnoreCase = desconsidera maiúsculas e minúsculas (Daniel e daniel são iguais)

        senhaValida = senha.equals("R10p5");

        //if (senha.equals("R10p5")) {
        if (senhaValida) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }

        entrada.close();
    }
}
