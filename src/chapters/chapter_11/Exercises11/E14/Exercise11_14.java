package chapters.chapter_11.Exercises11.E14;

import java.util.ArrayList;

import static chapters.chapter_11.Exercises11.E11.Exercise11_11.getFromUser;

public class Exercise11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = getFromUser(5);
        ArrayList<Integer> list2 = getFromUser(5);
        ArrayList<Integer> list3 =  union(list1, list2);
        System.out.println(list3);

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> list = new ArrayList<>();
        // Instead of the following code can be used list.addAll(list1);
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        // Instead of the following code can be used list.addAll(list2);
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        return list;
    }
}
