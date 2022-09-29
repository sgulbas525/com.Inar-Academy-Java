package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_NUMBERS = 10;
        double[] numbers = new double[NUMBER_OF_NUMBERS];

        System.out.println("Enter " + NUMBER_OF_NUMBERS + " numbers: ");

        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            numbers[i] = input.nextDouble();
        }
        double min = getMinNumber(numbers);
        System.out.println("The minimum number is " + min);
    }

    public static double getMinNumber(double[] numbers) {
        double min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        return min;
    }
}
