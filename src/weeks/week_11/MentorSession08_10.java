package weeks.week_11;

public class MentorSession08_10 {
    public static void main(String[] args) {
        int[][] matrix = getAMatrix();
        fillTheMatrix(matrix);

        int row = largestRow(matrix);
        int col = LargestCol(matrix);

        displayMatrix(matrix);

        System.out.println("The most 1's is in the row " + row);
        System.out.println("The most 1's is in the column " + col);
    }

    public static void displayMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int LargestCol(int[][] matrix) {
        int count1s;
        int maxOccurrences = Integer.MIN_VALUE;
        int colIndex = -1;

        for (int col = 0; col < matrix.length; col++) {
            count1s = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1){
                    count1s++;
                }
            }
            if (count1s >= maxOccurrences){
                colIndex = col;
                maxOccurrences = count1s;
            }
        }
        return colIndex;

    }

    public static int largestRow(int[][] matrix) {
        int count1s;
        int maxOccurrence = Integer.MIN_VALUE;
        int rowIndex = -1;

        for (int row = 0; row < matrix.length; row++) {
            count1s = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1){
                    count1s++;
                }
            }

            if (count1s >= maxOccurrence){
                rowIndex = row;
                maxOccurrence = count1s;
            }
        }

        return rowIndex;
    }

    public static void fillTheMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int)(Math.random() * 2);
            }
        }
    }

    public static int[][] getAMatrix() {
        return new int[4][4];
    }


}
