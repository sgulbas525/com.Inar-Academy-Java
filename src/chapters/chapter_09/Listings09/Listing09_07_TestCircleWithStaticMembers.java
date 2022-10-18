package chapters.chapter_09.Listings09;

public class Listing09_07_TestCircleWithStaticMembers {
    /* Main method */
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " +
                Listing09_06_CircleWithStaticMembers.numberOfObjects);

        // Create c2
        Listing09_06_CircleWithStaticMembers c1 = new Listing09_06_CircleWithStaticMembers();

        // Display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" + c1.numberOfObjects + ")");

        // Create c2
        Listing09_06_CircleWithStaticMembers c2 = new Listing09_06_CircleWithStaticMembers(5);

        // Modify c1
        c1.radius = 9;

        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius +
                ") and number of Circle objects (" + c2.numberOfObjects + ")");




    }
}
