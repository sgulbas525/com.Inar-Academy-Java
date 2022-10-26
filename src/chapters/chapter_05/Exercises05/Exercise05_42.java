package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter commission sought: ");
        final double COMMISSION_SOUGHT = input.nextDouble();

        double commission = 0;
        double sales = 30000;
        double salary = 5000;

        for (commission = 0, sales = COMMISSION_SOUGHT; commission + salary < COMMISSION_SOUGHT; sales += 0.01) {
            commission = 0;
            commission += 5000 * 0.08;
            commission += 5000 * 0.10;
            commission += (sales - 10_000) * 0.12;
        }
        System.out.printf("\n\nYou'll need to make $%1.2f", sales);
    }
}


