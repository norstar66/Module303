package org.Lesson303_7.Array.PA1;

public class Task7 {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};  // Create an array with 5 elements

        // Loop through the array
        for (int i = 0; i < myArray.length; i++) {
            // Print if is NOT the middle element
            if (i != myArray.length / 2) {
                System.out.println("Element at index " + i + ": " + myArray[i]);
            }
        }
    }
}
