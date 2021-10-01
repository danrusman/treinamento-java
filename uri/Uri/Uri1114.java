package Uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        int senha;

        Scanner entrada = new Scanner(System.in);

        do {
            senha = entrada.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }

        } while (senha != 2002);

        System.out.println("Acesso Permitido");

        entrada.close();
    }
}
