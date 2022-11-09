package chapters.chapter_11.Listings11;

public class Listing11_07_CastingDemo {
    /* Main method */
    public static void main(String[] args) {
        // Create and initialize two objects
        Object object1 = new Listing11_02_CircleFromSimpleGeometricObject(1);
        Object object2 = new Listing11_03_RectangleFromSimpleGeometricObject(1, 1);

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    /* A method for displaying an object */
    public static void displayObject(Object object) {
   if (object instanceof Listing11_02_CircleFromSimpleGeometricObject){
       System.out.println("The circle area is "  +
               ((Listing11_02_CircleFromSimpleGeometricObject) object).getArea());
       System.out.println("The circle diameter is " +
               ((Listing11_02_CircleFromSimpleGeometricObject) object).getDiameter());
   }
   if (object instanceof Listing11_03_RectangleFromSimpleGeometricObject){
       System.out.println("The rectangle area is " +
               ((Listing11_03_RectangleFromSimpleGeometricObject) object).getArea());
   }
    }
}
