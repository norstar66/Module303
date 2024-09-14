package org.Lesson303_2_1.OperatorsAndType;

public class AssignmentOperatorDemo1 {
    public static void main(String args[]) {

        int j, k;
        j = 10;
        j = 5;
        k = j;

        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        k = j = 10;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
    }
}
