package chapters.chapter_07.Checkpoints07;

public class Checkpoint07_16_17_18 {
    public static void main(String[] args) {

        // Checkpoint07_16
        /* When array is passed to a method it's reference value is passed.
         * No new array is created
         * Arguments and parameters are pointing the same array */


        //Checkpoint07_17 - A
        System.out.println("Checkpoint07_17A");
        int number = 0;
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.println("number is " + number + " and numbers[0] is " + numbers[0] + "\n\n");


        //Checkpoint07_17 - B
        System.out.println("Checkpoint07_17B");
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }

    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3;
    }

    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        // It won't reverse that array since
        // it'll execute during the array's length and that will reverse twice
        // which means turning where it starts
        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];

        list = newList;
    }


}

