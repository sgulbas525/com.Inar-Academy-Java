package chapters.chapter_10.Exercises10.E11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2. * getRadius() * Math.PI;
    }

    public boolean contains(double x, double y) {
        // If the points distance to center of our circle is greater than the radius of circle,
        // the point isn't inside our circle
        return getDistance(x, y) <= getRadius();
    }

    public boolean contains(Circle2D circle) {
        double r = getRadius();
        double r1 = circle.getRadius();
        // If the second circle's center plus radius of it is less than our radius it means it's contained by our circle
        return getDistance(circle) <= (r - r1);

    }

    public boolean overlaps(Circle2D circle) {
        double r = getRadius();
        double r1 = circle.getRadius();

        // If the center of the second circle is in the range of the two radius sum that
        // means some part of the second circle is inside our circle,
        // our circle overlaps the second one
        return getDistance(circle) <= (r + r1);
    }

    public double getDistance(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));

    }
}
