package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int gcd = gcd(numbers);

        System.out.println("The gcd is " + gcd);
    }

    public static int gcd(int... numbers) {
        int gcd = 1;// Smallest gcd
        int divisor = 2;
        boolean gcdDividesAllNumbers;

        java.util.Arrays.sort(numbers);// To finding the minimum number
        int min = numbers[0];// The gcd can't be greater than the minimum number

        while (divisor <= min) {
            gcdDividesAllNumbers = true;// Starting with assume
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % divisor != 0) {
                    gcdDividesAllNumbers = false;
                    break;
                }
            }

            if (gcdDividesAllNumbers) {
                gcd = divisor;
            }

            divisor++;
        }
        return gcd;
    }
}
