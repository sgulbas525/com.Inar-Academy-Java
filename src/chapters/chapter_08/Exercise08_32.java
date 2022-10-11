package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_32 {
    public static void main(String[] args) {

        double[][] pointsOfTriangle = getPointsOfTriangleFromUser();

        displayArea(pointsOfTriangle);
    }

    public static void displayArea(double[][] pointsOfTriangle) {
        double area = getArea(pointsOfTriangle);

        if (area == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of triangle is %.2f", area);
        }
    }

    // Totally formula
    public static double getArea(double[][] pointsOfTriangle) {
        double side1 = Math.pow(Math.pow(pointsOfTriangle[1][0]- pointsOfTriangle[0][0], 2)
                + Math.pow(pointsOfTriangle[1][1] - pointsOfTriangle[0][1], 2), 0.5);

        double side2 = Math.pow(Math.pow(pointsOfTriangle[2][0]- pointsOfTriangle[1][0], 2
        ) + Math.pow(pointsOfTriangle[2][1]- pointsOfTriangle[1][1], 2), 0.5);

        double side3 = Math.pow(Math.pow(pointsOfTriangle[2][0]- pointsOfTriangle[0][0], 2)
                + Math.pow(pointsOfTriangle[2][1] - pointsOfTriangle[0][1], 2), 0.5);

        double s = (side1 + side2 + side3)/2;

        double area = Math.pow(s * (s-side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public static double[][] getPointsOfTriangleFromUser() {
        Scanner input = new Scanner(System.in);

        double[][] pointsOfTriangle = new double[3][2];

        System.out.println("Enter  x₁, y₁, x₂, y₂, x₃, y₃: ");

        for (int p = 0; p < pointsOfTriangle.length; p++) {
            pointsOfTriangle[p][0] = input.nextDouble();
            pointsOfTriangle[p][1] = input.nextDouble();
        }

        return pointsOfTriangle;
    }
}