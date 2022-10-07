package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_19 {
    public static void main(String[] args) {

        int[][] matrix = getaMatrixFromUser();

        System.out.print("Matrix has" + ((isConsecutiveFour(matrix)) ? "" : " not") +
                " consecutive four numbers");
    }

    public static int[][] getaMatrixFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row and column length for matrix: ");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Fill the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean isConsecutiveFour(int[][] matrix) {
        return (isConsecutiveFourAtRows(matrix) ||
                isConsecutiveFourAtColumns(matrix) ||
                isConsecutiveFourAtRightDiagonal(matrix) ||
                isConsecutiveFourAtLeftDiagonal(matrix));
    }

    public static boolean isConsecutiveFourAtRows(int[][] matrix) {
        int count;
        for (int row = 0; row < matrix.length; row++) {
            count = 1;
            for (int col = 0; col < matrix[row].length - 1; col++) {
                if (matrix[row][col] == matrix[row][col + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtColumns(int[][] matrix) {
        int count;
        for (int col = 0; col < matrix[0].length; col++) {
            count = 1;
            for (int row = 0; row < matrix.length - 1; row++) {
                if (matrix[row][col] == matrix[row + 1][col]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    // I hope you may understand, if you won't try it on a matrix
    public static boolean isConsecutiveFourAtRightDiagonal(int[][] matrix) {
        int count;
        for (int startsPoint = matrix.length - 4; startsPoint > 0; startsPoint--) {
            count = 1;
            for (int col = 0, row = startsPoint; row < matrix.length - 1; col++, row++) {
                if (matrix[row][col] == matrix[row + 1][col + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        for (int startPoint = 0; startPoint <= matrix.length - 4; startPoint++) {
            count = 1;
            for (int row = 0, col = startPoint; col < matrix.length - 1; row++, col++) {
                if (matrix[row][col] == matrix[row + 1][col + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    // I hope you may understand, if you won't try it on a matrix
    public static boolean isConsecutiveFourAtLeftDiagonal(int[][] matrix) {
        int count;

        for (int startsPoint = matrix.length - 4; startsPoint > 0; startsPoint--) {
            count = 1;
            for (int row = startsPoint, col = matrix[startsPoint].length - 1; row < matrix.length - 1; row++, col--) {
                if (matrix[row][col] == matrix[row + 1][col - 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        for (int startPoint = matrix[1].length - 1; startPoint >= matrix[1].length - 4; startPoint--) {
            count = 1;
            for (int row = 0, col = startPoint; row < matrix.length - row - 1 ; row++, col--) {
                if (matrix[row][col] == matrix[row + 1][col - 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
