package chapters.chapter_12.Exercises12.E14;

import java.io.File;
import java.util.Scanner;

public class Exercise12_14 {
    public static void main(String[] args) {
        File file = getAFileNameFromUser();
        if (!file.exists()) {
            System.out.println("There isn't any file!");
            System.exit(1);
        }
        try {
            displaySumAndAverage(file);
        }catch (Exception ex){
            System.out.println("There isn't any file!");
        }
    }

    private static File getAFileNameFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file's path name: ");
        String s = input.nextLine();
        return new File(s);
    }

    private static void displaySumAndAverage(File file) throws Exception{
        int count = 0;
        double sum = 0;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                sum += input.nextDouble();
                count++;
            }
            System.out.printf("Sum of the numbers in the file: %f\nNumber of integers: %d\nAverage: %.2f"
                    ,sum, count, (sum / count));
        }
    }
}
