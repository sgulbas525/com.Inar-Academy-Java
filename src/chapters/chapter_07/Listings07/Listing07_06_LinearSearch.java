package chapters.chapter_07.Listings07;

public class Listing07_06_LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);
     System.out.println("4 index is = " + i + "\n-4 index is = " + j + "\n-3 index is = " + k);
    }
    // The method for finding a key in the list
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}