package chapters.chapter_09.Listings09;

public class Listing09_09_TestCircleWithPrivateDataFields {
    /* Main method */
    public static void main(String[] args) {
        // Create a circle with radius 5.0
        Listing09_08_CircleWithPrivateDataFields myCircle =
                new Listing09_08_CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by %10
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is " +
                Listing09_08_CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
