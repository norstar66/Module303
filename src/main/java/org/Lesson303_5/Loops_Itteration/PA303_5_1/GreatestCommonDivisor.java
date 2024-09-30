package org.Lesson303_5.Loops_Itteration.PA303_5_1;

import util.UserInputHelper;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Calculating the Greatest Common Divisor");
        //print purpose of the program to user
        System.out.println("To determine the Greatest Common Divisor between two integers,");
        // take input of 2 integers -> num1, num2
        int num1 = UserInputHelper.getIntInput("please enter the first integer: ");
        int num2 = UserInputHelper.getIntInput("please enter the second integer: ");
        // call findLCD method;
        int lcd = findLCD(num1, num2);
        //print result
        System.out.println("The Greatest Common Divisor of "+num1+" and "+num2+" is: " + lcd);
    }

    //Euclidean algorithm method to calculate GCD
    private static int findLCD(int num1, int num2) {
        while (num2 != 0) { //check if num2 is 0
            int temp = num2; //temp var for switch comparison
            num2 = num1 % num2; //update num2 w/ remainder
            num1 = temp; //set num1 to the previous value of num2
            }
        return num1; //when num2 == 0, num1 == GCD
    }
}
