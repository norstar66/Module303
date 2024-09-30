package org.Lesson303_5.Loops_Itteration.PA303_5_1;

import util.UserInputHelper;

public class FutureTuitionDoubles {
    public static void main(String[] args) {
        System.out.println();
        double nowTuition = UserInputHelper.getDoubleInput("Please enter the current tuition: ");
        System.out.println();
        double increaseFactor = 1.07;
        double twoTimesTuition = nowTuition * 2;
        int years = 0;
        while (nowTuition <= twoTimesTuition) {
            System.out.printf("After %d years Tuition will cost: %.2f%n", years, nowTuition);
            nowTuition = (nowTuition * increaseFactor);

            years++;
        }
        System.out.printf("The Tuition will increase to %.2f after %d years.", nowTuition, years);
    }
}
