package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_34 {
    public static void main(String[] args) {
        double[][] points = getFromUser();
        double[] rightmostLowestPoint = getTheRightmostLowestPoint(points);
        displayRightmostLowestPoint(rightmostLowestPoint);
    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];
        System.out.println("Enter points: ");
        for (int p = 0; p < points.length; p++) {
            points[p][0] = input.nextDouble();
            points[p][1] = input.nextDouble();
        }

        return points;
    }

    public static double[] getTheRightmostLowestPoint(double[][] points) {
        // First find the lowest point, if there are many find among them the rightmost one

        double x = points[0][0];
        double y = points[0][1];

        for (int p = 1; p < points.length; p++) {
            if (y > points[p][1]) {
                x = points[p][0];
                y = points[p][1];
            } else if (y == points[p][1]) {
                if (points[p][0] > x) {
                    x = points[p][0];
                    y = points[p][1];
                }
            }
        }
        return new double[]{x, y};
    }


    public static void displayRightmostLowestPoint(double[] rightmostLowestPoint) {
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)",
                rightmostLowestPoint[0], rightmostLowestPoint[1]);
    }
}
