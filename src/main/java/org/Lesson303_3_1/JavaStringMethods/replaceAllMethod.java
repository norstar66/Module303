package org.Lesson303_3_1.JavaStringMethods;

public class replaceAllMethod {
    public static void main(String[] args) {
        String str1 = "Java123is456fun";

        String regex = "\\d+";

        System.out.println(str1.replaceAll(regex, " "));
    }
}
