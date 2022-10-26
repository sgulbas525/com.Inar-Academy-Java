package chapters.chapter_09.Exercises09.E03;

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        Date date = new Date();

        for (int i = 4; i < 12; i++) {
            date.setTime((long)(Math.pow(10,i)));
            System.out.println("For elapsed " + (long)(Math.pow(10, i)) +
                    " time is " + date.toString());
        }
    }
}
