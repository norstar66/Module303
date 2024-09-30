package org.Lesson303_5.Loops_Itteration;

public class SomeNatNum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;

        for (int i = 1; i <= n; ++i) {
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);
    }
}
