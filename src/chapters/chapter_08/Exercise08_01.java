package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        double[][] matrix = getFromUser();
        findSumsOfColumns(matrix);
    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void findSumsOfColumns(double[][] matrix) {
        // We keep the column
        for (int column = 0; column < matrix[0].length; column++) {
            double sum = 0;
            // we change the row in each iteration while we are keeping column
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }
            displaySumOfColumn(column, sum);
        }
    }

    public static void displaySumOfColumn(int column, double sum) {
        System.out.println("Sum of the elements at column " + column + " is " + sum);
    }


}
