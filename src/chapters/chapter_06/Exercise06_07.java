package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.printf("%-5s %18s\n", "Years", "Future Value");
        for (int i = 1; i <= 30; i++){
            System.out.printf("%-5d %18.2f\n", i, futureInvestmentValue(investmentAmount,
                    annualInterestRate/1200, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,
                                               int month){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, month * 12);

    }
}
