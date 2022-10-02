package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_28 {
    public static void main(String[] args) {
        int[] numbers = getFromUser();
        displayAllCombinations(numbers);
    }

    public static void displayAllCombinations(int[] numbers) {
        for (int i = 0; i < numbers.length - 1 ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {// Always checks the combinations with next elements in array
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
            }
        }
    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        int[] n = new int[10];

        System.out.println("Enter 10 integers: ");

        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }

        return n;
    }
}
