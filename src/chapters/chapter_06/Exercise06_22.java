package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println(n + "'s square root is " + sqrt(n));
    }


    public static double sqrt(long n) {
        double lastGuess =  (n + 1 / 1.0) / 2 ;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while ((lastGuess - nextGuess) > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }

        return nextGuess;
    }
}
