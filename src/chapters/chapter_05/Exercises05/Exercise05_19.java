package chapters.chapter_05.Exercises05;

public class Exercise05_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {

            for (int j = 8; j > i; j--)
                System.out.printf("%7s", "");

            for (int j = i; j > 0; j--)
                System.out.printf("%7.1f", Math.pow(2, j - 1));

            for (int j = 2; j <= i; j++)
                System.out.printf("%7.1f", Math.pow(2, j - 1));

            System.out.println();
        }
    }
}