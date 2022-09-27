package chapters.chapter_06.Checkpoints06;

public class Checkpoint06_15_16_17 {
    //Checkpoint06_15


    //Checkpoint06_16

    /**
     * public static void  method(int x){
     * }
     * <p>
     * public static int method(int y){
     * return y;
     * }
     * <p>
     * In these codes you just change the return value type to trying overload the method.
     * Changing return value types doesn't make the method overloaded.
     */
    public static void main(String[] args) {

        double z = m(4, 5);
        double x = m(4, 5.5);
        double c = m(4.5, 5.4);

        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
    }

    public static double m(double x, double y) {
        return x;
    }

    public static double m(int x, double y) {
        return y;
    }
}