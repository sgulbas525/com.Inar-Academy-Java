package chapters.chapter_11.Exercises11.E17;

import java.util.ArrayList;
import java.util.Scanner;

import static chapters.chapter_06.Exercises06.Exercise06_29.isPrime;

public class Exercise11_17 {
    public static void main(String[] args) {
        int m = getFromUser();
        int n = findN(m);
        System.out.println("The smallest number n for" +
                " m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    public static int findN(int m) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int d = 2;
        while (m != 1) {
            if (isPrime(d)) {
                if (m % d == 0) {
                    numbers.add(d);
                    m /= d;
                } else {
                    d++;
                }
            } else {
                d++;
            }
        }
        int n = findN(numbers);
        return n;
    }

    private static int findN(ArrayList<Integer> numbers) {
        int counts;
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            counts = 1;
            for (int j = 0; j < numbers.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (numbers.get(i).equals(numbers.get(j))) {
                    counts++;
                }
            }
            // If there is the number in odd times store it
            if (counts % 2 == 1) {
                // If we already store the number that is in odd times we didn't store that again.
                if (!distinct.contains(numbers.get(i)))
                    distinct.add(numbers.get(i));
            }

        }
        int n = 1;
        for (Integer integer : distinct) {
            n *= integer;
        }

        return n;
    }


    public static int getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        return m;
    }
}

