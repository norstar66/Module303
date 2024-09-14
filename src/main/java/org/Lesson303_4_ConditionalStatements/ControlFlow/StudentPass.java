package org.Lesson303_4_ConditionalStatements.ControlFlow;

public class StudentPass {
    public static void main(String[] s){
    int marks = 80;
    if (marks > 70) {
        System.out.println("Distinction");
        System.out.println("marks is larger than 70");
    }
    else if (marks > 35) {
        System.out.println("Pass");
        System.out.println("marks is between 70 and 35");
    }
    else {
        System.out.println("Fail");
        System.out.println("Marks is les than 35");
    }

    }
}


