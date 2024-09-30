package util;

import java.util.Scanner;

public class UserInputHelper {

    // Creating a Scanner Object that can be used across methods
    private static final Scanner scanner = new Scanner(System.in);

    // This method handles integer input
    public static int getIntInput(String prompt) {
        System.out.print(prompt); // Print the prompt
        return scanner.nextInt(); // Return user input
    }

    // This method handles float input
    public static float getFloatInput(String prompt) {
        System.out.print(prompt); // Print the prompt
        return scanner.nextFloat(); // Return user input
    }

    // This method handles double input
    public static double getDoubleInput(String prompt) {
        System.out.print(prompt); // Print the prompt
        return scanner.nextDouble(); // Return user input
    }

    // This method handles string input
    public static String getStringInput(String prompt) {
        System.out.print(prompt); // Print the prompt
        return scanner.next(); // Return user input
    }
}
