package Lab01;

import java.util.Scanner;

public class second_degree_eq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a,b,c
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions");
                } else {
                    System.out.println("No solutions");
                }
            } else {
                double x = -c / b;
                System.out.println("The solution is x = " + x);
            }
        } else {
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("There is an unique solution:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println("One real root (repeated):");
                System.out.println("x = " + x);
            }
        }

        scanner.close();
    }
}
