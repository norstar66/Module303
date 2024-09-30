package org.Sept19.Review;

import java.util.Scanner;

public class ReviewSept19 {
    public static void main(String[] args) {
        // Declare two integer variables:
        int firstNumber;
        int secondNumber;
        // Declare a Scanner object:
        Scanner input = new Scanner(System.in);

        // A loop that keeps looping if the user enters an invalid number
        do {
            // Ask the user for the first number:
            System.out.print("Enter your first number (1-100): ");
            firstNumber = input.nextInt();

            System.out.print("Enter your second number (1-100): ");
            secondNumber = input.nextInt();

            if (firstNumber > 1 && firstNumber < 100) {
                // They are correct - the number is valid
                System.out.println("The first number is valid: " + firstNumber);

            } else {
                System.out.println("Your first number is not within the range (1-100).");
            }
        } while (firstNumber < 1 || firstNumber > 100); // Keep looping until valid first number is entered

        // A loop for the second number:
        do {
            // Ask the user for the second number:
            System.out.print("Enter your second number (1-100): ");
            secondNumber = input.nextInt();

            if (secondNumber >= 1 && secondNumber <= 100) {
                // They are correct - the number is valid
                System.out.println("The second number is valid: " + secondNumber);
            } else {
                System.out.println("Your second number is not within the range (1-100).");
            }
        } while (secondNumber < 1 || secondNumber > 100); // Keep looping until valid second number is entered

    }
}
