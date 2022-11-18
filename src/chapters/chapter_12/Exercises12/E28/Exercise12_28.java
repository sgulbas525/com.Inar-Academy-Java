package chapters.chapter_12.Exercises12.E28;

import java.io.File;

public class Exercise12_28 {
    public static void main(String[] args) {
        for (String s : args) {
            File file = new File(s);
            StringBuilder sb1 = new StringBuilder(s);
            if (s.matches("Exercise\\d_\\d+")) {
                sb1.insert(8, 0);
            }
            File newName = new File(String.valueOf(sb1));
            file.renameTo(newName);
        }
    }
}
