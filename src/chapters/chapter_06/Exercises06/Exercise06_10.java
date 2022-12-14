package chapters.chapter_06.Exercises06;


import chapters.chapter_06.Listings06.Listing06_07_PrimeNumberMethod;

public class Exercise06_10 {
    public static void main(String[] args) {

        final int NUMBER_PER_LINE = 10;
        int count = 0;

        for (int i = 1; i < 10000; i++) {
            if (Listing06_07_PrimeNumberMethod.isPrime(i)) {
                count++;
                if (count % NUMBER_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.printf("%-6d", i);
            }
        }
    }
}