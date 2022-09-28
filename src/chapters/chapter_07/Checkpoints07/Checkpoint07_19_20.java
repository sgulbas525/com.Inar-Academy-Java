package chapters.chapter_07.Checkpoints07;

import static chapters.chapter_07.Listings07.Listing07_05_VarArgsDemo.printMax;

public class Checkpoint07_19_20 {
    public static void main(String[] args) {

        //Checkpoint07_19
        /**
         * public static void print(String... strings, double... numbers)
               -- FALSE because only one variable-length parameter list may be specified in a method
         * public static void print(double... numbers, String name)
               -- FALSE because the variable-length parameter list must be the last in the method's parameter list
         * public static double... print(double d1, double d2)
               -- FALSE because return type can't be a variable-length parameter list
         */



        //Checkpoint07_20
        printMax(1, 2, 2, 1, 4);
        printMax(new double[]{1, 2, 3});
        //printMax(new int[]{1, 2, 3}); You can't invoke this one because our method's parameter list takes double

    }
}
