package org.Lesson303_7.Array.PA1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] colorArray = {"red", "green", "blue", "yellow"};
        System.out.println(colorArray.length);
        String[] colorArray2 = colorArray.clone();
        System.out.println(Arrays.toString(colorArray2));
    }
}
