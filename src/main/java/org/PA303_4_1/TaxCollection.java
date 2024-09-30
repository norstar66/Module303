package org.PA303_4_1;

/** This is a class specific to Exercise 7
 *  from PA303.4.2
 * 7. Create a program that lets the users input their filing status and income.
 *      Display how much tax the user would have to pay according to status and income.
 * ❑	The U.S. federal personal income tax is calculated based on the filing
 *      status and taxable income.
 * ❑	There are four filing statuses: Single, Married Filing Jointly,
 *      Married Filing Separately, and Head of Household.
 */

import util.UserInputHelper;

public class TaxCollection {


    public static void main(String[] args) {
        // Define valid short forms for filing statuses
        String[] validStatuses = {"s", "mj", "ms", "h"};

        // Variable to store user input
        String filingStatus = "";
        String fullFilingStatus = "";

        // Loop until a valid filing status is provided
        boolean isValid = false;
        while (!isValid) {
            filingStatus = UserInputHelper.getStringInput(
                    "Enter your filing status: \n's' for Single\n 'mj' for Married Filing Jointly\n " +
                            "'ms' for Married Filing Separately\n 'h' for Head of Household: ");
            filingStatus = filingStatus.toLowerCase().strip();

            // Check if the input matches any valid short form
            for (String validStatus : validStatuses) {
                if (filingStatus.equals(validStatus)) {
                    isValid = true;
                    break;
                }
            }

            // If invalid, show an error message
            if (!isValid) {
                System.out.println("Invalid filing status. Please try again.");
            }
        }

        // Map the short form to the full status name
        switch (filingStatus) {
            case "s":
                fullFilingStatus = "Single";
                break;
            case "mj":
                fullFilingStatus = "Married Filing Jointly";
                break;
            case "ms":
                fullFilingStatus = "Married Filing Separately";
                break;
            case "h":
                fullFilingStatus = "Head of Household";
                break;
        }

        // Proceed to get the taxable income after a valid filing status is provided
        int taxableIncome = UserInputHelper.getIntInput(
                "What is your Taxable Income? ");

        double taxOwed = 0.0;

        // Determine the tax based on filing status and income
        switch (filingStatus.toLowerCase()) {
            case "s":
                taxOwed = calculateSingleTax(taxableIncome);
                break;
            case "mj":
                taxOwed = calculateMarriedJointlyTax(taxableIncome);
                break;
            case "ms":
                taxOwed = calculateMarriedSeparatelyTax(taxableIncome);
                break;
            case "h":
                taxOwed = calculateHeadOfHouseholdTax(taxableIncome);
                break;
            default:
                System.out.println("Invalid filing status.");
                return;
        }

        // Output the tax owed
        System.out.println("Tax owed: $" + taxOwed);
    }

    private static double calculateHeadOfHouseholdTax(int taxableIncome) {
        double headOfHouseholdTax = 0.0;
        if ((taxableIncome <= 11950) && (taxableIncome >= 0)) {
            headOfHouseholdTax = taxableIncome * 0.10;
        } else if ((taxableIncome >= 11951) && (taxableIncome <= 45500)) {
            headOfHouseholdTax = taxableIncome * 0.15;
        } else if ((taxableIncome >= 45501) && (taxableIncome <= 117450)) {
            headOfHouseholdTax = taxableIncome * 0.25;
        } else if ((taxableIncome >= 117451) && (taxableIncome <= 190200)) {
            headOfHouseholdTax = taxableIncome * 0.28;
        } else if ((taxableIncome >= 190201) && (taxableIncome <= 372950)) {
            headOfHouseholdTax = taxableIncome * 0.33;
        } else if (taxableIncome >= 372951) {
            headOfHouseholdTax = taxableIncome * 0.35;
        } else {
            System.out.println("Invalid filing status.");
        }
        return headOfHouseholdTax;
    }

    private static double calculateMarriedSeparatelyTax(int taxableIncome) {
        double marriedSeparatelyTax = 0.0;
        if ((taxableIncome <= 8350) && (taxableIncome >= 0)) {
            marriedSeparatelyTax = taxableIncome * 0.10;
        } else if ((taxableIncome >= 8351) && (taxableIncome <= 33950)) {
            marriedSeparatelyTax = taxableIncome * 0.15;
        } else if ((taxableIncome >= 33951) && (taxableIncome <= 68525)) {
            marriedSeparatelyTax = taxableIncome * 0.25;
        } else if ((taxableIncome >= 68526) && (taxableIncome <= 104425)) {
            marriedSeparatelyTax = taxableIncome * 0.28;
        } else if ((taxableIncome >= 104426) && (taxableIncome <= 186475)) {
            marriedSeparatelyTax = taxableIncome * 0.33;
        } else if (taxableIncome >= 186476) {
            marriedSeparatelyTax = taxableIncome * 0.35;
        } else {
            System.out.println("Invalid filing status.");
        }
        return marriedSeparatelyTax;
    }

    private static double calculateMarriedJointlyTax(int taxableIncome) {
        double taxOwed = 0.0;
        if ((taxableIncome <= 16700) && (taxableIncome > 0)) {
            taxOwed = taxableIncome * 0.10;
        } else if ((taxableIncome >=16701) && (taxableIncome <= 67900)) {
            taxOwed = taxableIncome * 0.15;
        } else if ((taxableIncome >= 67901) && (taxableIncome <= 137050)) {
            taxOwed = taxableIncome * 0.25;
        } else if ((taxableIncome >= 137051) && (taxableIncome <= 208850)) {
            taxOwed = taxableIncome * 0.28;
        } else if ((taxableIncome >= 208851) &&(taxableIncome <= 3372950)) {
            taxOwed = taxableIncome * 0.33;
        } else if (taxableIncome >= 3372951) {
            taxOwed = taxableIncome * 0.35;
        } else {
            System.out.println("Invalid filing status.");
        }
        return taxOwed;
    }

    // Tax for single
    private static double calculateSingleTax(int taxableIncome) {
        double singleTax = 0.0;
        if ((taxableIncome <= 8350) && (taxableIncome >= 0)) {
            singleTax = taxableIncome * 0.10;
        } else if ((taxableIncome >= 8351) && (taxableIncome <= 33950)) {
            singleTax = taxableIncome * 0.15;
        } else if ((taxableIncome >= 33951) && (taxableIncome <= 82250)) {
            singleTax = taxableIncome * 0.25;
        } else if ((taxableIncome >= 82251) && (taxableIncome <= 171550)) {
            singleTax = taxableIncome * 0.28;
        } else if ((taxableIncome >= 171551) && (taxableIncome <= 372950)) {
            singleTax = taxableIncome * 0.33;
        } else if (taxableIncome >= 372951) {
            singleTax = taxableIncome * 0.35;
        } else {
            System.out.println("Invalid filing status.");
        }
        return singleTax;
    }
}
