package chapters.chapter_08.Checkpoints08;

public class Checkpoint08_05_06 {
    public static void main(String[] args) {


        //Checkpoint08_05

        int[][] array ={{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
        System.out.println();
        }

        System.out.print("\n\n");

        //Checkpoint08_06

        int[][] array1 = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array1.length; i++)
            sum += array1[i][0];
        System.out.println(sum);
    }
}
