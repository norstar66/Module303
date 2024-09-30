package org.Lesson303_7.Array.PA1;

public class Task8 {
    public static void main(String[] args) {
        String[] myArray = {"ABC", "DEF", "GHI", "JKL", "MNO"};
        //print as is
        System.out.print("Before the swap: ");
        for (String element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        //create variables to call the indices needed
        int zeroIndex = 0;
        int midIndex = myArray.length / 2;

        //temporary variable for the value of midIndex
        String temp = myArray[midIndex];
        myArray[midIndex] = myArray[zeroIndex];
        myArray[zeroIndex] = temp;

        //Print again
        System.out.print("After the swap: ");
        for (String element : myArray) {
            System.out.print(element + " ");
        }
    }
}
