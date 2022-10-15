package weeks.week_10;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = getFromUser();
        fill2DArrWithRandomValues(matrix, 0, 100);
        TwoDimensionalArray.printArr(matrix);

    }

    public static int[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row and col length: ");
        int row = input.nextInt();
        int col = input.nextInt();

        return new int[row][col];
    }

    public static void fill2DArrWithRandomValues(int[][] arr, int start, int limit) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (start + (Math.random() * (limit - start)));
            }
        }
    }

    public static void printArr(int[][] arr) {
        System.out.println("-----------------");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf(" [%3d] ", arr[row][col]);
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}