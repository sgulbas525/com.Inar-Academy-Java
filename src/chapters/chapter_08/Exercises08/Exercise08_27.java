package chapters.chapter_08.Exercises08;

import java.util.Scanner;

import static chapters.chapter_08.Exercises08.Exercise08_26.displayArray;

public class Exercise08_27 {
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

        sortColumns(matrix);

        displayArray(matrix);
    }

    public static void sortColumns(double[][] matrix) {
        double temp;

        // Selection sort
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length - 1; row++) {
                for (int r = row + 1; r < matrix[col].length; r++) {
                    temp = matrix[row][col];
                    if (temp > matrix[r][col]) { // If the next number is greater, exchange them
                        matrix[row][col] = matrix[r][col];
                        matrix[r][col] = temp;
                    }
                }
            }
        }
    }
}



