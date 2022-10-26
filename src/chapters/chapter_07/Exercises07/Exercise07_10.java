package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;

        double[] numbers = new double[NUMBER_OF_NUMBERS];

        System.out.println("Enter " + NUMBER_OF_NUMBERS + " numbers: ");

        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            numbers[i] = input.nextDouble();
        }
        double minNumberIndex = getMinNumberIndex(numbers);
        System.out.println("The minimum number's index is " + minNumberIndex);
    }

    public static double getMinNumberIndex(double[] numbers) {
     int minNumberIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            // Comparing the numbers and assign the smallest number's index to minNumberIndex
            if (numbers[minNumberIndex] > numbers[i])
                minNumberIndex = i;
        }
        return minNumberIndex;
    }
}

