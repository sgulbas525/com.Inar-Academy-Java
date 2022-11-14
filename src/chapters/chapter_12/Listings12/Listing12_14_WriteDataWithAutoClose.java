package chapters.chapter_12.Listings12;

import java.io.File;
import java.io.PrintWriter;

public class Listing12_14_WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
                // Create a file
                PrintWriter output = new PrintWriter(file)
        ) {
            // Write formatted output to file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }

    }
}
