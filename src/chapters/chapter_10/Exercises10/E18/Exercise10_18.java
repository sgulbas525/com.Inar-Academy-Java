package chapters.chapter_10.Exercises10.E18;

import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        fivePrimeNumbersGreaterThanMaxValue();
    }

    public static void fivePrimeNumbersGreaterThanMaxValue() {
    int count = 0;
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);

    while(count < 5){
        if (isPrime(number)){
            System.out.println(number);
            count++;
        }
        number = number.add(BigInteger.ONE);
    }

    }

    public static boolean isPrime(BigInteger b){
        BigInteger stop = b.divide(new BigInteger("2")).add(BigInteger.ONE);
        BigInteger divisor = new BigInteger("2");
        BigInteger zero = new BigInteger("0");
        while (divisor.compareTo(stop) != 0) {
            if (b.remainder(divisor).compareTo(zero) == 0) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;

    }
}
