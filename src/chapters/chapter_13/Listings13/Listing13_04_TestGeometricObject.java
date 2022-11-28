package chapters.chapter_13.Listings13;

public class Listing13_04_TestGeometricObject {
    // Main method
    public static void main(String[] args) {
        // Create two geometric objects
        Listing13_01_GeometricObject geoObject1 = new Listing13_02_Circle(5);
        Listing13_01_GeometricObject geoObject2 = new Listing13_03_Rectangle(5, 3);

        System.out.println("The two objects have the same area? " +
                equalArea(geoObject1, geoObject2));

        // Display Circle
        displayGeometricObject(geoObject1);

        // Display Rectangle
        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea
            (Listing13_01_GeometricObject geoObject1, Listing13_01_GeometricObject geoObject2) {
        return geoObject1.getArea() == geoObject2.getArea();
    }

    public static void displayGeometricObject(Listing13_01_GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }

}

