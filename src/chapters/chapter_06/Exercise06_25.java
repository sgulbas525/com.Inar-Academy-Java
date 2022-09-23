package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");
        long milliSeconds = input.nextLong();

        convertMillis(milliSeconds);
    }

    public static void convertMillis(long milliSeconds) {
        System.out.println(getTime(milliSeconds));

    }

    public static String getTime(long milliSeconds) {
        String time ;

        long totalSeconds = milliSeconds / 1000;
        time = " : " + totalSeconds % 60;

        totalSeconds /=  60;
        time =  " : " + totalSeconds % 60 + time;// Minutes

        totalSeconds /= 60;
        time = (totalSeconds) + time; // Hours

        return time;
    }

}


