package Lab01;

import java.util.Scanner;

public class Linear_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input numbers
        System.out.println("Enter a11:");
        double a11 = scanner.nextDouble();
        System.out.println("Enter a12:");
        double a12 = scanner.nextDouble();
        System.out.println("Enter b1:");
        double b1 = scanner.nextDouble();
        System.out.println("Enter a21:");
        double a21 = scanner.nextDouble();
        System.out.println("Enter a22:");
        double a22 = scanner.nextDouble();
        System.out.println("Enter b2:");
        double b2 = scanner.nextDouble();

        Double D = a11 * a22 - a21 * a12;
        Double D1 = b1 * a22 - b2 * a12;
        Double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solutions.");
            }
        } else {
            Double x1 = D1 / D;
            Double x2 = D2 / D;
            System.out.printf("Unique solutions: x1 = %.2f and x2 = %.2f", x1, x2);
        }
        scanner.close();
    }
}
