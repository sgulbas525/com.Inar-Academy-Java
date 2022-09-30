package chapters.chapter_07;

import java.util.Scanner;
// Can be solved better
public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");
        int[] numbers = new int[NUMBER_OF_NUMBERS];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] withoutDuplicate = eliminateDuplicates(numbers);
        displayNonDuplicateArray(withoutDuplicate);
    }

    public static void displayNonDuplicateArray(int[] withoutDuplicate) {
        for (int i = 0; i <withoutDuplicate[withoutDuplicate.length - 1] ; i++) {
            System.out.print(withoutDuplicate[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        // Each number can be unique int his array
        // in the last index will be the count restored
        int[] withoutDuplicate = new int[list.length + 1];
        int count = 1; // Counts the non-duplicate numbers
        withoutDuplicate[0] = list[0];
        boolean isDuplicate;

        for (int i = 1; i < list.length; i++) {
            isDuplicate = false;// Starting with assume

            for (int j = 0; j < count; j++) {
                // If it's a duplicate number IsDuplicate will be true
                if (withoutDuplicate[j] == list[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If it's non-duplicate it will be added into our new array with count index
            if (!isDuplicate) {
                withoutDuplicate[count] = list[i];
                count++;
            }
        }
        withoutDuplicate[withoutDuplicate.length - 1] = count;
        return withoutDuplicate;
    }
}
