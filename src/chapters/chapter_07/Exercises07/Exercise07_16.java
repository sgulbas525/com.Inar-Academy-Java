package chapters.chapter_07.Exercises07;

import static chapters.chapter_07.Listings07.Listing07_06_LinearSearch.linearSearch;
import static chapters.chapter_07.Listings07.Listing07_07_BinarySearch.binarySearch;

public class Exercise07_16 {
    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS = 100_000;

        int[] list = new int[NUMBER_OF_ELEMENTS];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        int key = (int) (Math.random() * Integer.MAX_VALUE);
        estimateTimeForLinearSearch(list, key);
        estimateTimeForBinarySearch(list, key);
    }

    public static void estimateTimeForLinearSearch(int[] list, int key) {
        long startTime = System.currentTimeMillis();
        linearSearch(list, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("The linear search takes " + executionTime + " milliseconds");
    }

    public static void estimateTimeForBinarySearch(int[] list, int key) {
        java.util.Arrays.sort(list);
        long startTime = System.currentTimeMillis();
        binarySearch(list, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("The binary search takes " + executionTime + " milliseconds");
    }
}
