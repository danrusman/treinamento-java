import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int tabuada, i ;//resultado

        i = 0;

        System.out.print("Informe um número para multiplicar: ");
        Scanner entrada = new Scanner(System.in);
        tabuada = entrada.nextInt();

        while (i <= 10) {
            //resultado = tabuada * i;
            //System.out.println(tabuada + " x " + i + " = " + resultado);
            System.out.printf("%d x %2d = %02d\n", tabuada, i, tabuada * i);
            i++;
        }
        entrada.close();
    }
}
