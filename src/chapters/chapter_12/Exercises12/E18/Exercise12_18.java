package chapters.chapter_12.Exercises12.E18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// If you cannot run the program from cmd,
// you can try it on a notepad document that you paste a code from your framework
// Example for try: File file = new File("C:\\Users\\Serhat\\Desktop\\document.txt")
public class Exercise12_18 {
    public static void main(String[] args) throws Exception {
       /*if (args.length != 1) {
            System.out.println("Usage: Exercise12_18 srcRootDirectroy");
            System.exit(1);
        }*/

        File directory = new File("C:\\Users\\Serhat\\Desktop\\deneme2");
        if (!directory.exists() || !directory.isDirectory()) {
            if (!directory.exists()) {
                System.out.println(directory.getName() + " is not exists!");
                System.exit(2);
            }
            if (!directory.isDirectory()) {
                System.out.println(directory.getName() + " is not a directory!");
                System.exit(2);
            }
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
                    if (files[i].isFile() && files[i].getName().endsWith(".java")) {
                        insertPackageName(files[i]);
                    }
                }

            }
        }
    }

    public static void insertPackageName(File file) throws IOException {
        String[] s1 = file.getParent().split("\\\\");
        String s = "";
        try (
                Scanner input = new Scanner(file)

        ) {
            while (input.hasNext()) {
                s += "\n" + input.nextLine();
            }

            try (
                    PrintWriter output = new PrintWriter(file)
            ) {

                s ="package " +  s1[s1.length - 1] + ";\n" + s;
                output.println(s);
            }
        }
    }
}