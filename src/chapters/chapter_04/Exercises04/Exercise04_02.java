package chapters.chapter_04.Exercises04;

import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String[] args){
        final double RADIUS = 6371.01;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        double d = RADIUS * Math.acos(Math.sin(Math.toRadians(p1x)) * Math.sin(Math.toRadians(p2x)) + Math.cos(Math.toRadians(p1x)) * Math.cos(Math.toRadians(p2x)) * Math.cos(Math.toRadians(p1y - p2y)) );


        System.out.println("The distance between the two points is " + d + "km");
    }
}
