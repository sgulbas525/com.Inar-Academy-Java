package chapters.chapter_12.Exercises12.E31;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter gender(M/F): ");
        char gender = input.next().charAt(0);
        System.out.println("Enter name: ");
        String name = input.next();

        File file = new File("C:\\Users\\Serhat\\Desktop\\babynames" + year + "s.txt");

        findTheNamesRank(file, year, gender, name );
    }

    private static void findTheNamesRank(File file, int year, char gender, String name) throws IOException {
        if (!file.exists()) {
            System.out.println("There isn't any file!");
            System.exit(1);
        }

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                int rank = input.nextInt();
                String mName = input.next();
                double mBirthRate = input.nextDouble();
                String fName = input.next();
                double fBirthRate = input.nextDouble();
                if ((gender == 'M' && name.equalsIgnoreCase(mName)) ||
                        (gender == 'F' && name.equalsIgnoreCase(fName))) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    return;
                }
            }

        }
        System.out.println("The name " + name + " is not ranked in year " + year);
    }
}