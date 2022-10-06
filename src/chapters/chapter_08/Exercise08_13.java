package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int col = input.nextInt();

        double[][] matrix = getTheMatrixFromUser(row, col);

        int[] locationOfTheGreatestElementInMatrix = locationOfLargest(matrix);

        displayLocation(locationOfTheGreatestElementInMatrix);
    }

    public static double[][] getTheMatrixFromUser(int row, int col) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[row][col];

        System.out.println("Enter the array: ");

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                matrix[r][c] = input.nextDouble();
            }
        }
        return matrix;
    }


    public static int[] locationOfLargest(double[][] matrix) {
        int[] loc = new int[2];

        int row = 0, col = 0;// Starts with assume
        loc[0] = row;
        loc[1] = col;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                // Assign the location of the greater one
                if (matrix[r][c] > matrix[row][col]) {
                    row = r;
                    col = c;
                }
            }
        }
        // Assign the greatest numbers location to our array
        loc[0] = row;
        loc[1] = col;

        return loc;
    }
        public static void displayLocation ( int[] locationOfTheGreatestElementInMatrix){
            System.out.println("The location of the largest element is ("
                    + locationOfTheGreatestElementInMatrix[0] +
                    ", " + locationOfTheGreatestElementInMatrix[1] + ")");
        }
    }
