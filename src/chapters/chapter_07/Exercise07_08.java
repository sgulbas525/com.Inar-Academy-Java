package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;
        System.out.println("Enter " + NUMBER_OF_NUMBERS + " numbers: ");
       double[] numbers = new double[NUMBER_OF_NUMBERS];

        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            numbers[i] = input.nextDouble();
        }
    double average = average(numbers);
        System.out.println("The average is " + average);
    }


    public static int average(int[] array) {
        int average;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    public static double average(double[] array) {
        double average;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }
}
