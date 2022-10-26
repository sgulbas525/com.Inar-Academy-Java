package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");
        double[] list = new double[NUMBER_OF_NUMBERS];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        selectionSortByMax(list);
        Exercise07_12.displayArray(list);
    }

    public static void selectionSortByMax(double[] list) {
        double max;
        int index;
        for (int i = list.length - 1; 0 < i; i--) {
            //Starting with assume
            max = list[i];
            index = i;

            for (int j = i - 1; 0 <= j; j--) {
                // Compare with the fewer indexes whether is greater.
                //If so assign the greater one's index and value to index and max
                if (max < list[j]) {
                    max = list[j];
                    index = j;
                }
            }
            // Put the greatest one to the end of the array,
            // and in each iteration it came backwards
            if (i != index) {
                list[index] = list[i];
                list[i] = max;
            }
        }

    }

}
