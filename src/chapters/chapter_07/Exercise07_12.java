package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        double[] list = getTenNumbersFromUser();

        System.out.println("Before reverse method:");
        displayArray(list);

        // int [] reversedArr = reversed(arr);
        reverse(list);

        System.out.println("\nAfter reverse method:");
        displayArray(list);

    }

    public static double[] getTenNumbersFromUser() {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");
        double[] list = new double[NUMBER_OF_NUMBERS];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        return list;
    }

    public static void reverse(double[] list) {
        /* int[] reversedofArr = new int[10];
       for (int i = arr.length - 1, reversedArraysIndex = 0; i >= 0 ; i--, reversedArraysIndex++) {
            reversedofArr[reversedArraysIndex] = arr[i];
        } */

        double temp;
       // Change first-last, 2nd-oneBeforeLast, and it goes like that
        // Working on the same array
        for (int firstIndex = 0, lastIndex = list.length - 1; firstIndex < lastIndex; firstIndex++, lastIndex--) {
            temp = list[firstIndex];
            list[firstIndex] = list[lastIndex];
            list[lastIndex] = temp;
        }
    }

    public static void displayArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}