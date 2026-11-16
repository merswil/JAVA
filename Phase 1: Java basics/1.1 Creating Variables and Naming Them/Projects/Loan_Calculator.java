package Projects;

import java.util.Locale;
import java.util.Scanner;

public class Loan_Calculator {

    public static double monthlyPayment(double principal, double annualRatePercent, int months) {
        double monthlyRate = annualRatePercent / 12.0 / 100.0;

        if (monthlyRate == 0) {
            return principal / months;
        }
        return principal * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the loan amount:");
        double principal = input.nextDouble();
        System.out.println("Enter the yearly interest rate in percent (for example 5.5):");
        double annualRate = input.nextDouble();
        System.out.println("Enter the loan length in years (for example 2.5):");
        double years = input.nextDouble();

        int months = (int) Math.round(years * 12);

        if (principal <= 0 || annualRate < 0 || months < 1) {
            System.out.println("Please enter a positive amount, a rate of 0 or more, and at least one month.");
        } else {
            double payment = monthlyPayment(principal, annualRate, months);
            double totalPaid = payment * months;
            double totalInterest = totalPaid - principal;

            System.out.printf(Locale.US, "Monthly payment: %.2f%n", payment);
            System.out.printf(Locale.US, "Total paid:      %.2f%n", totalPaid);
            System.out.printf(Locale.US, "Total interest:  %.2f%n", totalInterest);
        }
        input.close();
    }
}