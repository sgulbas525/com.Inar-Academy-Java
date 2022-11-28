package chapters.chapter_13.Checkpoints13;

public class Checkpoints13_04_05_06_07_08 {
    public static void main(String[] args) {

        // Checkpoint13_04
    /*
    While running jvm tries to cast numberOfRef into Double;
     but it isn't double, it's an Integer
     */


        // Checkpoint13_05
    /*
    numberArray keeps Integers, so it'll cause an error at the runtime.
     */


        // Checkpoint13_06
        {
            System.out.println("Checkpoint13_06");
            Number x = 3;
            System.out.println(x.intValue());
            System.out.println(x.doubleValue());
            System.out.println("-------------------");
        }


        // Checkpoint13_07
        /*
            Number x = new Integer(3);
            System.out.println(x.intValue());
            System.out.println(x.compareTo(new Integer(4)));

            In the Number class there isn't any compareTo method.
        */



        // Checkpoint13_08
        /*
            Number x = new Integer(3);
            System.out.println(x.intValue());
            System.out.println((Integer)x.compareTo(new Integer(4)));

            There is a syntax error. Accessing operator is executed before casting.
        */
    }


    }