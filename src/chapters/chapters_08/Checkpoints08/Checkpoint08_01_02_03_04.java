package chapters.chapters_08.Checkpoints08;

import chapters.chapters_08.ProcessingTwoDimensionalArrays;

public class Checkpoint08_01_02_03_04 {
    public static void main(String[] args) {

        //Checkpoint08_01

        int[][] matrix;// Declaration of two-dimensional array
        matrix = new int[4][5];// Creating of two-dimensional array



        //Checkpoint08_02

        /* Yes, the rows can have different lengths.
        Because each row, in the two-dimensional array, is a different array
         */



        //Checkpoint08_03

        int[][] array = new int[2][];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);




        // Checkpoint08_04

        // int[][] r = new int[2]; ------> Invalid, should be ---> int[][] r = new int[2][];
        //int[] x = new int[]; ----------> Invalid, should be ---> int[] x = new int[3]
        int[][] y = new int[3][]; // ----> Valid
        int[][] z = {{1, 2}};// ---------> Valid
        int[][] m = {{1, 2}, {2, 3}};// -> Valid
        int[][] n = {{1, 2}, {2, 3}, };//> Valid

    }
}
