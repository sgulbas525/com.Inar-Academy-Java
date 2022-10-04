package chapters.chapter_08.Checkpoints08;

public class Checkpoint08_08_09_10 {
    public static void main(String[] args) {


        // Checkpoint08_08

        int[][][] m;// Declaration of a three-dimensional array
        m = new int[4][5][6];// Creation of a three-dimensional array


        // Checkpoint08_09

        int[][][] x = new int[12][5][2];
        System.out.println("Number of elements in array x is: " +
                (x.length * x[1].length * x[1][1].length));

        System.out.println("x's length is: " + x.length);
        System.out.println("x[2]'s length is: " + x[2].length);
        System.out.println("x[0][0]'s length is: " + x[0][0].length);


        // Checkpoint08_10

        int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println(array[0][0][0]);
        System.out.println(array[1][1][1]);
    }
}
