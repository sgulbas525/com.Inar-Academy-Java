package weeks.week_09;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 2 1 7 52
        // 52 7 1 2 6 5 4 3 2 1
        // kullanicidan 10 sayi al
        // bu dizi yazdirallim
        // bunu metoda yolla
        // metod imlpemeti bize diziyi tersten siralsin ve return
        // bunu yazdiralim

        int[] arr = getFromUser();

        System.out.println("Before reverse method:");
        displayArray(arr);

        // int [] reversedArr = reversed(arr);
        reversed(arr);

        System.out.println("\nAfter reverse method:");
        displayArray(arr);



    }

    // 9 2 3 4 5 6 7 8 1
    //temp = 9
    // 10 9 8 7 6 5 4 3 2 1
    // 1
    // 9 8 7 6 5 4 3 2 1
    public static void reversed(int[] arr) {
        /* int[] reversedofArr = new int[10];
       for (int i = arr.length - 1, reversedArraysIndex = 0; i >= 0 ; i--, reversedArraysIndex++) {
            reversedofArr[reversedArraysIndex] = arr[i];
        } */

        for (int arrIndex = 0, reversedArrIndex = arr.length - 1; arrIndex < arr.length / 2; arrIndex++, reversedArrIndex--) {
            int temp = arr[reversedArrIndex];
            arr[reversedArrIndex] = arr[arrIndex];
            arr[arrIndex] = temp;
        }

    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\n");
    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] list = new int[10];

        for (int n = 0; n < list.length; n++) {
            list[n] = input.nextInt();
        }

        return list;
    }
}
