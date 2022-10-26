package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers(input ends  with 0): ");
        int n = input.nextInt();
        int count = 0;
        int nLargest = n;

        while (n != 0) {
            n = input.nextInt();
            if (n == nLargest)
                count++;
            else if (n > nLargest) {
                nLargest = n;
                count = 1;
            }
        }
        if (nLargest != 0) {
            System.out.println("The largest number is " + nLargest);
            System.out.println("The occurrence of the largest number is " + count);
        }
    }
}
