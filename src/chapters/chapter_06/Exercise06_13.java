package chapters.chapter_06;

public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.printf("%-10s %3s\n", "i", "m(i)");
        System.out.println("---------------");

        for (int i = 1; i <= 21; i++){
            System.out.printf("%-10d %.4f\n", i, computeM(i));
        }
    }





    public static double computeM(int m) {
        double sum = 0;
        for (int i = 1; i <= m; i++)
            sum += i / (i + 1.0);

        return sum;
    }
}