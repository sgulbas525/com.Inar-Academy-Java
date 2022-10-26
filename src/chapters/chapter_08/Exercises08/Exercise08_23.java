package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_23 {
    public static void main(String[] args) {
        int[][] matrix = getAMatrixFromUser();
        int[] flippedCell = findTheFlippedCell(matrix);
        System.out.println("The flipped cell is at (" + flippedCell[0] + ", " + flippedCell[1] + ")");

    }

    public static int[] findTheFlippedCell(int[][] matrix) {
        int[] flippedCell = new int[2];
        int count;

        // Finds the place of flipped cell's row
        for (int row = 0; row < matrix.length; row++) {
            count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                flippedCell[0] = row;
            }
        }


        // Finds the place of flipped cell's columns
        for (int col = 0; col < matrix[0].length; col++) {
            count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                flippedCell[1] = col;
            }
        }
        return flippedCell;
    }

    // We are taking the flipped form of matrix
    public static int[][] getAMatrixFromUser() {

        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        int n;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                n = input.nextInt();

                if (!(n == 0 || n == 1)) {
                    System.out.println("Invalid input, enter 0 or 1");
                    col--;
                    continue;
                }
                matrix[row][col] = n;
            }
        }
        return matrix;
    }

}
