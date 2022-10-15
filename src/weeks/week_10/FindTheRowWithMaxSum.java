package weeks.week_10;

public class FindTheRowWithMaxSum {
    public static void main(String[] args) {
        int[][] matrix = TwoDimensionalArray.getFromUser();
        TwoDimensionalArray.fill2DArrWithRandomValues(matrix, 0, 100);
      TwoDimensionalArray.printArr(matrix);
        int indexOfRowWithMaxSum = getTheRowWithTheMaxIndex(matrix);
        System.out.println("Row " + (indexOfRowWithMaxSum + 1)+ " has the max sum among rows.");

    }

    public static int getTheRowWithTheMaxIndex(int[][] matrix) {
    int sum = Integer.MIN_VALUE;
    int tempSum;
    int index = -1;


        for (int row = 0; row < matrix.length; row++) {
            tempSum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                tempSum += matrix[row][col];
            }
            if (tempSum > sum){
                index = row;
                sum = tempSum;
            }
        }
        return index;
    }
}
