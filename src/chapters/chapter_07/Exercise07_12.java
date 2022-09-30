package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");
        double[] list = new double[NUMBER_OF_NUMBERS];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        System.out.println("Before reverse method:");
        displayArray(list);
        reverse(list);
        System.out.println("\nAfter reverse method:");
        displayArray(list);

    }

    public static void reverse(double[] list) {
        double temp;
       // Change first-last, 2nd-oneBeforeLast, and it goes like that
        // Working on the same array
        for (int i = 0, j = list.length - 1; i < j; i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public static void displayArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}