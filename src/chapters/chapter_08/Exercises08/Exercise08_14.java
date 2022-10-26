package chapters.chapter_08.Exercises08;

import java.util.Scanner;

import static chapters.chapter_08.Exercises08.Exercise08_10.displayMatrix;

public class Exercise08_14 {
    public static void main(String[] args) {
        int sizeOfMatrix = getFromUser();

        int[][] matrix = createAMatrix(sizeOfMatrix);
        displayMatrix(matrix);

        checkRowsForZerosAndOnes(matrix);
        checkColsForZerosAndOnes(matrix);

        checkMajorDiagonalForZerosAndOnes(matrix);
        checkSubDiagonalForZerosAndOnes(matrix);


    }

    public static int getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        return size;
    }

    public static int[][] createAMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void checkColsForZerosAndOnes(int[][] matrix) {
        int[][] check = new int[4][2];
        fill(check, -1);
        int indexForOnes = -1;
        int indexForZeros = -1;

        boolean countZero;
        boolean countOne;

        for (int col = 0; col < matrix.length; col++) {
            countZero = true;
            countOne = true;

            for (int row = 0; row < matrix[col].length; row++) {
                // If it's 1, that is impossible to being 0's int that all column
                if (matrix[row][col] == 1) {
                    countZero = false;
                }  // If it's 0, that is impossible to being 1's in that all column
                else {
                    countOne = false;
                }
            }

            if (countOne) {
                indexForOnes++;
                check[indexForOnes][1] = col;
            }
            if (countZero) {
                indexForZeros++;
                check[indexForZeros][0] = col;
            }
        }
        // If indexForOnes or indexForZero is different from default value it means that some columns are 0 / 1
        if (indexForOnes != -1) {
            System.out.print("\nAll 1s on column ");
            for (int i = 0; i < check.length; i++) {
                if (check[i][1] != -1) {
                    System.out.print(check[i][1] + ", ");
                }
            }
        } else if (indexForZeros != -1) {
            System.out.print("\nAll 0s on column ");
            for (int i = 0; i < check.length; i++) {
                if (check[i][0] != -1) {
                    System.out.print(check[i][0] + ", ");
                }
            }
        } else {
            System.out.println("\nNo same numbers on a column");
        }
    }


    public static void checkRowsForZerosAndOnes(int[][] matrix) {
        int[][] check = new int[4][2];
        fill(check, -1);
        int indexForOnes = -1;
        int indexForZeros = -1;

        boolean countZero;
        boolean countOne;

        for (int row = 0; row < matrix.length; row++) {
            countZero = true;
            countOne = true;

            for (int col = 0; col < matrix[row].length; col++) {
                // If it's 1, that is impossible to being 0's int that all row
                if (matrix[row][col] == 1) {
                    countZero = false;
                }  // If it's 0, that is impossible to being 1's int that all row
                else {
                    countOne = false;
                }
            }

            if (countOne) {
                indexForOnes++;
                check[indexForOnes][1] = row;
            }
            if (countZero) {
                indexForZeros++;
                check[indexForZeros][0] = row;
            }
        }

        // If indexForOnes or indexForZero is different from default value it means that some rows are 0 / 1
        if (indexForOnes != -1) {
            System.out.print("\nAll 1s on row ");
            for (int i = 0; i < check.length; i++) {
                if (check[i][1] != -1) {
                    System.out.print(check[i][1] + ", ");
                }
            }
        } else if (indexForZeros != -1) {
            System.out.print("\nAll 0s on row ");
            for (int i = 0; i < check.length; i++) {
                if (check[i][0] != -1) {
                    System.out.print(check[i][0] + ", ");
                }
            }
        } else {
            System.out.print("\nNo same numbers on a row");
        }
    }

    public static void checkMajorDiagonalForZerosAndOnes(int[][] matrix) {
        boolean isOne = true;
        boolean isZero = true;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 1) {// If it's 1, that is impossible to being 0's in major diagonal
                isZero = false;
            } else {// If it's 0, that is impossible to being 1's in major diagonal
                isOne = false;
            }
        }
        if (isOne) {
            System.out.println("All 1s on the major diagonal");
        } else if (isZero) {
            System.out.println("All 0s on the major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }

    }


    public static void checkSubDiagonalForZerosAndOnes(int[][] matrix) {
        boolean isOne = true;
        boolean isZero = true;

        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            if (matrix[i][i] == 1) {// If it's 1, that is impossible to being 0's in sub diagonal
                isZero = false;
            } else {// If it's 0, that is impossible to being 1's in sub diagonal
                isOne = false;
            }
        }
        if (isOne) {
            System.out.println("All 1s on the sub diagonal");
        } else if (isZero) {
            System.out.println("All 0s on the sub diagonal");
        } else {
            System.out.println("No same numbers on the sub diagonal");
        }
    }


    public static void fill(int[][] check, int i) {
        for (int j = 0; j < check.length; j++) {
            for (int k = 0; k < check[j].length; k++) {
                check[j][k] = i;
            }
        }
    }
}
