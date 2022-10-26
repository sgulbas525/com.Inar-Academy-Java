package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_35 {
    public static void main(String[] args) {

        int[][] matrix = createRandomMatrix();


        int[] maximumSquareMatrixStartIndex = findMaximumSquareMatrix(matrix);

        if (maximumSquareMatrixStartIndex[2] > 1) {
            System.out.println("The maximum square sub-matrix is at (" + maximumSquareMatrixStartIndex[0] +
                    ", " + maximumSquareMatrixStartIndex[1] + ") with size " + maximumSquareMatrixStartIndex[2]);
        } else {
            System.out.println("There is no square matrix.");
        }
    }

    public static int[][] createRandomMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int s = input.nextInt();
        int[][] result = new int[s][s];
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                result[i][j] = input.nextInt();
            }
        }
        return result;
    }

    public static int[] findMaximumSquareMatrix(int[][] matrix) {
        int[] result = new int[3];
        int size = 2;// A squares min size is 2
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               // Controls for each point
                while(isSquareMatrix(matrix, i, j, size)) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = size;
                    size++;
                }
            }
        }
        return result;
    }

    public static boolean isSquareMatrix(int[][] matrix, int row, int column, int count) {
        if(column + count > matrix[row].length) {
            return false;
        }

        if(row + count > matrix.length) {
            return false;
        }

        for (int i = row; i < row + count; i++) {
            for (int j = column; j < column + count; j++) {
                if(matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}