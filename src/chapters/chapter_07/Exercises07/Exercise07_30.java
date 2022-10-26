package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_30 {
    // 1 2 2 2 2
    // 1 2 3 4 4 4 4 5 6
    // 1 2 3 4 5 6 7 8 9
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

        int[] list = new int[n];
        System.out.print("Enter the values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        displayWhetherTheListHasConsecutiveFours(list);
    }

    public static void displayWhetherTheListHasConsecutiveFours(int[] list) {
        if (hasTheListConsecutiveFours(list)) {
            System.out.println("The list has consecutive fours.");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean hasTheListConsecutiveFours(int[] list) {
        boolean isConsecutive;
        // No need to check last 3 elements cuz we are looking for consecutive fours
        /* 0 1 2 3 4 5 6 7 8 9
           3 4 4 5 5 5 5 3 4 5  */
        for (int i = 0; i < list.length - 3; i++) {
            // Starting with assume
            isConsecutive = false;
            // Starts with i and checks whether the list has consecutive fours
            for (int j = i; j < i + 3; j++) { // checks the consecutive 4 number
                if (list[j] == list[j + 1]) {
                    isConsecutive = true;
                } else {
                    // if the next number isn't same as the number, that's impossible
                    // to be consecutive fours for that period that we check with this loop
                    isConsecutive = false;
                    break;
                }
            }
            if (isConsecutive) {// if it's true the list has consecutive fours
                return true;
            }
        }
        return false;
    }
}