package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix size's row and column: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = new double[row][column];
        System.out.println("Enter a " + row + "-by-" + column + " matrix row by row: ");

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                matrix[r][c] = input.nextDouble();
            }
        }

        System.out.println("It's " + ((isMarkovMatrix(matrix, row, column)) ? "" : "not ") + "Markov matrix.");
    }


    public static boolean isMarkovMatrix(double[][] m, int row, int column) {

        double sumColumn;

        // Checks rows whether there is negative number
        for (int r = 0; r < row; r++) {
            for (int col = 0; col < column; col++) {
                if (m[r][col] < 0) { // take 0 as a positive number
                    return false;
                }
            }
        }

        // Checks columns whether there is negative number and rows sum is different from 1
        for (int col = 0; col < column; col++) {
            sumColumn = 0;
            for (int r = 0; r < row; r++) {
                if (m[r][col] >= 0) { // take 0 as a positive number
                    sumColumn += m[r][col];
                } else {
                    return false;
                }
            }
            if (sumColumn != 1) {
                return false;
            }
        }
        return true;
    }
}
