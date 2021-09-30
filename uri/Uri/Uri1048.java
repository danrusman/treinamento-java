package Uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        double salario, novoSalario = 0, percentual = 0;

        Scanner entrada = new Scanner(System.in);

        salario = entrada.nextFloat();

        if (salario >= 0 && salario <= 400) {
            percentual = 15;
            novoSalario = salario * (1 + percentual / 100);
        }
        else if (salario >= 400.01 && salario <= 800) {
            percentual = 12;
            novoSalario = salario * (1 + percentual / 100);
        }
        else if (salario >= 800.01 && salario <= 1200) {
            percentual = 10;
            novoSalario = salario * (1 + percentual / 100);
        }
        else if (salario >= 1200.01 && salario <= 2000) {
            percentual = 7;
            novoSalario = salario * (1 + percentual / 100);
        }
        else if (salario > 2000) {
            percentual = 4;
            novoSalario = salario * (1 + percentual / 100);
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
        System.out.printf("Em percentual: %.0f %%\n", percentual);

        entrada.close();
        
    }
}
