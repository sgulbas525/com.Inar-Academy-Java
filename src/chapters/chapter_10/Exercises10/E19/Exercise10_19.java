package chapters.chapter_10.Exercises10.E19;

import java.math.BigInteger;

public class Exercise10_19 {
    public static void main(String[] args) {
        displayMersennePrimes(100);
    }

    public static void displayMersennePrimes(int limit) {
        BigInteger mersennePrime;
        System.out.printf("%-5s%30s\n", "p", "2^p - 1");

        for (int p = 0; p <= limit; p++) {
            if (isPrime(p)){
                mersennePrime = new BigInteger("2");
                for (int i = 0; i < p; i++) {
                    mersennePrime = mersennePrime.multiply(new BigInteger("2"));
                }
                System.out.printf("%-5d%30s\n", p, mersennePrime.subtract(BigInteger.ONE));
            }


        }
    }

    public static boolean isPrime(int p) {
        if(p == 0 || p == 1 || p % 2 == 0) return false;
        if (p == 2) return true;

        for (int i = 3; i <= Math.sqrt(p); i++) {
            if (p % i == 0){
                return false;
            }
        }
        return true;
    }
}
