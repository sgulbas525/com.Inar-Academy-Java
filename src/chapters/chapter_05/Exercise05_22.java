package chapters.chapter_05;

import java.util.Scanner;

public class Exercise05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        int years = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        double interest, principal;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
        System.out.printf("%-15s%-15s%-15s%-15s\n",
                "Payment#", "Interest", "Principal", "Balance");

        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyInterestRate * loanAmount;
            principal = monthlyPayment - interest;
            loanAmount = loanAmount - principal;

            System.out.printf("%-15d%-15.2f%-15.2f%.2f\n",
                    i, interest, principal, loanAmount);


        }
    }
}
