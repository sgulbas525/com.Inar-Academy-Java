package chapters.chapter_11.Exercises11.E07;

import java.util.ArrayList;

public class Exercise11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fill(list);
        displayList(list);

        shuffle(list);
        System.out.println("After shuffling");
        displayList(list);

    }

    public static void shuffle(ArrayList<Integer> list) {
        int temp;
        int index;
        for (int i= 0 ; i < list.size(); i++) {
            index = (int) (Math.random() * list.size());
            temp = list.get(index);

            list.set(index, list.get(i));
            list.set(i, temp);

        }
    }

    public static void displayList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void fill(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
    }
}
