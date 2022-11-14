package chapters.chapter_11.Exercises11.E13;

import java.util.ArrayList;

import static chapters.chapter_11.Exercises11.E11.Exercise11_11.getFromUser;

public class Exercise11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser(10);

        removeDuplicates(list);
        System.out.println("The distinct integers are ");
        System.out.println(list);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> removed = new ArrayList<>();
        while (!list.isEmpty()) {
            int n = list.remove(list.size() - 1);
            if (!removed.contains(n)) {
                removed.add(n);
            }
        }
        list.addAll(removed);
        /* Another solution
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    When we remove one element in our list the size will decrease by one automatically,
                    the elements will shift left by one, so we will skip one element without compare.
                    To prevent that decrease the index follower variable by one when we remove an element.
                    list.remove(j--);*/
    }
}



