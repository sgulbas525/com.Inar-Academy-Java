package chapters.chapter_12.Exercises12.E26;

import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory name: ");

        File directory = new File(input.nextLine());

        if (directory.exists()) {
            System.out.println("Directory already exists!");
            System.exit(1);
        }

        if (directory.mkdirs())
            System.out.println("Directory created successfully");
        else
            System.out.println("There is a problem!");

    }
}
