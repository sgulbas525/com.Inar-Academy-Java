import java.util.Scanner;

public class Exercise05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loanAmount = input.nextInt();

        System.out.print("Number of years: ");
        int years = input.nextInt();

        double annualInterestRate = 0.05;

        System.out.printf("%-18s %-18s %-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (int i = 5000; i <= 8000; i += 125){
            double monthlyInterestRate = annualInterestRate / 12;
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    (1- 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("%-5.3f %-13c %-18.2f %-18.2f\n", annualInterestRate * 100, '%', monthlyPayment, totalPayment);

            annualInterestRate += 0.00125;

        }
    }
}
