package chapters.chapter_12.Exercises12.E06;

import java.util.Scanner;

public class Exercise12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            // Prompt the user to enter a string
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            try {
                System.out.println("The decimal value for hex number " + hex + " is " +
                        hexToDecimal(hex.toUpperCase()));
                break;
            } catch (Exception ex) {
                System.out.println("It is not a hex number!");

            }
        }
    }
    public static int hexToDecimal(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {
                throw new NumberFormatException();
            }
        }

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if ('A' <= ch && ch <= 'F')
            return 10 + ch - 'A';
        else// ch is '0', '1', ..., or '9'
            return ch - '0';
    }

}
