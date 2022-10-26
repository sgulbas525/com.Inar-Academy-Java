package chapters.chapter_09.Exercises09;

import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args) {
        Random r = new Random(100);

        for (int i = 0; i < 50; i++) {
            System.out.printf("%-3d", r.nextInt(100));

            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
