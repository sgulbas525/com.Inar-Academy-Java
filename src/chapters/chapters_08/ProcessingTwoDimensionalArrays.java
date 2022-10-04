package chapters.chapters_08;

import java.util.Scanner;

public class ProcessingTwoDimensionalArrays {


    public static int[][] iInitializingArraysWithInputValues(int n) {
        int[][] matrix = new int[n][n];

        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }


    public static int[][] initializingArraysWithRandomValues(int n) {
        int[][] matrix = new int[n][n];


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }


    public static void printArray(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int sumAllElements(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void sumAllElementsByColumn(int[][] matrix) {
        int sum;
        for (int column = 0; column < matrix[0].length; column++) {
            sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }
            System.out.println("Sum for column " + column + " is " + sum);
        }
    }

    public static void largestRow(int[][] matrix) {
        int maxRow = 0;
        int indexOfMaxRow = 0;

        // Get sum of the first row
        for (int column = 0; column < matrix[indexOfMaxRow].length; column++) {
            maxRow += matrix[indexOfMaxRow][column];
        }

        for (int row = 0; row < matrix[row].length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow += matrix[row][column];
            }

            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }

    public static void randomShuffling(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int)(Math.random() * matrix.length);// Random row
                int j1 = (int)(Math.random() * matrix[i].length);// Random column

                // Swap matrix[i][j] with matrix[i1][j1]

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
}







    }
