package chapters.chapter_12.Exercises12.E12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

// If you cannot run the program from cmd,
// you can try it on a notepad document that you paste a code from your framework
// Example for try: File file = new File(documentsPath)

public class Exercise12_12 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java E12_12 [filename]");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File " + args[0] + " not found");
            System.exit(2);
        }

        String s = "";

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                s += input.nextLine() + " \n";
            }
            s = s.replaceAll("\n\\s*\\{", " {");
        }
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            output.print(s);
        }
    }

}
