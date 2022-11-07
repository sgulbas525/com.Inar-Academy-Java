package chapters.chapter_11.Listings11;

public class Listing11_04_TestCircleRectangle {
    public static void main(String[] args) {
        Listing11_02_CircleFromSimpleGeometricObject circle =
                new Listing11_02_CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Listing11_03_RectangleFromSimpleGeometricObject rectangle =
                new Listing11_03_RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

    }
}
