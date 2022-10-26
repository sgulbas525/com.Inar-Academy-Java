package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter an annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of the month: ");
        int month = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double savingsAccount = 0;

        for (int i = 0; i < month; i++) {
            savingsAccount = Math.round((amount + savingsAccount) * (1 + monthlyInterestRate) * 1000) / 1000.0;


        }
        System.out.println("After " + month + " month your total " +
                "saving is " + savingsAccount + "$");
    }
}
