package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_36 {
    public static void main(String[] args) {

        char[][] matrix = getMatrixFromUserForLatinSquare();
        displayLatinSquare(matrix);
    }

    public static void displayLatinSquare(char[][] matrix) {
       if(checkColumns(matrix) && checkRows(matrix)) {
           System.out.println("The input array is a Latin square.");
       }else {
           System.out.println("The input array is not a Latin square.");
       }
    }

    // Checks the characters occurrences in each column, if it's more than 1 in a column returns false
    public static boolean checkColumns(char[][] matrix) {
        boolean[] controlArr = new boolean[matrix.length];

        for (int col = 0; col < matrix.length; col++) {
            Arrays.fill(controlArr, false);
            for (int row = 0; row < matrix.length; row++) {
                if (controlArr[matrix[row][col] - 'A']){
                    return false;
                }
                controlArr[matrix[row][col] - 'A'] =true;
            }
        }
        return true;
    }


    // Checks the characters occurrences in each row, if it's more than 1 in a row returns false
    public static boolean checkRows(char[][] matrix) {
        boolean[] controlArr = new boolean[matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            Arrays.fill(controlArr, false);
            for (int col = 0; col < matrix.length; col++) {
                if (controlArr[matrix[row][col] - 'A']){
                    return false;
                }
                controlArr[matrix[row][col] - 'A'] =true;
            }
        }
        return true;
    }


    public static char[][] getMatrixFromUserForLatinSquare() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int size = input.nextInt();

        char[][] matrix = new char[size][size];

        System.out.println("Enter " + size + " rows of letters separated by spaces: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.next().charAt(0); // For taking the characters one by one
                // If it's not in the range of 'A' + size, returns false
                if (matrix[row][col] >= ('A' + matrix.length) || matrix[row][col] < 'A') {
                    System.out.println("Wrong input: the letters must be (UPPERCASE) from A to " + (char) ('A' + matrix.length));
                    System.exit(1);
                }
            }// If the input is non-case sensitive we can replace with line 65 input.next().toUppercase.charAt(0)
        }

        return matrix;
    }
}
