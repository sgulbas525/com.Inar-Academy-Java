package chapters.chapter_05;

public class Exercise05_27 {
    public static void main(String[] args) {
        final int NUMBERS_OF_YEAR_PER_LINE = 10;
        int count = 0;

        for (int i = 101; i < 2101; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count++;
                if (count % NUMBERS_OF_YEAR_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}