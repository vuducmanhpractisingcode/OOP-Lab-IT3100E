package Lab01;

import java.util.Scanner;
//123
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String strName = keyboard.nextLine();
        System.out.println("how old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        System.out.println("Mrs/Ms. " + strName + "," + iAge + " years old." + " Your height is " + dHeight + ".");
        keyboard.close();
    }
}
