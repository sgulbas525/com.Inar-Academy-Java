package chapters.chapters_08.Listings08;

import java.util.Scanner;

public class Listing08_04_CheckSudokuSolution {
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


    // Check whether a solution is valid
    public static boolean isValid(int[][] grid) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid)) {
                    return false;
                }
            }
        }
        return true;// The solution is valid
    }


    // Check whether grid[i][j] is valid in the grid
    public static boolean isValid(int i, int j, int[][] grid) {
        // Check whether grid[i][j] is unique in i's row
        for (int column = 0; column < 9 ; column++) {
            if (column != j && grid[i][column] == grid[i][j]){
                return false;
            }
        }

        // Check whether grid[i][j] is unique in j's column
        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j]){
                return false;
            }
        }

        // Check whether grid[i][j] is unique in the 3-by-3 box
        for (int row = (i / 3) * 3; row < (i / 3) / 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3 ) * 3 + 3; col++) {
                if (row != i && col != j && grid[row][col] == grid[i][j]){
                    return false;
                }
            }
        }

        return true;// The current value at grid[i][j] is valid


    }

}
