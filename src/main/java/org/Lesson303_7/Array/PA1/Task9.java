package org.Lesson303_7.Array.PA1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 9, 13, 1, 0};

        Arrays.sort(myArray);
        System.out.print("\nAscending order: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i < myArray.length - 1) {
                System.out.print(", ");
            }
        }
        int smallNum = myArray[0];
        int bigNum = myArray[myArray.length - 1];
        System.out.println("\nThe smallest number is " + smallNum);
        System.out.println("The biggest number is " + bigNum);
    }
}
