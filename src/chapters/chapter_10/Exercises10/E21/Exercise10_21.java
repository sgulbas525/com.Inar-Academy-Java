package chapters.chapter_10.Exercises10.E21;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        displayDividableBy5Or6(10);
    }

    public static void displayDividableBy5Or6(int n) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);
        int count = 0;

        while (count < n){
            if (isDividable(number)){
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }

    }

    public static boolean isDividable(BigInteger number) {

    return number.remainder(new BigInteger("5")).equals(BigInteger.ZERO) ||
            number.remainder(new BigInteger("6")).equals(BigInteger.ZERO);
    }
}
