package chapters.chapter_06.Exercises06;

public class Exercise06_14 {
    public static void main(String[] args) {
        System.out.printf("%-10s %3s-\n", "i", "m(i)");

        for (int i = 1; i < 1000; i += 100){
            System.out.printf("%-10d %-1.4f\n", i, computePi(i));
        }
    }


    public static double computePi(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (Math.pow(-1, i + 1) / (2 * i - 1));
        }

        return 4 * sum;
    }
}
