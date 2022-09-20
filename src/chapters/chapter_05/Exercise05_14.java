package chapters.chapter_05;

import java.util.Scanner;

public class Exercise05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter a positive integer: ");
        int n2 = input.nextInt();

        int d = Math.min(n1, n2);

        while(d > 0){
            if ( n1 % d == 0 && n2 % d == 0)
                break;
            d--;
        }
        System.out.println(d + " is the great common divisor for " + n1 + " and " + n2);
    }
}
