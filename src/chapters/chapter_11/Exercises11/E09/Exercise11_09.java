package chapters.chapter_11.Exercises11.E09;

import java.util.ArrayList;
import java.util.Scanner;

import static chapters.chapter_08.Exercises08.Exercise08_10.displayMatrix;

public class Exercise11_09 {
    public static void main(String[] args) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();

        int[][] matrix = fillRandomly();
        displayMatrix(matrix);

        findRows(rows, matrix);
        findCols(cols, matrix);

        display(rows, cols);
    }

    public static int[][] fillRandomly() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                matrix[r][c] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void findRows(ArrayList<Integer> rows, int[][] matrix) {
        int maxCount = findTheMaxCountInRows(matrix);
        int count;
        for (int row = 0; row < matrix.length; row++) {
            count = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count == maxCount) {
                rows.add(row);
            }
        }
    }

    public static void findCols(ArrayList<Integer> cols, int[][] matrix) {
        int maxCount = findTheMaxCountInColumns(matrix);
        int count;
        for (int col = 0; col < matrix.length; col++) {
            count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count == maxCount) {
                cols.add(col);
            }
        }


    }

    public static int findTheMaxCountInRows(int[][] matrix) {
        int count;
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            count = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }


    public static int findTheMaxCountInColumns(int[][] matrix) {
        int count;
        int max = Integer.MIN_VALUE;
        for (int col = 0; col < matrix.length; col++) {
            count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void display(ArrayList<Integer> rows, ArrayList<Integer> cols) {
        if (rows.isEmpty()) {
            System.out.println("There aren't any 1's in any row");
        } else {
            System.out.print("The largest row index: ");
            for (int i = 0; i < rows.size(); i++) {
                System.out.print(rows.get(i));
            }
            System.out.println();
        }


        if (cols.isEmpty()) {
            System.out.println("There aren't any 1's in any column");
        } else {
            System.out.print("The largest column index: ");
            for (int i = 0; i < cols.size(); i++) {
                System.out.print(cols.get(i));
            }
            System.out.println();
        }
    }
}
