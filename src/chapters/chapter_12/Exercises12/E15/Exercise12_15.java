package chapters.chapter_12.Exercises12.E15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_15 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Serhat\\Desktop\\Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("There is already a file with the same name");
            System.exit(1);
        }

        writeRandomNumbers(file, 100);

        ArrayList<Integer> list = sortInIncreasingOrder(file);
        displayList(list);

    }

    private static void displayList(ArrayList<Integer> list) {
        int count = 0;
        while (!list.isEmpty()) {
            count++;
            System.out.printf("%3d ", list.remove(0));
            if (count % 10 == 0)
                System.out.println();
        }
    }

    private static ArrayList<Integer> sortInIncreasingOrder(File file) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        return list;
    }


    private static void writeRandomNumbers(File file, int limit) throws Exception {
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 0; i < limit; i++) {
                int random = (int) (Math.random() * 1000);
                output.print(random + " ");
            }
        }
    }
}
