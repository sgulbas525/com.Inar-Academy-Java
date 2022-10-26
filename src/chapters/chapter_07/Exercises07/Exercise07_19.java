package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        int[] list = getListFromUser();

        displayListWhetherSorted(list);
    }

    public static void displayListWhetherSorted(int[] list) {
        System.out.print("The list is");
        // Conditional Expressions                 for true       for false
        System.out.println((isTheArraySortedFromGreaterToSmaller(list) || isTheArraySortedFromSmallerToGreater(list) ?
                " already sorted": " not sorted"));
    }

    public static int[] getListFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int n = input.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    //100 90 80 70
    public static boolean isTheArraySortedFromGreaterToSmaller(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    // 42 5 8 96 31 475 16 45
    // 15 23 13 46 58 67
    public static boolean isTheArraySortedFromSmallerToGreater(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

}
