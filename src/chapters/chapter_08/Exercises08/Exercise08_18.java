package chapters.chapter_08.Exercises08;

public class Exercise08_18 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        displayMatrix(matrix);

        shuffleMatrix(matrix);
        displayMatrix(matrix);
    }

    public static void shuffleMatrix(int[][] matrix) {
        int[] temp ;
        int n;

        for (int i = 0; i < matrix.length; i++) {
            n = (int) (Math.random() * matrix.length);
            temp = matrix[i];
            matrix[i] = matrix[n];
            matrix[n] = temp;
        }

    }

    public static void displayMatrix(int[][] matrix) {
        System.out.print("{");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{" + matrix[i][0] + ", " + matrix[i][1] + "}");
            System.out.print((i == matrix.length - 1) ? "}" : ", ");
        }
        System.out.println();
    }
}


