package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_28_29 {

    // Checkpoint11_28
    /*
    Every class has toString() and equals() methods because these are defined in Object class.
    They came from the Object class.
    The subclasses usually override these methods to provide specific information that class needs
     */


    // Checkpoint11_29
    public static void main(String[] args) {
        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));
    }
    static class Circle {
        double radius;
        public boolean equals(Circle circle) {
            return this.radius == circle.radius;
        }
    }

    static class Circle1 {
        double radius;
        public boolean equals(Object circle) {
            return this.radius ==
                    ((Circle1)circle).radius;
        }
    }
}