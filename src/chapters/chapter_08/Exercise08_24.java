package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_24 {
    public static void main(String[] args) {
        // Read sudoku solution
        int[][] grid = readSolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }


    // Read a Sudoku solution from the console

    public static int[][] readSolution() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution: ");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }


    public static boolean isValid(int[][] grid) {
        boolean[] rowsNumber;
        boolean[] colsNumber;

        for (int rowAndCol = 0; rowAndCol < grid.length; rowAndCol++) {
           // The number - 1 indexes are made true, if a number absence it'll stay false
            rowsNumber = new boolean[9];
            for (int col = 0; col < grid[rowAndCol].length; col++) {
                rowsNumber[grid[rowAndCol][col] - 1] = true;
            }

            colsNumber = new boolean[9];
            for (int row = 0; row < grid.length; row++) {
                // The number - 1 indexes are made true, if a number absence it'll stay false
                colsNumber[grid[row][rowAndCol] - 1] = true;
            }

            if (!isValid(rowsNumber) || !isValid(colsNumber)) {
                return false;
            }
        }
        // For small boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!examineSmallBox(grid, i, j))
                    return false;
            }
        }
        return true;
    }

    public static boolean isValid(boolean[] number) {
        // If here is an absence number it'll return false
        for (int i = 0; i < number.length; i++) {
            if (!number[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean examineSmallBox(int[][] grid, int i, int j) {
        boolean[] box = new boolean[9];
        int iLimit = i + 3;
        int jLimit = j + 3;
        for (int elem = 0, row = i; row < iLimit; row++) {
            // The number - 1 indexes are made true, if a number absence it'll stay false
            for (int col = j; col < jLimit; col++, elem++) {
                box[grid[row][col] - 1] = true;
            }
        }
        // If here is an absence number it'll return false
        for (int k = 0; k < box.length; k++) {
            if (!box[k]) {
                return false;
            }
        }
        return true;

    }

}
