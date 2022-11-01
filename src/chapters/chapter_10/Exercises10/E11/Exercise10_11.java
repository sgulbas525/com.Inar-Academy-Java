package chapters.chapter_10.Exercises10.E11;

public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.printf("Area for circle1 is %.1f\n Perimeter for circle1 is %.1 f\n",
                c1.getArea(), c1.getPerimeter());
        System.out.println("Circle1 " + (c1.contains(3, 3) ? "" : "doesn't ") +
                "contains that specified point.");
        System.out.println("Circle1 " + (c1.contains(new Circle2D(4, 5, 10.5)) ? "" : "doesn't ") +
                "contains that specified circle.");
        System.out.println("Circle1 " + (c1.overlaps(new Circle2D(3, 5, 2.3)) ? "" : "doesn't ") +
                "overlaps that specified circle.");


    }
}
