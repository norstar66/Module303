package org.PA303_4_1;

import util.UserInputHelper;

/**
 * This is a class for completing Exercise 6
 * from PA303.4.2
 * 6. Write a program that accepts an integer
 * between 1 and 7 from the user. Use a switch
 * statement to print out the corresponding weekday.
 * Print “Out of range” if the number is less than 1
 * or greater than 7. Do not forget to include “break”
 * statements in each of your cases.
 */
public class SwitchCaseExample {
    public static void main(String[] args) {
        int sevenDays = UserInputHelper.getIntInput("Enter a number between 1 and 7 ");

        switch (sevenDays) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Out of Range");
        }
    }
}
