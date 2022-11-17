package chapters.chapter_12.Exercises12.E24;

import java.io.File;
import java.io.PrintWriter;

public class Exercise12_24 {
    public static void main(String[] args) throws Exception {
        File file = new File("Salary.txt");

        if (file.exists()) {
            System.out.println("That file already exists.");
            System.exit(1);
        }

        StringBuilder sb1 = new StringBuilder();
        String[] ranks = {"Assistant", "Associate", "Full"};
        int rank;
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 1; i <= 1000; i++) {
                rank = (int) (Math.random() * ranks.length);
                sb1 = sb1.replace(0, sb1.length(), ranks[rank]);
                double salary = getSalary(rank);
                output.printf("FirstName%d LastName%d %s %.2f\n",
                        i, i, sb1, salary);
            }
        }
    }

    private static double getSalary(int rank) {
        if (rank == 1){
            return (Math.random() * 30_000) + 50_000;
        } else if (rank == 2) {
            return (Math.random() * 50_000) + 60_000;
        }else
            return (Math.random() * 55_000) + 75_000;

    }
}