package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int number = input.nextInt();

        double[][] points = new double[number][2];
        System.out.print("Enter " + number + " points: ");

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double closestPointsDistance = getTheClosestPointsDistance(points);

        displayTheClosestPoints(points, closestPointsDistance);
    }

    public static double getTheClosestPointsDistance(double[][] points) {
        int p1 = 0, p2 = 1;// Initial two points
        double shortestDistance = distance(points[p1], points[p2]);// Initialize shortDistance

        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i], points[j]);
                // Find distance

                if (shortestDistance > distance) {
                    shortestDistance = distance;// Update shortestDistance
                }
            }
        }
        return shortestDistance;
    }

    public static void displayTheClosestPoints(double[][] points, double closestPointsDistance) {
        for (int point1 = 0; point1 < points.length - 1; point1++) {
            for (int point2 = point1; point2 < points.length; point2++) {
                if (distance(points[point1], points[point2]) == closestPointsDistance) {
                    System.out.printf("The closest two points are (" +
                            points[point1][0] + ", " + points[point1][1] +
                            ") and (" + points[point2][0] + ", " + points[point2][1] + ")");
                    System.out.println();
                }
            }
        }
        System.out.println("Their distance is " + closestPointsDistance);

    }

    public static double distance(double[] p1, double[] p2) {
        return Math.sqrt((p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0]));
    }
}
