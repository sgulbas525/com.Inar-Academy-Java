package chapters.chapter_03.Exercises03;

import java.util.Scanner;

public class Exercise03_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1 and p2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double loc = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

        System.out.print("(" + x3 + ", " + y3 + ") is on the ");

        if (loc > 0)
            System.out.println("left side of line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");

        else if (loc < 0)
            System.out.println("right side of line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");

        else
            System.out.println("ont he same line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
    }
}

