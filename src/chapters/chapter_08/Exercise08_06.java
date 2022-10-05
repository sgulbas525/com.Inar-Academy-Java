package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_06 {
    public static void main(String[] args) {
        double[][] matrix1 = getMatrixFromUser();
        double[][] matrix2 = getMatrixFromUser();

        double[][] matrixSum = multiplyMatrix(matrix1, matrix2);

        displayTheProcess(matrix1, matrix2, matrixSum);
    }

    // cij = a[i][1] * b[1][j] + a[i][2] * b[2][j] + ... + a[i][n] * b[n][j]
    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrixResult.length; row++) {
            for (int col = 0; col < matrixResult[row].length; col++) {
                matrixResult[row][col] = matrix1[row][0] * matrix2[0][col];
                matrixResult[row][col] += matrix1[row][1] * matrix2[1][col];
                matrixResult[row][col] += matrix1[row][2] * matrix2[2][col];
            }
        }

        return matrixResult;
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


    public static void displayTheProcess(double[][] matrix1, double[][] matrix2, double[][] matrixSum) {
        for (int row = 0; row < matrix1.length; row++) {

            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.printf("%-3.1f ", matrix1[row][col]);
            }

            if (row == 1) {
                System.out.printf("%5s", "  *  ");
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
                System.out.printf("%-3.1f ", matrixSum[row][col]);
            }
            System.out.println();
        }
    }
}
