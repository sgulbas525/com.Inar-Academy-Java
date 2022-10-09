package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row and column size of the matrix: ");
        int row = input.nextInt();
        int col = input.nextInt();

         int[][] m1 = getAMatrixFromUser(row, col);
         int[][] m2 = getAMatrixFromUser(row, col);

        System.out.print("The two arrays are" + ((equals(m1, m2) ? " " : " not ")) + "strictly identical");
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int r = 0; r < m1.length; r++) {
            for (int c = 0; c < m1[r].length; c++) {
                if (m1[r][c] != m2[r][c]){// If the numbers if indexes isn't same it isn't same identical
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] getAMatrixFromUser(int row, int col) {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[row][col];

        System.out.print("Enter the matrix:");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                m[r][c] = input.nextInt();
            }
        }
        return m;
    }
}
