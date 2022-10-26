package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        double[][] matrix1 = getMatrixFromUser();
        double[][] matrix2 = getMatrixFromUser();

        double[][] matrixResult = sumMatrix(matrix1, matrix2);

        displayTheProcess(matrix1, matrix2, matrixResult);
    }


    public static double[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    // c[i][j] = a[i][j] + b[i][j]
    public static double[][] sumMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[3][3];
        for (int row = 0; row < matrixResult.length; row++) {
            for (int col = 0; col < matrixResult[row].length; col++) {
                matrixResult[row][col] = (matrix1[row][col] + matrix2[row][col]);
            }
        }
        return matrixResult;

    }


    public static void displayTheProcess(double[][] matrix1, double[][] matrix2, double[][] matrixResult) {
        for (int row = 0; row < matrix1.length; row++) {

            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.printf("%-3.1f ", matrix1[row][col]);
            }

            if (row == 1) {
                System.out.printf("%5s", "  +  ");
            } else {
                System.out.printf("%5s", " ");
            }

            for (int col = 0; col < matrix2[row].length; col++) {
                System.out.printf("%-3.1f ", matrix2[row][col]);
            }

            if (row == 1) {
                System.out.printf("%5s", "  =  ");
            } else {
                System.out.printf("%5s", " ");
            }

            for (int col = 0; col < matrix2[row].length; col++) {
                System.out.printf("%-3.1f ", matrixResult[row][col]);
            }
            System.out.println();
        }
    }
}