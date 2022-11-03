package chapters.chapter_10.Exercises10.E16;

import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        displayNumbersWith50DecimalDigits(10);
    }

    public static void displayNumbersWith50DecimalDigits(int i) {
        int count = 0;
        BigInteger number = new BigInteger("100000000000000000000000000000000000000000000000000");

        while (count < i){
            if (number.remainder(new BigInteger ("2")).equals(BigInteger.ZERO) ||
                    number.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
