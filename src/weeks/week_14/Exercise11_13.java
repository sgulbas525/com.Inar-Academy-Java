package weeks.week_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser(10);

        removeDuplicates(list);
        displayList(list);
    }

    private static void displayList(ArrayList<Integer> list) {
    System.out.println("The distinct numbers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    private static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> removed = new ArrayList<>();

       while (!list.isEmpty()){
            int n = list.remove(0);
            if (!removed.contains(n)){
                removed.add(n);
            }
        }
        list.addAll(removed);
    }
     /* Another solution
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    When we remove one element in our list the size will decrease by one automatically,
                    the elements will shift left by one, so we will skip one element without compare.
                    To prevent that decrease the index follower variable by one when we remove an element.
                    list.remove(j--);*/


    private static ArrayList<Integer> getFromUser(int numberOfIntegers) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberOfIntegers; i++) {
            list.add(input.nextInt());
        }

        return list;
    }
}

