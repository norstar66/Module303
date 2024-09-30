package org.Lesson303_9.EncapsulationAndInheritance;

public class SavingsAccount {
    //Static data member holds the interest rate
    private static double annualInterestRate;

    //private data member for account balance
    private double savingsBalance;

    //constructor to initialize the savings account balance
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    //method to calculate monthly interest and add it to balance
    public void calculateInterestRate() {
        double monthlyInterestRate = annualInterestRate / 12;
        savingsBalance += monthlyInterestRate;
    }

    //static method to modify interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    //method to get the current balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
