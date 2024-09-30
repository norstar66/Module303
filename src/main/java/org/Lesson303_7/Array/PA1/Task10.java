package org.Lesson303_7.Array.PA1;

public class Task10 {
    public static void main(String[] args) {
        Object[] myArray = {13, "More", "Java", "Please", 1.681};

        System.out.print("Array Contains: ");

        // Use a traditional for loop to control the comma placement
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            // Print a comma after every element except the last one
            if (i < myArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
