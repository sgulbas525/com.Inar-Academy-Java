package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_32 {
    public static void main(String[] args) {
        int[] list = getListFromUser();
        int pivot = partition(list);

        displayList(list, pivot);

    }

    public static int[] getListFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    private static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;// Index stars from beginning of the array
        int high = list.length - 1;// Index starts from the end of the array

        while (low <= high) {
            while (true) {// It iterates until the element with low is greater than pivot
                if (pivot >= list[low]) {
                    // Take the element with the low index to the beginning and shift the array up to low right
                    shiftRight(low, list);
                    low++;// After shifting low increases because we put the pivot on that index after shifting right
                } else {
                    break;
                }
            }
            while (true) {// It iterates until the element with high is smaller than pivot
                if (pivot > list[high]) {
                    int temp = list[low];// Exchange low and high and decrease
                    list[low] = list[high];// Exchange low and high and decrease
                    list[high] = temp;// Exchange low and high and decrease
                    high--;// after exchanging low become smaller than pivot and high become larger than pivot
                    break;
                }else{
                    high--;
                    break;
                }
            }
        }


        return pivot;
    }

    // Take the element with the limit index to the beginning and shift the array up to limit right
    public static void shiftRight(int limit, int[] list) {
        int temp = list[limit];


        for (int i = limit - 1; i >= 0; i--) {
            list[i + 1] = list[i];
        }
        list[0] = temp;

    }

    private static void displayList(int[] list, int pivot) {
        System.out.println("The pivot is: " + pivot);
        System.out.print("After the partition, the list is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
