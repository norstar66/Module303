package org.Lesson303_4_ConditionalStatements.ControlFlow;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }
}
