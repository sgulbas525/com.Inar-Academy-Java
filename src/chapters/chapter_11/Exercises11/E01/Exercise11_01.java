package chapters.chapter_11.Exercises11.E01;

import java.util.Scanner;

public class Exercise11_01 {
    public static void main(String[] args) {
        Triangle t1 = getATriangleFromUser();
        System.out.println("Area of t1 = " + t1.getArea() +
                "\nPerimeter of t1 = " + t1.getPerimeter() +
                "\nColour of t1 = " + t1.getColor() +
                "\nt1 is filled = " + t1.isFilled());
    }

    public static Triangle getATriangleFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of triangle: ");
        String colour = input.next();

        System.out.println("Enter whether the triangle is filled(true/false): ");
        boolean isFilled = input.nextBoolean();

        Triangle t1 = new Triangle(side1, side2, side3);
        t1.setColor(colour);
        t1.setFilled(isFilled);

        return t1;
    }
}
