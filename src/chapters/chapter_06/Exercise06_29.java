package chapters.chapter_06;

public class Exercise06_29 {
        public static void main(String[] args) {
            for (int i = 2; i < 1000 - 2; i++)
                if (isPrime(i) && isPrime(i + 2)) {
                    System.out.println("(" + i + ", " + (i + 2) + ")");
                }
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

