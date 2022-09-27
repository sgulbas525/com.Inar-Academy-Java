package chapters.chapter_07.Checkpoints07;

public class Checkpoint07_08_09_10_11 {
    public static void main(String[] args) {

        //Checkpoint07_08
        double[] array = new double[10];

        array[array.length - 1] = 5.5; // array[9] = 5,5

        System.out.println("Sum of first two elements of array is: " + (array[0] + array[1]));

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        int random = (int) (Math.random() * array.length);
        System.out.println("Random: " + array[random]);

        double[] newArray = {3.5, 5.5, 4.52, 5.6};


        //Checkpoint07_09
        /** It'll throw an ArrayIndexOutOfBoundsException. */


        //Checkpoint07_10
        double[] r = new double[100];

        for (int i = 0; i < r.length; i++) {
            r[i] = (Math.random() * 100);
        }


        //Checkpoint07_11
        int[] list = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i < list.length; i++) {
            list[i] = list[i - 1];
        }

        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
