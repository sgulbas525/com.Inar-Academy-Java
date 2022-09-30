package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int n = input.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("The list is");
        // Conditional Expressions                 for true       for false
        System.out.println((isSorted(list) ? " already sorted": " not sorted"));
    }

    public static boolean isSorted(int[] list) {
        // Checking with next index, so the loop must be up to length - 1
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }


}
