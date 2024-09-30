package org.Lesson303_6.JavaArrays;

public class StudentGrades {
    public static void main(String[] args) {
        /**
         * StudentGrades is a console application that displays the grades of students
         * in various classes in a formatted table.
         *
         * This program initializes arrays for student names, class names, and their
         * corresponding grades, then prints a neatly formatted table showing each
         * student's grades in each class.
         */
        // Students
        String[] students = {"Takeisha LR White", "Erica Ulysse", "Md F Islam", "Brian Alex Martinez", "Yu Chen Ou Solomon"};
        //Classes
        String[] classes = {"Java", "Python", "DS & Alg", "SQL"};
        //2D Array for each student's grades in each class
        double [][] grades = {
                {95, 98, 100, 96},
                {100, 95, 98, 100},
                {97, 100, 96, 99},
                {98, 95, 98, 95},
                {90, 100, 94, 98}
        };

        // Set the column width
        int columnWidth = 25;

        // Print the table header with formatted columns
        System.out.printf("%-" + columnWidth + "s", ""); // For the header indentation
        for (String className : classes) {
            System.out.printf("%-" + columnWidth + "s", className);
        }
        System.out.println();

        // Print a separator line
        for (int i = 0; i <= classes.length; i++) {
            for (int j = 0; j < columnWidth; j++) {
                System.out.print("-");
            }
        }
        System.out.println();

        // Print the grades for each student with formatted columns
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-" + columnWidth + "s", students[i]);
            for (int j = 0; j < classes.length; j++) {
                System.out.printf("%-" + columnWidth + ".1f", grades[i][j]);
            }
            System.out.println();
        }
    }
}
