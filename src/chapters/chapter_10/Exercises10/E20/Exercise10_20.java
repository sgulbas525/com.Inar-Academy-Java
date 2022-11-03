package chapters.chapter_10.Exercises10.E20;

import java.math.BigDecimal;

public class Exercise10_20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            displayE(i * 100);
        }
    }

    public static void displayE(int limit) {
        BigDecimal e = BigDecimal.ONE;
        for (int i = 1; i <= limit; i++) {
            BigDecimal b = BigDecimal.ONE.divide(factorial(i), 25, BigDecimal.ROUND_UP);
            e = e.add(b);
        }
        System.out.printf("e for %-4d is: %s\n", limit, e);

    }

    public static BigDecimal factorial(long n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigDecimal(i + ""));
        return result;
    }
}

