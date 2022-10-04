package chapters.chapter_07.Checkpoints07;

public class Checkpoint07_26_27_28 {
    public static void main(String[] args) {

        //Checkpoint07_26
        /* These methods are overloaded for all primitive types.
         * No, it doesn't create a new array. It works on the reference value
         */

        //Checkpoint07_27
        /* The list must be presorted in INCREASING order */
        int[] a = {1, 2, 3, 4, 5};
        int i = java.util.Arrays.binarySearch(a, 2);
        java.util.Arrays.toString(a);

        int[] b = {5, 4, 3, 2, 1};
        int j = java.util.Arrays.binarySearch(b, 2);// It returns -1 and that's wrong
        System.out.println("i is " + i + "\nj is " + j);

        //Checkpoint07_28
        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 7);
        System.out.println(java.util.Arrays.toString(list1));

        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.print(java.util.Arrays.equals(list1, list2));
    }
}
