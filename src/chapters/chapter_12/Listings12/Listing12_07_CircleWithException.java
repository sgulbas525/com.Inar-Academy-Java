package chapters.chapter_12.Listings12;

public class Listing12_07_CircleWithException {
    // The radius of the circle
    private double radius;

    // The number of the objects created
    private static int numberOfObjects = 0;

    // Constructor a circle with radius 1


    public Listing12_07_CircleWithException() {
        this(1.0);
    }

    public Listing12_07_CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    // Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Return the area of this circle
    public double findArea() {
        return radius * radius * Math.PI;
    }
}
