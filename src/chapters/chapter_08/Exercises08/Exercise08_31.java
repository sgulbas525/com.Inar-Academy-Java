package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_31 {
    public static void main(String[] args) {
        double[][] points = getPointsFromUser();

        double[] intersectingPoints = getIntersectingPoint(points);

        displayIntersectingPoints(intersectingPoints);
    }

    public static double[][] getPointsFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four points: ");
        double[][] points = new double[4][2];

        for (int p = 0; p < points.length; p++) {
            points[p][0] = input.nextDouble();
            points[p][1] = input.nextDouble();
        }

        return points;
    }

    // Totally about formula
    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectingPoints = new double[2];


        double a = points[0][1] - points[1][1];
        double b = -(points[0][0] - points[1][0]);
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double c = (points[2][1] - points[3][1]);
        double d = -(points[2][0] - points[3][0]);
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        if (a * d - b * c == 0) {
            return intersectingPoints;
        } else {
            intersectingPoints[0] = (e * d - b * f) / (a * d - b * c);
            intersectingPoints[1] = (a * f - e * c) / (a * d - b * c);
        }

        return intersectingPoints;
    }

    public static void displayIntersectingPoints(double[] intersectingPoints) {
        if (intersectingPoints == null) {
            System.out.println("The two lines are parallel.");
        } else {
            System.out.printf("The intersecting point is at (%.4f, %.4f)"
                    , intersectingPoints[0], intersectingPoints[1]);
        }
    }
}
