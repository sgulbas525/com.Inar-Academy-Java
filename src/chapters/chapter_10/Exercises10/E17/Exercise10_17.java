package chapters.chapter_10.Exercises10.E17;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        displaySquareNumbers(10);
    }

    public static void displaySquareNumbers(int i) {
        // Find the Long.MAX_VAULE's square and then
        // display square by adding one and multiply by itself ten times.
        long sqrt = (long) (Math.sqrt(Long.MAX_VALUE)) + 1;
        BigInteger number;
        number = new BigInteger(sqrt + "");

        System.out.println("LONG.MAX_VALUE is: " + Long.MAX_VALUE);
        for (int j = 0; j < i; j++) {
            System.out.println(number.multiply(number));
            number = number.add(BigInteger.ONE);
        }


    }
}
