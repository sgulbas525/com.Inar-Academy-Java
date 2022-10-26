package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_31 {
    public static void main(String[] args) {

        int[] list1 = getListFromUser();
        int[] list2 = getListFromUser();

        int[] mergedList = merge(list1, list2);
        displayArray(mergedList);

    }

    public static void displayArray(int[] mergedList) {
        System.out.print("The merged list is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }


    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        // Since we start at the beginning index to compare the smallest element we have to sort arrays
        sort(list1);
        sort(list2);

        int indexInList1 = 0;//  Runs for list1
        int indexInList2 = 0;//  Runs for list2
        int indexInMergedList = 0;//  Runs for mergedList

        // we start from the smallest elements to compare and assign the smallest into to merged list
        while (indexInList1 != list1.length && indexInList2 != list2.length) {
            // Find and assign the small one
            if (list1[indexInList1] > list2[indexInList2]) {
                mergedList[indexInMergedList] = list2[indexInList2];
                indexInMergedList++;
                indexInList2++;
            } else {
                mergedList[indexInMergedList] = list1[indexInList1];
                indexInMergedList++;
                indexInList1++;
            }
        }

            // If list2 is done add the remaining int list1 to merged list
            if (indexInList2 == list2.length) {
                for (int i = indexInList1; i < list1.length; i++) {
                    mergedList[indexInMergedList] = list1[i];
                    indexInMergedList++;
                }
            }

             // If list1 is done add the remaining int list1 to merged list
            if (indexInList1 == list1.length) {
                for (int i = indexInList2; i < list2.length; i++) {
                    mergedList[indexInMergedList] = list2[i];
                    indexInMergedList++;
                }
            }

        return mergedList;
    }

    // Selection sort
    public static void sort(int[] list) {
        int currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMinIndex = j;
                    currentMin = list[j];
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

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
}
