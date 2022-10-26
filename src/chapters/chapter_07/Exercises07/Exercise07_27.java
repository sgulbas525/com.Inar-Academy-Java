package chapters.chapter_07.Exercises07;

import static chapters.chapter_07.Exercises07.Exercise07_26.getFromUser;

public class Exercise07_27 {
    public static void main(String[] args) {
        int[] list1 = getFromUser();
        int[] list2 = getFromUser();

        if(isTheTwoListIdentical(list1, list2)){
            System.out.println("Two lists are identical.");
        }
        else {
            System.out.println("Two lists are not identical.");
        }

    }

    public static boolean isTheTwoListIdentical(int[] list1, int[] list2) {
        if (list1.length != list2.length){
            return false;// If lists are not at the same length, they can't be identical
        }

       int countTheNumber ;

        for (int i = 0; i < list1.length; i++) {
            countTheNumber = 0;
            for (int j = 0; j < list1.length; j++) {
                if(list1[i] == list1[j])
                    countTheNumber++;// Counts that number in our list and increase countTheNumber by 1, if it's match
            }
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]){
                    countTheNumber--;// Counts that number in our list and decrease countTheNumber by 1, if it's match
                }
            }

            if (countTheNumber != 0){
                return false;// If countTheNumber isn't 0, that means there isn't same occurrence of the number
            }
        }
        return true;
    }
}
