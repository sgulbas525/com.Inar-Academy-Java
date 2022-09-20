package chapters.chapter_05;

public class Exercise05_33 {
    public static void main(String[] args) {
        System.out.print("The perfect numbers are:");
        for (int i = 1; i < 10000; i++) {
            double sum = 0;

            for (int j = i - 1; j > 0; j--) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.printf("%5d", i);
            }
        }
    }
}
