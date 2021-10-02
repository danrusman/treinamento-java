package Uri;

import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        int employee, hours;
        double amountPerHour;

        Scanner input = new Scanner(System.in);

        employee = input.nextInt();
        hours = input.nextInt();
        amountPerHour = input.nextDouble();

        System.out.println("NUMBER = " + employee);
        System.out.printf("SALARY = U$ %.2f\n", hours * amountPerHour);

        input.close();

    }
}
