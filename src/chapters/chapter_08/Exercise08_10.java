package chapters.chapter_08;

public class Exercise08_10 {
    public static void main(String[] args) {

        int[][] matrix = createAMatrix();
        int largestRowIndex = getTheLargestRow(matrix);
        int largestColumnIndex = getTheLargestColumn(matrix);

        displayMatrix(matrix);
        System.out.println("The largest row is: " + largestRowIndex);
        System.out.println("The largest column is: " + largestColumnIndex);
    }

    public static int[][] createAMatrix() {
        int[][] matrix = new int[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static int getTheLargestRow(int[][] matrix) {
        int count1s ;
        int maxOccurrences = Integer.MIN_VALUE;
        int indexRowOfMaxOccurrence = -1;




        for (int row = 0; row < matrix.length; row++) {
            count1s = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 1) {
                    count1s++;
                }
            }
            if (count1s > maxOccurrences) {
                maxOccurrences = count1s;
                indexRowOfMaxOccurrence = row;
            }
        }
        return indexRowOfMaxOccurrence;
    }

    public static int getTheLargestColumn(int[][] matrix) {
        int count1s;
        int maxOccurrences = Integer.MIN_VALUE;
        int indexColOfMaxOccurrence = -1;



        for (int col = 0; col < matrix.length; col++) {
            count1s = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count1s++;
                }
            }
            if (count1s > maxOccurrences) {
                maxOccurrences = count1s;
                indexColOfMaxOccurrence = col;
            }
        }
        return indexColOfMaxOccurrence;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}


