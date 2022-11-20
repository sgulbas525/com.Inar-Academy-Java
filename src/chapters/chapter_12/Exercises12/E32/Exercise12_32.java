package chapters.chapter_12.Exercises12.E32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_32 {
    public static void main(String[] args) throws Exception {
        displayTheScheme();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s", 2010 - i + "");
            File file = getTheFile(2010 - i);

            if (!file.exists()) {
                System.out.println("There isn't any file for " + (2010 - i));
                continue;
            }
            displayTheNames(file);

        }
    }

    private static void displayTheNames(File file) throws FileNotFoundException {
        ArrayList<String> fNames = new ArrayList<>();
        ArrayList<String> mNames = new ArrayList<>();
        int countNames = 0;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (countNames < 5) {
                int rank = input.nextInt();
                mNames.add(input.next());
                double mBirthRate = input.nextDouble();
                fNames.add(input.next());
                double fBirthRate = input.nextDouble();
                countNames++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s", fNames.remove(0));
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s", mNames.remove(0));
        }
        System.out.println();

    }

    private static File getTheFile(int year) {
        File file = new File("C:\\Users\\Serhat\\Desktop\\babynames" + year + "s.txt");
        return file;
    }

    private static void displayTheScheme() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
                "Year", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5",
                "Rank1", "Rank2", "Rank3", "Rank4", "Rank5");
        System.out.println("----------------------------------------------------------------------------------------------------------");

    }
}
