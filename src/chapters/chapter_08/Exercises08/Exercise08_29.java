package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row and column size of the matrix: ");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] m1 = getAMatrixFromUser(row, col);
        int[][] m2 = getAMatrixFromUser(row, col);

        System.out.print("The two arrays are" + ((equals(m1, m2) ? " " : " not ")) + "identical");


    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int count;
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                count = 0;
                for (int r = 0; r < m1.length; r++) {
                    for (int c = 0; c < m1[r].length; c++) {
                        if (m1[row][col] == m1[r][c]) {// Searching for that number
                            count++;// It'll increase the count when it finds the number in m1
                        }
                    }
                }
                for (int r = 0; r < m1.length; r++) {
                    for (int c = 0; c < m1[r].length; c++) {
                        if (m1[row][col] == m2[r][c]) {
                            count--;// It'll decrease the count when it finds the number in m2
                        }
                    }
                }
                if (count != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] getAMatrixFromUser(int row, int col) {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[row][col];

        System.out.println("Enter the matrix:");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                m[r][c] = input.nextInt();
            }
        }
        return m;
    }
}
