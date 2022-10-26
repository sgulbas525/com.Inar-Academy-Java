package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_02 {
    public static void main(String[] args) {
        double[][] matrix = getTheMatrixFromTheUser();
        double sumOfMajorDiagonal = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is " + sumOfMajorDiagonal);
    }

    public static double sumMajorDiagonal(double[][] matrix) {
       /* 1 1 1 1
          2 2 2 2
          3 3 3 3
          4 4 4 4
        Major diagonal is from top-left to bottom-right--->   1 2 3 4 */
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];// for i =0: [0][0], =1: [1][1], =2: [2][2], =3 [3][3]
        }
    return sum;
    }

    public static double[][] getTheMatrixFromTheUser() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
