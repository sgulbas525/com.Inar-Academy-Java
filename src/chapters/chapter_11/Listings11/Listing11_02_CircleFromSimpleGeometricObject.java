package chapters.chapter_11.Listings11;

import java.util.Date;

public class Listing11_02_CircleFromSimpleGeometricObject
        extends Listing11_01_SimpleGeometricObject {

    private double radius;

    public Listing11_02_CircleFromSimpleGeometricObject() {

    }


    public Listing11_02_CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public Listing11_02_CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
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

    // Return area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return the diameter
    public double getDiameter() {
        return 2 * radius;
    }

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
