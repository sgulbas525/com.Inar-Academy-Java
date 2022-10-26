package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");
        double[] numbers = new double[NUMBER_OF_NUMBERS];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double mean = getMean(numbers);
        double deviation = getDeviation(numbers);

        System.out.printf("The mean is %.4f\n", mean);
        System.out.printf("The deviation is %.4f", deviation);
    }


    public static double getDeviation(double[] numbers) {
        double mean = getMean(numbers);
        double deviation;
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i] - mean, 2);
        }
        //That's deviation's formula
        deviation = Math.sqrt(sum / (numbers.length - 1));
        return deviation;
    }

    public static double getMean(double[] numbers) {
        double sum = 0;
        double mean;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        //Get the mean by the sum divide our numbers length
        mean = sum / numbers.length;
        return mean;
    }
}
