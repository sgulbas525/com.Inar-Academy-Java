package chapters.chapter_06.Exercises06;

public class Exercise06_26 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < 100) {
            if (isPalindromic(number) && isPrime(number)) {
                count++;
                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.printf("%-6d", number);
                }
            }
            number++;
        }
    }
    public static boolean isPalindromic(int number) {
        String reversed = "";
        String num = number +"";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed = reversed + num.charAt(i);
        }
        return reversed.equals(num);
    }

    public static boolean isPrime(int number) {
        for (int d = 2; d <= number / 2; d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }
}







