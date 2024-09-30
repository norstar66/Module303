package org.PA303_4_1;
/**
 * Contains exercises 1 - 4 from PA303.4.2
 * I have utilized a utility class
 *   to implement user input across this package.
 *   Using this here allows me to accomplish all
 *   the goals of these exercises with none of excess steps
 */
import util.UserInputHelper;

public class IfElseStatements {
    public static void main(String[] args) {
        int x = UserInputHelper.getIntInput("Enter an integer: ");

        if (x < 10) {
            System.out.println("The value of x is less than 10 - OUT OF RANGE");
        }
        else if (x >= 10 && x <= 20) {
            System.out.println("The value of x is between 10 and 20 - IN RANGE");
        }
        else if (x >= 20) {
            System.out.println("The value of x is greater than 20 - OUT OF RANGE");
        }
    }
}
