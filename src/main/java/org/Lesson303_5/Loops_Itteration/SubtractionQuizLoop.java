package org.Lesson303_5.Loops_Itteration;

import java.util.Scanner;

/**
 * SubtractionQuizLoop is a simple console application that quizzes the user
 * on basic subtraction problems, providing feedback on their answers.
 *
 * This program generates a series of subtraction questions, checks the user's
 * answers, and keeps track of the number of correct responses. It runs for a
 * fixed number of questions and displays the results at the end.
 */

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        StringBuilder output = new StringBuilder();
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < NUMBER_OF_QUESTIONS; count++) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            number1 = Math.max(number1, number2);
            number2 = Math.min(number1, number2);

            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));
            }

            output.append("\n").append(number1).append("-").append(number2).append("=")
                    .append(answer).append((number1 - number2 == answer) ? " correct" : " wrong");
        }
    }
}
