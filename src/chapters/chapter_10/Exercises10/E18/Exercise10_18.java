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
        if(b.equals(BigInteger.ONE) || b.equals(BigInteger.ZERO))
            return false;

        if (b.equals(new BigInteger(2 + "")))
            return true;

        if (b.remainder(new BigInteger(2 + "")).equals(BigInteger.ZERO))

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
