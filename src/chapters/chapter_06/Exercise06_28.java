package chapters.chapter_06;

public class Exercise06_28 {
    public static void main(String[] args) {
        System.out.printf("%-8s &-3s\n", "p", "2 ^ p - 1");
        System.out.println("---------------");

        for (int p = 2; p <= 31; p++) {
            if (isMersennePrime(p)) {
                System.out.printf("%-8d %-5d\n", p, mersennePrime(p));
            }
        }
    }

    public static int mersennePrime(int p) {
        return (int) Math.pow(2, p) - 1;
    }

    public static boolean isMersennePrime(int p) {
        if (isPrime(p) && isPrime(mersennePrime(p))) {
            return true;
        }
        return false;
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
