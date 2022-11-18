package chapters.chapter_12.Exercises12.E29;

import java.io.File;

public class Exercise12_29 {
    public static void main(String[] args) {
        for (String s : args) {
            File file = new File(s);
            StringBuilder sb1 = new StringBuilder(s);
            if (s.matches("Exercise\\d+_\\d")) {
                int n = s.indexOf("_");
                sb1.insert(n + 1, 0);
            }
            File newName = new File(String.valueOf(sb1));
            file.renameTo(newName);
        }
    }
}
