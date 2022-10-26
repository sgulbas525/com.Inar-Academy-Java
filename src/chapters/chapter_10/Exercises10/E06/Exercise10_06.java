package chapters.chapter_10.Exercises10.E06;

import java.util.Scanner;

public class Exercise10_06 {
    public static void main(String[] args) {
        int n = getFromUser();
        StackOfIntegers factors = findThePrimeNumberLessThan(n);
        display(factors);
    }

    public static int getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        return number;
    }

    private static StackOfIntegers findThePrimeNumberLessThan(int number) {
        StackOfIntegers factors = new StackOfIntegers();

        for (int n = 0; n < number; n++) {
            if (isPrime(n)) {
                factors.push(n);
            }
        }
        return factors;
    }

    public static boolean isPrime(int number) {

        if (number == 2) {
            return true;
        } else if (/*number == 0 || */ number == 1 || number % 2 == 0) {
            return false;
        } else {
            for (int d = 3; d < Math.sqrt(number); d += 2) {
                if (number % d == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void display(StackOfIntegers factors) {
        int count = 0;
        while (!factors.empty()) {
            System.out.printf("%-5d", factors.pop());
            count++;

            if (count % 10 == 0 ){
                System.out.println();
            }
        }
    }
}