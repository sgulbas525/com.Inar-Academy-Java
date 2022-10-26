package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_26 {
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

        sortRows(matrix);

        displayArray(matrix);
    }

    public static void sortRows(double[][] matrix) {
        double temp;

        // Selection sort
        for (int row = 0; row < matrix .length; row++) {
            for (int col = 0; col < matrix[row].length -1; col++) {
                for (int c = col + 1; c < matrix[row].length; c++) {
                    temp = matrix[row][col];
                    if (temp > matrix[row][c]){ // If the next number is greater, exchange them
                        matrix[row][col] = matrix[row][c];
                        matrix[row][c] = temp;
                    }
                }
            }
        }
    }

    public static void displayArray(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%-8.1f", matrix[row][col]);
            }
            System.out.println();
        }
    }
    }
