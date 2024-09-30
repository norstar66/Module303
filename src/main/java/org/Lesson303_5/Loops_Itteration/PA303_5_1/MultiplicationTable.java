package org.Lesson303_5.Loops_Itteration.PA303_5_1;

/**
 * 1: Print a Multiplication Table
 *      Write a program that uses nested for
 *      loops to print a multiplication table.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        //outer loop makes rows
        for (int i = 1; i <= 12; i++) {
            //inner loop makes columns in each row
            for (int j = 1; j <= 12; j++) {
                int product = i * j;
                System.out.printf("%5d",product);
            }
            System.out.println();
        }
    }
}
