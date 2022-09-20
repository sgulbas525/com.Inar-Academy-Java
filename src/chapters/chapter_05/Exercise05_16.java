package chapters.chapter_05;

import java.util.Scanner;

public class Exercise05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int d = 2;

        while (num > 1) {
            if (num % d == 0) {
                num /= d;
                if (num == 1)
                    System.out.print(d);
                else
                    System.out.print(d + ", ");
                continue;
            }

            d++;

        }
    }
}
