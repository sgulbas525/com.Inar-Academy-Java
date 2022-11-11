package chapters.chapter_11.Exercises11.E11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser(5);
        System.out.println(list);
        System.out.println("---------------");

        sortListInIncreasingOrder(list);
        System.out.println("After sorting");
        System.out.println(list);
    }

    public static void sortListInIncreasingOrder(ArrayList<Integer> list) {
        int min;
        int index;
        for (int i = 0; i < list.size() - 1; i++) {
            min = list.get(i);
            index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min > list.get(j)){
                    min = list.get(j);
                    index = j;
                }
            }
            if(index != i){
                list.set(index, list.get(i));
                list.set(i, min);
            }
        }
    }

    public static ArrayList<Integer> getFromUser(int n) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
}
