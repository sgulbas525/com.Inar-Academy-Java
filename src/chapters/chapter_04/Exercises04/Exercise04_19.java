package chapters.chapter_04.Exercises04;

import java.util.Scanner;
public class Exercise04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String iban = input.nextLine();

        int digit1 = iban.charAt(0) - '0';
        int digit2 = iban.charAt(1) - '0';
        int digit3 = iban.charAt(2) - '0';
        int digit4 = iban.charAt(3) - '0';
        int digit5 = iban.charAt(4) - '0';
        int digit6 = iban.charAt(5) - '0';
        int digit7 = iban.charAt(6) - '0';
        int digit8 = iban.charAt(7) - '0';
        int digit9 = iban.charAt(8) - '0';

        int checksum = ((digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7
                + digit8 * 8 + digit9 * 9)) %11;

        if (checksum  == 10)
            System.out.println("The ISBN-10 number is " + iban + "X");
        else
            System.out.println("The ISBN-10 number is " + iban + (checksum));

    }
}