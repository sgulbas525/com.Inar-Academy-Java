package chapters.chapter_10.Exercises10.E12;

import chapters.chapter_10.Exercises10.E04.MyPoint;

public class Exercise10_12 {
    public static void main(String[] args) {


        MyTriangle2D t1 = new MyTriangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));

        System.out.printf("Area for triangle t1 is %.1f\nPerimeter for triangle t1 is %.1f\n",
                t1.getArea(), t1.getPerimeter());
        System.out.println("Triangle t1 " + (t1.contains(3, 3) ? "" : "doesn't ") +
                "contains that specified point.");
        System.out.println("Triangle t1 " + (t1.contains(new MyTriangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1),
                new  MyPoint(1, 3.4))) ? "" : "doesn't ") +
                "contains that specified triangle.");

        System.out.println("Triangle t1 " + (t1.overlaps(new MyTriangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3),
                new MyPoint(2, 6.5))) ? "" : "doesn't ") +
                "overlaps that specified triangle.");
    }
}