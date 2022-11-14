package chapters.chapter_12.Listings12;

public class Listing12_08_TestCircleWithException {
    public static void main(String[] args) {
        try{
            Listing12_07_CircleWithException c1 =
                    new Listing12_07_CircleWithException(5);
            Listing12_07_CircleWithException c2 =
                    new Listing12_07_CircleWithException(-5);
            Listing12_07_CircleWithException c3 =
                    new Listing12_07_CircleWithException(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }

        System.out.println("number of objects created: " +
                Listing12_07_CircleWithException.getNumberOfObjects());
    }
}
