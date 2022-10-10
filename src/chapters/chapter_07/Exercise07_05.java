package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {

        int[] number = getAnArrayFromUser();

        int[] distinctNumbers = new int[10];
        int countOfDistinct = 0;

        for (int i = 0; i < number.length; i++) {
            if (contains(distinctNumbers, number[i], countOfDistinct)) {
                distinctNumbers[countOfDistinct] = number[1]; // If the input is distinct we assign it to the array
                countOfDistinct++;        // Counting the distinct numbers with count variable

            }
        }
        displayArray(distinctNumbers, countOfDistinct);

    }

    public static int[] getAnArrayFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        return number;
    }

    public static void displayArray(int[] numbers, int count) {
        System.out.println("The number of distinct number is " + count);
        // Displaying the array until reach the count(number of distinct number)
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean contains(int[] numbers, int number, int countOFDistinctNumbers) {
        for (int i = 0; i < countOFDistinctNumbers; i++) {
            // Whether the array contains number n
            if (numbers[i] == number)
                return false;
        }
        return true;
    }
}