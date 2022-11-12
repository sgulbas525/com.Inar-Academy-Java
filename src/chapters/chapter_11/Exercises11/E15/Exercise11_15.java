package chapters.chapter_11.Exercises11.E15;

import java.util.ArrayList;
import java.util.Scanner;
// Output of the book is false.
public class Exercise11_15 {
    public static void main(String[] args) {
        ArrayList<Double> points = getFromUser();

        double area = getAreaOfPolygon(points);
        System.out.printf("The total area is %.3f", area);
    }

    public static double getAreaOfPolygon(ArrayList<Double> points) {
        double sum = 0;
        for (int i = points.size() - 1; i >= 3; i -= 2) {
            double x1 = points.get(i);
            double y1 = points.get(i - 1);
            double x2 = points.get(i - 2);
            double y2 = points.get(i - 3);
            sum += ((x1 * y2) - (y1 * x2));
        }
        sum += (points.get(points.size() - 2) * points.get(1)) - (points.get(points.size() - 1) * points.get(0));
        return Math.abs(sum / 2);
    }

    public static ArrayList<Double> getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the points: ");
        int number = input.nextInt();

        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < number * 2; i++) {
            points.add(input.nextDouble());
        }

        return points;
    }
}
