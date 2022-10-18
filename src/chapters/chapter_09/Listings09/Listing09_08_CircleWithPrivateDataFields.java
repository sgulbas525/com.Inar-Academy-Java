package chapters.chapter_09.Listings09;

public class Listing09_08_CircleWithPrivateDataFields {
    /* The radius of the circle */
    private double radius = 1;

    /* The number of objects */
    private static int numberOfObjects = 0;

    /* Construct a circle with radius */
    public Listing09_08_CircleWithPrivateDataFields(){
        numberOfObjects++;
    }

    /* Construct a circle with a specified radius */
    public Listing09_08_CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    /* Return radius */
    public double getRadius(){
        return radius;
    }

    /* Set a new radius */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /* Return numberOfObject */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /* Return the area of this circle */
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
