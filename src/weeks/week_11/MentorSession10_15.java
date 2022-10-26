package weeks.week_11;

import java.util.Scanner;

public class MentorSession10_15 {
    // (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) = 0
    public static void main(String[] args) {
        double[][] points = getFromUser();

        System.out.println("The five points are " + (sameLine(points) ? "" : "not ") + "on the same line");
    }

    public static boolean sameLine(double[][] points) {
        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][1];

        for (int p = 2; p < points.length; p++) {
            if (((x1 - x0) * (points[p][1] - y0) - (points[p][0] - x0) * (y1 - y0)) != 0) {
                return false;
            }
        }
        return true;
    }







    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];


        System.out.println("Enter five points: ");
        for (int p = 0; p < points.length; p++) {
            points[p][0] = input.nextDouble();
            points[p][1] = input.nextDouble();
        }

        return points;
    }
}
