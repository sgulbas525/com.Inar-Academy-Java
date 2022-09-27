package chapters.chapter_07.Checkpoints07;

public class Checkpoint07_01_02_04_05_06_07 {
    public static void main(String[] args) {


        //Checkpoint07_01
        /**
         * Declaring an array :  int[] array ;
         * Creating an array : array = new int[10];
         */


        //Checkpoint07_02
        /** The memory is allocated when an array is created. */


        //Checkpoint07_03
        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println("The size of numbers is " + numbers.length);

        //Checkpoint07_04
        /**
         * Every element in an array has the same type.---------------------------------> TRUE
         * The array size is fixed after an array reference variable is declared.-------> FALSE
         * The array size is fixed after it is created.---------------------------------> TRUE
         * The elements in an array must be a primitive data type.----------------------> FALSE
         */


        //Checkpoint07_05
        /**
         * int i = new int(30);--------------> INVALID
         * double d[] = new double[30];------> VALID
         * char[] r = new char(1..30);-------> INVALID
         * int i[] = (3, 4, 3, 2);-----------> INVALID
         * float f[] = {2.3, 4.5, 6.6};------> VALID
         * char[] c = new char();------------> INVALID
         */

        //Checkpoint07_06
        /** The array elements are accessed through the index.
         * Array indices are based on 0: that is, they range from 0 to array.length - 1
         */


        //Checkpoint07_07
        /** The array index type is int and the lowest index is 0.
         * Can access the third element in an array via array[2];
         */

    }
}
