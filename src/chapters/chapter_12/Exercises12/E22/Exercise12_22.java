package chapters.chapter_12.Exercises12.E22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_22 {
    public static void main(String[] args) throws Exception {
       /* if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 dir oldString newString");
            System.exit(1);
        }*/

        File directory = new File("C:\\Users\\Serhat\\Desktop\\deneme2");
        if (!directory.exists()) {
            System.out.println("There isn't any directory");
            System.exit(2);
        }

        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);
        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    } else
                        replaceString(files[i], "Sinan", "out");
                }
            }
        }

    }

    private static void replaceString(File file, String oldString, String newString) throws IOException {
        String s = "";
        StringBuilder sb1 = new StringBuilder();
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                s = input.nextLine();
                sb1.append(s.replaceAll(oldString, newString) + "\n");
            }


            try (
                    PrintWriter output = new PrintWriter(file);
            ) {
                output.print(sb1);

            }
        }
    }
}
