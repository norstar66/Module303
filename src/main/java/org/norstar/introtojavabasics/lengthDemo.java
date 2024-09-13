package org.norstar.introtojavabasics;

public class lengthDemo {
    public static void main(String[] args) {
        /*
        The length() method returns the length of the string,
        or it returns the count of the total number of characters
        present in the string.
         */
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());
    }
}
