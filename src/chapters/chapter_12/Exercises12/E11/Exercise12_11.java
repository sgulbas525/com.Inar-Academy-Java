package chapters.chapter_12.Exercises12.E11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// If you cannot run the program from cmd,
// you can try it on a notepad document that you paste an essay
// Example for try: File file = new File(documentsPath)
public class Exercise12_11 {
    public static void main(String[] args) throws Exception {
       if (args.length != 2) {
            System.out.println("Usage: java Exercise12_11 " +
                    "StringThatWillRemoved fileName");
            System.exit(1);
        }

        File file = new File(args[1]);
        String s = "";
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                s += input.nextLine() + "\n";
            }
            s = s.replaceAll(args[0] + " ", "");
        }


        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            output.print(s);

        }
    }
}
