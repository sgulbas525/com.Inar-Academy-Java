package chapters.chapter_12.Exercises12.E16;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

// If you cannot run the program from cmd,
// you can try it on a notepad document that you paste that you paste an essay
// Example for try: File file = new File("C:\\Users\\Serhat\\Desktop\\document.txt")
public class Exercise12_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);

        if (!sourceFile.exists()) {
            System.out.println("There isn't any file like " + args[0]);
            System.exit(2);
        }

        File targetFile = new File("C:\\Users\\Serhat\\Desktop\\newSourceFile.txt");

        if (targetFile.exists()) {
            System.out.println("There is already a file like newSourceFile.txt");
            System.exit(3);
        }
        replaceWords(sourceFile, args[1], targetFile, args[2]);


    }


    private static void replaceWords(File sourceFile, String oldWord, File targetFile, String newWord) throws Exception{
        String s = "";
        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile)
        ) {
            while (input.hasNext()) {
                s += input.nextLine() + "\n";
            }

           s = s.replaceAll(oldWord, newWord);

            output.print(s);
        }
    }
}