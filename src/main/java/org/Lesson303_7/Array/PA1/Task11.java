package org.Lesson303_7.Array.PA1;
import util.UserInputHelper; // Import the helper class

public class Task11 {
    public static void main(String[] args) {
        // Step 1: Ask the user how many favorite things they have using the helper class
        int numFavorites = UserInputHelper.getIntInput("How many favorite things do you have? ");

        // Step 2: Create a String array of the correct size
        String[] favoriteThings = new String[numFavorites];

        // Step 3: Ask the user to enter each favorite thing and store them in the array
        for (int i = 0; i < favoriteThings.length; i++) {
            // Use UserInputHelper to get String input for each favorite thing
            favoriteThings[i] = UserInputHelper.getStringInput("Enter favorite thing #" + (i + 1) + ": ");
        }

        // Step 4: Print out the contents of the array
        System.out.println("Your favorite things are:");
        for (String favorite : favoriteThings) {
            System.out.print(favorite + " ");
        }
    }
}

