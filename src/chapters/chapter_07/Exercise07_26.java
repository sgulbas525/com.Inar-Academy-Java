package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_26 {
    public static void main(String[] args) {
        int[] list1 = getFromUser();
        int[] list2 = getFromUser();

        if (isStrictlyIdentically(list1,list2)){
            System.out.println("Two lists are strictly identical");
        }
        else{
            System.out.println("Two lists are not strictly identical");
        }
    }

    public static boolean isStrictlyIdentically(int[] list1, int[] list2) {
        if (list1.length != list2.length){
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]){ // Checks the elements with same index
                return false; // If the indexes don't match it wouldn't strictly identical
            }
        }
        return true;
    }


    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list: ");
        int n = input.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}
