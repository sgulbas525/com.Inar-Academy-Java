package chapters.chapter_07.Listings07;

public class Listing07_07_BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list, 2);
        int j = binarySearch(list, 11);
        int k = binarySearch(list, 12);
        int l = binarySearch(list, 1);
        int m = binarySearch(list, 3);

        System.out.println("2 index is: " + i);
        System.out.println("11 index is: " + j);
        System.out.println("12 index is: " + k);
        System.out.println("1 index is: " + l);
        System.out.println("3 index is: " + m);


    }

    // Use binary search to find the key in the list
    public static int binarySearch(int[] list, int key) {

        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key > list[mid]) {
                low = mid + 1;
            } else if (key < list[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return (-low - 1);
    }
}
