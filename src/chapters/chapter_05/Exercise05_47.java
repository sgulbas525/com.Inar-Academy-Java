package chapters.chapter_05;

import java.util.Scanner;

public class Exercise05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();
        int checksum = 0;
        int total = 0;
        if (isbn.length() != 12) {
            System.exit(1);
        }
        for (int i = 0; i < isbn.length(); i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                System.err.print("Invalid input!");
                System.exit(2);
            }
            if (i % 2 == 0)
                total += Integer.parseInt(isbn.substring(i, i + 1));
            else
                total += 3 * Integer.parseInt(isbn.substring(i, i + 1));
            ;
        }
        checksum = 10 - (total % 10);
        isbn += checksum % 10;
        System.out.println("The ISBN-13 number is " + isbn);
    }
}