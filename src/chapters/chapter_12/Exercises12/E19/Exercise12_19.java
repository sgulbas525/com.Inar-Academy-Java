package chapters.chapter_12.Exercises12.E19;

import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://philpapers.org/rec/VYGTPO");


        String line;
        String[] s;
        int countWords = 0;
        try (
                Scanner input = new Scanner(url.openStream())
        ) {
            while (input.hasNext()) {
                line = input.nextLine() + "\n";
                s = line.split(" ");
                countWords += s.length;
            }
        }
        System.out.println("https://philpapers.org/rec/VYGTPO has " + countWords + " words");
    }
}