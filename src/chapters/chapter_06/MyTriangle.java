package chapters.chapter_06;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3))
            System.out.printf("The area of the triangle is %.2f \n", area(side1, side2, side3));
        else
            System.out.println("The triangle is invalid!");

    }
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public static double area (double side1, double side2, double side3){

        double s = (side1 + side2 + side3)/2;
        double area = Math.pow(s * (s-side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }
}
