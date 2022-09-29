package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        int count = 0;
        int n;

        for (int i = 0; i < numbers.length; i++) {
            n = input.nextInt();
            if (contains(numbers, n, i)) {
                numbers[count] = n; // If the input is distinct we assign it to the array
                count++;        // Counting the distinct numebrs with count variable

            }
        }
        displayArray(numbers, count);

    }

    public static void displayArray(int[] numbers, int count) {
        System.out.println("The number of distinct number is " + count);
        // Displaying the array until reach the count(number of distinct number)
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean contains(int[] numbers, int n, int j) {
        for (int i = 0; i < j; i++) {
            // Whether the array contains number n
            if (numbers[i] == n)
                return false;
        }
        return true;
    }
}