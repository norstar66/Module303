package org.Lesson303_7.Array.PA1;

public class Task6 {
    public static void main(String[] args) {
        int[] myArray = new int[5];

        //Step 1: Init first element
        myArray[0] = 0;

        //Step2: Set first !0 value
        myArray[1] = 2;
        //Step 3: loop through the remaining elements
        // and double the previous
        for (int i = 2; i < myArray.length; i++) {
            myArray[i] = myArray[i - 1] * 2;
        }
        // Output the result
        for (int j : myArray) {
            System.out.println(j);
        }
    }
}
