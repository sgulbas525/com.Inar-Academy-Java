package chapters.chapter_12.Exercises12.E03;

import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        int[] arr = getRandom(100);
        Scanner input = new Scanner(System.in);
        int i;

        while (true) {
            System.out.println("Enter an index: ");
            i = input.nextInt();
            try {
                System.out.println("Index " + i + " is: " + arr[i]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds!");
            }
            System.out.println("Do you want to quit(y/n)?");
            char c = input.next().toUpperCase().charAt(0);
            if (c == 'Y') {
                break;
            }


        }
    }

    private static int[] getRandom(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }
}
