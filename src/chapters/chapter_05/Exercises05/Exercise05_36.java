package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        long checksum = 0;

        System.out.print("The ISBN-10 number is " + isbn);
        for (int i = 9; i > 0; i--) {
            checksum +=(long)isbn % 10 * i;
            isbn /= 10;
        }

            if (checksum % 11 == 10)
                System.out.println("X");
            else
                System.out.println(checksum % 11 + "");
        }
    }
