package chapters.chapter_09.Listings09;

public class Listing09_11_TotalArea {
    /* Main method */
    public static void main(String[] args) {
        // Declare circleArray
        Listing09_08_CircleWithPrivateDataFields[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /* Create an array of the Circle objects */
    public static Listing09_08_CircleWithPrivateDataFields[] createCircleArray() {
        Listing09_08_CircleWithPrivateDataFields[] circleArray =
                new Listing09_08_CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] =
                    new Listing09_08_CircleWithPrivateDataFields(Math.random() * 100);
        }

        // Return Circle array
        return circleArray;
    }

    /* Print an array of circles and their total areas */
    public static void printCircleArray(Listing09_08_CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("—————————————————————————————————————————-");

        // Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total area of circles is",
                sum(circleArray));
    }

    /* Add circle ares */
    public static double sum(Listing09_08_CircleWithPrivateDataFields[] circleArray) {
    // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }


}
