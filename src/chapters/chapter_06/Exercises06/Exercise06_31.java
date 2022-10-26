package chapters.chapter_06.Exercises06;

import java.util.*;

public class Exercise06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long creditCard = input.nextLong();

        System.out.print(creditCard + " is ");
        if (isValid(creditCard))
            System.out.println("valid");
        else
            System.out.println("invalid");
    }

    public static boolean isValid(long number) {

        return ((getSize(number) > 12 && getSize(number) < 17) &&
                (prefixMatched(number, 1) || prefixMatched(number, 2)) &&
                ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0));
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String num = "" + number;
        int sumOfDoubleEvenPlace = 0;
        int digit;

        // each character casting to int and doubled
        for (int i = 0; i < getSize(number); i += 2) {
            digit = getDigit(Integer.parseInt(num.substring(i, i + 1)) * 2);
            sumOfDoubleEvenPlace += digit;
        }

        return sumOfDoubleEvenPlace;
    }

    public static int getDigit(int number) {

        return (number > 9) ? number / 10 + number % 10 : number;


    }

    public static int sumOfOddPlace(long number) {
        String num = "" + number;
        int sumOfOddPLace = 0;
        int digit;

        // each character casting to int
        for (int i = 1; i < getSize(number); i += 2) {
            digit = getDigit(Integer.parseInt(num.substring(i, i + 1)));
            sumOfOddPLace += digit;
        }
        return sumOfOddPLace;
    }

    public static boolean prefixMatched(long number, int d) {
        int prefix = (int) (getPrefix(number, d));
        return (prefix == 4 || prefix == 5 || prefix == 37 || prefix == 6);
    }

    public static int getSize(long d) {
        String number = "" + d;
        return number.length();
    }

    public static long getPrefix(long number, int k) {
        String num = "" + number;
        return Integer.parseInt(num.substring(0, k), 10);
    }
}
