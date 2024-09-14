package org.Lesson303_3_1.JavaStringMethods;


import java.util.Arrays;

public class splitMethod {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";
        String[] result = vowels.split("::");
        System.out.println("result = " + Arrays.toString(result));
    }
}
