package Lab01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.println("First double number: ");
        double x1 = scanner.nextDouble();

        // Input second number
        System.out.println("Second double number: ");
        double x2 = scanner.nextDouble();

        // Calculate sum
        double sum = x1 + x2;
        System.out.println("Sum: " + sum);

        // Calculate difference
        double difference = x1 - x2;
        System.out.println("Difference: " + difference);

        // Calculate product
        double product = x1 * x2;
        System.out.println("Product: " + product);

        // Check if the second number is zero or not -> avoid division by 0
        if (x2 != 0) {
            double quotient = x1 / x2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error! Can't divide by zero!");
        }
        scanner.close();
    }
}