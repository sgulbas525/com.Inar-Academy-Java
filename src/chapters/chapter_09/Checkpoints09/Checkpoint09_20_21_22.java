package chapters.chapter_09.Checkpoints09;

public class Checkpoint09_20_21_22 {
    public static void main(String[] args) {

        // Checkpoint09_21
        /*
        Accessor(Setter) : The method that we use for reach/get the private data field
        Mutator(Getter)  : The method that we use for changing the value of the private data field
         */





        // Checkpoint09_21
        /* To prevent data from being tampered and to make class easy to maintain,
         are the benefits of data field encapsulation.
         */





        // Checkpoint09_22
        /* public class Circle {
             private double radius = 1;
             // Find the area of this circle
             public double getArea() {
                 return radius * radius * Math.PI;
             }
             public static void main(String[] args) {
                 Circle myCircle = new Circle();
                 System.out.println("Radius is " + myCircle.radius);
             }
           }You cannot reach radius with the dot operator since it defined private,
            have to you the accessor/mutator methods
            */

    }
}
