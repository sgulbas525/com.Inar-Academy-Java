package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = -1;
        int[] numbers = new int[50];
        java.util.Arrays.fill(numbers, -1);
        int index = 0;

        System.out.print("Enter the integers between 1 and 100 (0 ends): ");

        while (number != 0) {
            number = input.nextInt();
            // For not assigning 0 to an index
            if (number != 0) {
                numbers[index] = number;
                index++;
            }

            // If the array is full, but we are still taking input we must enlarge the size of our array
            if (index  == numbers.length) {
               numbers = resizeArray(numbers);
            }
        }
        int[] occurrences = getOccurrences(numbers);

        displayOccurrences(occurrences);

    }


    public static int[] getOccurrences(int[] numbers) {
        // The range of integers will be 1 to 100 so an array with 100 elements will be enough
        //For occurrences we will use the index as integers-1 and increase each input by 1
        int[] integers = new int[100];
        for (int number : numbers) {
            if (number != -1)
                integers[number]++;
        }
        return integers;
    }

    public static int[] resizeArray(int[] numbers) {
        int[] newArray = new int[numbers.length * 2];
        java.util.Arrays.fill(newArray, -1);
        // Copied the full array's elements into our new resized array
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        return  newArray;
    }

    public static void displayOccurrences(int[] occurrences) {
        for (int i = 0; i < occurrences.length; i++) {
            // For not displaying non-prompt integers
            if (occurrences[i] != 0) {
                System.out.print(i + " occurs " + occurrences[i]);
                //if a number occurs more than one time, the plural word “times” is used
                System.out.println((occurrences[i] > 1) ? " times" : " time");
            }
        }
    }
}