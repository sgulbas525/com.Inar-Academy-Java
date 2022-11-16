package chapters.chapter_12.Exercises12.E21;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_21 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Serhat\\Desktop\\SortedStrings.txt");


        try {
            System.out.println("Is the file sorted? " + isFileSorted(file));
        } catch (Exception ex) {
            System.out.println("There isn't any file like SortedStrings");
        }

    }

    private static boolean isFileSorted(File file) throws Exception {
        /*ArrayList<String> word = new ArrayList<>();

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                word.add(input.next());
            }

            for (int i = 0; i < word.size() - 1; i++) {
                if (word.get(i).compareToIgnoreCase(word.get(i + 1)) > 0) {
                    return false;
                }
            }
            return true;
*/

        String s1;
        String s2 = null;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
               // s1 will be the greater one
                s1 = input.next();
                if (s2 != null) {
                    if (s2.compareToIgnoreCase(s1) > 0) {
                        return false;
                    }
                }
                // s2 will be the smaller one
                s2 = s1;
            }
            return true;
        }
    }
}
