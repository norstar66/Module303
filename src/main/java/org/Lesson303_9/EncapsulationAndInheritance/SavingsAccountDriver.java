package org.Lesson303_9.EncapsulationAndInheritance;

public class SavingsAccountDriver {
    public static void main(String[] args) {

        // instantiate 2 SavingsAccount obj w/ balances
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // set the interest rate
        SavingsAccount.modifyInterestRate(0.03);

        // calculate monthly interest
        saver1.calculateInterestRate();
        saver2.calculateInterestRate();
        // print new balances
        System.out.println("The new balance for Saver 1 is" + saver1.getSavingsBalance());
        System.out.println("The new balance for Saver 2 is" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateInterestRate();
        saver2.calculateInterestRate();
        // print new balances
        System.out.println("The new balance for Saver 1 is" + saver1.getSavingsBalance());
        System.out.println("The new balance for Saver 2 is" + saver2.getSavingsBalance());
    }
}
