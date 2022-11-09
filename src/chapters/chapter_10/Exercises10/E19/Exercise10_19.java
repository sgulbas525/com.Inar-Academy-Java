package chapters.chapter_10.Exercises10.E19;

import chapters.chapter_10.Exercises10.E03.MyInteger;

import java.math.BigInteger;

public class Exercise10_19 {
    public static void main(String[] args) {

        displayMersennePrimes(100);
    }


    public static void displayMersennePrimes(int limit) {
        BigInteger mersennePrime;
        System.out.printf("%-5s%30s\n", "p", "2^p - 1");


        for (int p = 0; p <= limit; p++) {
            if (isPrime(p)) {
                mersennePrime = BigInteger.ONE;
                for (int i = 0; i < p; i++) {
                    mersennePrime = mersennePrime.multiply(new BigInteger("2"));
                }
                mersennePrime = mersennePrime.subtract(BigInteger.ONE);
                if (isPrime(mersennePrime))
                    System.out.printf("%-5d%30s\n", p, mersennePrime);
            }
        }
    }

    public static boolean isPrime(int p) {
        if (p == 0 || p == 1 || p % 2 == 0) return false;
        if (p == 2) return true;

        for (int i = 3; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(BigInteger b) {
       if(b.equals(BigInteger.ONE) || b.equals(BigInteger.ZERO))
           return false;

       if (b.equals(new BigInteger(2 + "")))
           return true;

       if (b.divide(new BigInteger(2 + "")).equals(BigInteger.ZERO))

           return false;

        BigInteger divisor = new BigInteger("3");
        while (divisor.compareTo(b.divide(new BigInteger(2 + ""))) <= 0) {
            if (b.remainder(divisor).equals(BigInteger.ZERO)) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }
}