package chapters.chapter_10.Checkpoints10;

public class Checkpoint10_12_13 {
    public static void main(String[] args) {

        // Checkpoint10_12

        /*
       Converting primitive type into a wrapper class is boxing and the reverse of that process is unboxing.
       The compiler will automatically box a primitive value,that needs as an object and
       automatically unbox a reference value, that needs as a primitive value.
         */
        Integer x = 3 + new Integer(5);
        Integer y = 3;
        //Double z = 3; we need to assign a float-point value for autoboxing
        Double a = 3.0;
        int b = new Integer(3);
        int c = new Integer(3) + new Integer(4);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);

        System.out.println();



        // Checkpoint10_13

        Double q = 3.5;
        System.out.println(q.intValue());
        System.out.println(q.compareTo(4.5));

    }
}
