package chapters.chapter_11.Exercises11.E12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = getFromUser(5);
        double sumOfList = sum(list);

        System.out.println("Sum of the list is " + sumOfList);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        while (!list.isEmpty()) {
            sum += list.remove(list.size() - 1);
        }
        return sum;
    }


    public static ArrayList<Double> getFromUser(int n) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            list.add(input.nextDouble());
        }
        return list;
    }
}
