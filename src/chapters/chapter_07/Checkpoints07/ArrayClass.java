package chapters.chapter_07.Checkpoints07;

import chapters.chapter_07.Listings07.Listing07_04_CountLettersInArray;

public class ArrayClass {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " +
                java.util.Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " +
                java.util.Arrays.binarySearch(list, 12));
        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " +
                java.util.Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index is " +
                java.util.Arrays.binarySearch(chars, 't'));

        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); // true
        System.out.println(java.util.Arrays.equals(list2, list3)); // false

        int[] list11 = {2, 4, 7, 10};
        int[] list22 = {2, 4, 7, 7, 7, 10};
        java.util.Arrays.fill(list11, 5); // Fill 5 to the whole array
        java.util.Arrays.fill(list22, 1, 5, 8); // Fill 8 to a partial array


        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.sort(numbers); // Sort the whole array
        java.util.Arrays.parallelSort(numbers); // Sort the whole array
        char[] charX = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(charX, 1, 3); // Sort part of the array
        java.util.Arrays.parallelSort(charX, 1, 3); // Sort part of the array
    }
}