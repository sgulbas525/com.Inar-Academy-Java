package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_INTEGER = 10;

        int[] numbers = new int[NUMBER_OF_INTEGER];

        System.out.println("Enter " + NUMBER_OF_INTEGER + " integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("First array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println("And the reverse of first array is: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        /* You can also display the array in reverse with the code below

         int[] reversed = reversArray(numbers);


            System.out.println("First array is: ");
            displayArray(numbers);

            System.out.println("And the reverse of first array is: ");
            displayArray(reversed);

        }


    public static int[] reversArray(int[] numbers) {
        int[] reversed = new int[10];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        return reversed;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    } */
    }
}
