package chapters.chapter_05;

public class Exercise05_20 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        final int NUMBERS_PER_LINE = 8;
        boolean isPrime;

        while (num < 1000) {
            isPrime = true;
            for (int i = 2; i < num; i++)
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime) {
               count++;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(num);
                else
                    System.out.print(num + "  ");
            }
            num++;
        }
    }
}
