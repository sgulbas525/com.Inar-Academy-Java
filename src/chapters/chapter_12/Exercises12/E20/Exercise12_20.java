package chapters.chapter_12.Exercises12.E20;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_20 {
    public static void main(String[] args) throws Exception {
       /* if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }*/

        File directory = new File("C:\\Users\\Serhat\\Desktop\\deneme2");
        if (!directory.isDirectory()) {
            System.out.println(directory.getName() + " is not a directory!");
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
                    }
                    if (files[i].isFile()) {
                        removePackageName(files[i]);
                    }
                }
            }
        }
    }

    private static void removePackageName(File file) throws IOException {
        String s = "";
        try (
                Scanner input = new Scanner(file);
        ) {
            input.nextLine();
            input.nextLine();
            while (input.hasNext()) {
                s += input.nextLine() + "\n";
            }

            try (
                    PrintWriter output = new PrintWriter(file);
            ) {
                output.print(s);
            }
        }
    }
}


