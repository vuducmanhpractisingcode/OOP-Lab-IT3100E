package Lab01;

import java.util.Scanner;

public class Linear_eq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input the first number
        System.out.println("Enter a:");
        double a = scanner.nextDouble();

        // input the second number
        System.out.println("Enter b:");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solution.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double solution = -b / a;
            System.out.println("The solution is x = " + solution);
        }
        scanner.close();
    }
}
