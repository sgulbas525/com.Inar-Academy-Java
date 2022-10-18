package chapters.chapter_09.Listings09;

public class Listing09_10_TestPassObject {
    /* Main method */
    public static void main(String[] args) {
        // Create a Circle object with radius 1
        Listing09_08_CircleWithPrivateDataFields myCircle =
                new Listing09_08_CircleWithPrivateDataFields(1);

        // Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n);

        // See myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(
            Listing09_08_CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
