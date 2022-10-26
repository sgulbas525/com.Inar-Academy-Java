package chapters.chapter_08.Exercises08;

import static chapters.chapter_08.Exercises08.Exercise08_10.displayMatrix;

public class Exercise08_22 {
    public static void main(String[] args) {
        int[][] matrix = generateAMatrix();
        displayMatrix(matrix);

        checkRows(matrix);
        checkColumns(matrix);
    }

    public static int[][] generateAMatrix() {
        int[][] m = new int[6][6];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 2);
            }
        }
        return m;
    }

    public static void checkRows(int[][] matrix) {
        // In the case of any row that has even 1
        boolean isFirst = true;
        int count;
        // Counts 1s in each row if its even printed
        for (int row = 0; row < matrix.length; row++) {
            count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0 && count != 0) {
                if (isFirst) {
                    System.out.print("The rows that have even 1's: " + row);
                    isFirst = false;
                } else
                    System.out.print(", " + row);
            }
        }
        // In the case of any row that has even 1
        if (isFirst) {
            System.out.print("There isn't any row that has even 1's!");
        } else {
            System.out.println();
        }
    }

    public static void checkColumns(int[][] matrix) {
        // In the case of any column that has even 1
        boolean isFirst = true;
        int count;
        // Counts 1s in each column if its even printed
        for (int col = 0; col < matrix.length; col++) {
            count = 0;
            for (int row = 0; row < matrix[col].length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0 && count != 0) {
                if (isFirst) {
                    System.out.print("The columns that have even 1's: " + col);
                    isFirst = false;
                } else
                    System.out.print(", " + col);
            }
        }
        // In the case of any column that has even 1
        if (isFirst) {
            System.out.print("There isn't any column that has even 1's!");
        } else {
            System.out.println();
        }
    }
}

