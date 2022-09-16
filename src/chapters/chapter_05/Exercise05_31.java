import java.util.Scanner;

public class Exercise05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextInt();

        System.out.print("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonth = input.nextInt();


        System.out.printf("%10s %15s\n", "Month", "CD Value");

        for (int i = 1; i <= numberOfMonth; i++){
            deposit = deposit + (deposit * annualPercentage /1200);
            System.out.printf("%10d%15.2f\n", i, deposit);
        }
    }
}
