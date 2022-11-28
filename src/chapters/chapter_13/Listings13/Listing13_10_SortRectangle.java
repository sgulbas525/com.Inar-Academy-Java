package chapters.chapter_13.Listings13;

public class Listing13_10_SortRectangle {
    public static void main(String[] args) {
        Listing13_09_ComparableRectangle[] rectangles = {
                new Listing13_09_ComparableRectangle(3.4, 5.4),
                new Listing13_09_ComparableRectangle(13.24, 55.4),
                new Listing13_09_ComparableRectangle(7.4, 35.4),
                new Listing13_09_ComparableRectangle(1.4, 15.4),};

        java.util.Arrays.sort(rectangles);
        for (Listing13_03_Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}
