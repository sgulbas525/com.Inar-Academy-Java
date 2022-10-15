package weeks.week_10;

public class FindTheColWithMaxSum { public static void main(String[] args) {
    int[][] matrix = TwoDimensionalArray.getFromUser();
    TwoDimensionalArray.fill2DArrWithRandomValues(matrix, 0, 100);
    TwoDimensionalArray.printArr(matrix);
    int indexOfColWithMaxSum = getTheColWithTheMaxIndex(matrix);
    System.out.println("Col " + (indexOfColWithMaxSum  + 1)+ " has the max sum among columns.");

}

    public static int getTheColWithTheMaxIndex(int[][] matrix) {
        int sum = Integer.MIN_VALUE;
        int tempSum;
        int index = -1;


        for (int col = 0; col < matrix.length; col++) {
            tempSum = 0;
            for (int row = 0; row < matrix[col].length; row++) {
                tempSum += matrix[row][col];
            }
            if (tempSum > sum){
                index = col;
                sum = tempSum;
            }
        }
        return index;
    }
}
