import java.util.Scanner;
public class Exercise04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        double angle = 0 ;

        double x1 = radius * (Math.cos(Math.toRadians(angle)));
        double y1 = radius * (Math.sin(Math.toRadians(angle)));
        angle += 72;
        double x2 = radius * (Math.cos(Math.toRadians(angle)));
        double y2 = radius * (Math.sin(Math.toRadians(angle)));
        angle += 72;
        double x3 = radius * (Math.cos(Math.toRadians(angle)));
        double y3 = radius * (Math.sin(Math.toRadians(angle)));
        angle += 72;
        double x4 = radius * (Math.cos(Math.toRadians(angle)));
        double y4 = radius * (Math.sin(Math.toRadians(angle)));
        angle += 72;
        double x5 = radius * (Math.cos(Math.toRadians(angle)));
        double y5 = radius * (Math.sin(Math.toRadians(angle)));
//Code is wrong I'll work on it later.
        System.out.println("The coordinates of five points on the pentagon area\n(" + x1 + ", " + y1 + ")\n(" + x2 + ", " + y2 + ")\n(" + x3 + ", " + y3 + ")\n(" + x4 + ", " + y4 + ")\n(" + x5 + ", " + y5 + ")\n");
    }
}
