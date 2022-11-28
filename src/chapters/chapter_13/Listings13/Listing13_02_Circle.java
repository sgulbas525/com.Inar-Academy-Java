package chapters.chapter_13.Listings13;

public class Listing13_02_Circle extends Listing13_01_GeometricObject {
    private double radius;

    public Listing13_02_Circle() {

    }

    public Listing13_02_Circle(double radius) {
        this.radius = radius;
    }

    public Listing13_02_Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override

    // Return area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return the diameter
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    // Return perimeter
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Print the circle info
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}
