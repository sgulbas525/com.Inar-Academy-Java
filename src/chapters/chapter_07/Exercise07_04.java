package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {

        double[] arr = getFromUser();
        analyzeScore(arr);


    }

    public static double[] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[50];
        int index = 0;
        double number = 0;
        System.out.print("Enter the integers between 0 and 100 (negative ends): ");

        do {
            number = input.nextInt();
            // For not assigning 0 to an index
            if (number < 0) {
                numbers[index] = number;
                index++;
            }

            // If the array is full, but we are still taking input we must enlarge the size of our array
            if (index == numbers.length) {
                numbers = resizeArray(numbers);
            }
        } while (number < 0);

        return numbers;
    }

    public static void analyzeScore(double[] scores) {
        int average = average(scores);
        int countAboveOrEqual = 0;
        int countBelow = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0)
                break;
            if (scores[i] >= average) {
                countAboveOrEqual++;
            } else {
                countBelow++;
            }
        }
        System.out.println("Number of scores that above or equal to the average:  " + countAboveOrEqual);
        System.out.println("Number of scores that below to the average:  " + countBelow);

    }

    public static int average(double[] scores) {
        int average;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0) {
                break;
            }

            if (scores[i] >= 0) {
                sum += scores[i];
                count++;
            }
        }
        average = sum / count;
        System.out.println("The average is " + average);

        return average;
    }

    public static double[] resizeArray(double[] numbers) {
        double[] newArray = new double[numbers.length * 2];
        java.util.Arrays.fill(newArray, -1);
        // Copied the full array's elements into our new resized array
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        return newArray;
    }
}