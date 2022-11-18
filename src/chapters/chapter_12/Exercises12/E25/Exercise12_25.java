package chapters.chapter_12.Exercises12.E25;

import java.io.File;
import java.util.Scanner;

public class Exercise12_25 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Serhat\\workspace\\Salary.txt");

        if (!file.exists()) {
            System.out.println("There isn't any file.");
            System.exit(1);
        }

        double[] salaries = new double[3];
        int[] counts = new int[3];

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] arr = s.split(" ");
                int rank = getRank(arr[arr.length - 2]);
                counts[rank]++;
                salaries[rank] += Double.parseDouble(arr[arr.length - 1]);
            }
        }

        displayAll(salaries, counts);
    }

    private static void displayAll(double[] salaries, int[] counts) {
        double total = salaries[0] + salaries[1] + salaries[2];
        double average = total / (counts[0] + counts[1] + counts[2]);


        System.out.printf("Total salary of Assistants is %.2f\n\tAverage is %.2f\n" +
                        "Total salary of Associate is %.2f\n\tAverage is %.2f\n" +
                        "Total salary of Full is %.2f\n\tAverage is %.2f\n" +
                        "The total salary of faculty is %.2f\n\tAverage is %.2f",
                salaries[0],(salaries[0] / counts[0]), salaries[1], (salaries[1] / counts[1]), salaries[2], (salaries[2] / counts[2]),
                total, average);
    }

    private static int getRank(String s) {
        if (s.equalsIgnoreCase("assistant")) {
            return 0;
        } else if (s.equalsIgnoreCase("associate")) {
            return 1;
        } else
            return 2;
    }
}
