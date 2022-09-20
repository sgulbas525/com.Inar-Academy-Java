package chapters.chapter_04;

import java.util.Scanner;

public class Exercise04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much money do you have?");
        String amount = input.next();

        int i = amount.indexOf('.');
        String dollars = amount.substring(0, i);
        String cents = amount.substring(i + 1);
        char cent1 = cents.charAt(0);
        char cent2 = cents.charAt(1);
        int c1 = (int) (cent1) - 48;
        int c2 = (int) cent2 - 48;
        int totalCent = c1 * 10 + c2;

        int quarters = totalCent / 25;
        int remainingCent = totalCent % 25;
        int dimes = remainingCent / 10;
        remainingCent %= 10;
        int nickels = remainingCent / 5;
        int pennies = remainingCent % 5;

        System.out.println("Your money " + amount + " consist of : ");
        System.out.println(dollars + " dollars");
        System.out.println((quarters == 0) ? "" : quarters + " quarters");
        System.out.println((dimes == 0) ? "" : dimes + " dimes");
        System.out.println((nickels == 0) ? "" : nickels + " nickels");
        System.out.println((pennies == 0) ? "" : pennies + " pennies");
    }
}
