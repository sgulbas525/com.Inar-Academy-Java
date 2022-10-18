package chapters.chapter_09.Listings09;

public class Listing09_02_SimpleCircle {
    /* Main method */
    public static void main(String[] args) {
        // Create a circle with radius 1
        Listing09_02_SimpleCircle circle1 = new Listing09_02_SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius +
                " is " + circle1.getArea());

        // Create a circle with radius 25
        Listing09_02_SimpleCircle circle2 = new Listing09_02_SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius +
                " is " + circle2.getArea());

        // Create a circle with radius 125
        Listing09_02_SimpleCircle circle3 = new Listing09_02_SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius +
                " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100; // circle2.setRadius(100)
        System.out.println("The area of the circle of radius " + circle2.radius +
                " is " + circle2.getArea());

    }
    double radius;

    /* Construct a circle with radius 1 */
    Listing09_02_SimpleCircle(){
        radius = 1;
    }

    /* Construct a circle with a specified radius */
    Listing09_02_SimpleCircle(double newRadius){
        radius = newRadius;
    }

    /* Return the area of this circle */
    double getArea(){
        return radius * radius * Math.PI;
    }

    /* Return the perimeter of this circle */
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /* Set a new radius for this circle */
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
