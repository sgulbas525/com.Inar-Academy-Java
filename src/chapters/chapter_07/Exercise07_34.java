package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_34 {
    public static void main(String[] args) {
        String s = getStringFromUser();
        String sortedS = sort(s);

        displayStrings(s, sortedS);
    }

    private static String getStringFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = input.nextLine();

        return s;
    }

    private static String sort(String s) {
        char[] arrayOfS = s.toCharArray();

        // Sorts the characters into a char array
        for (int i = 0; i < arrayOfS.length - 1; i++) {
            for (int j = i + 1; j < arrayOfS.length; j++) {
                if (arrayOfS[i] > arrayOfS[j]) {
                    char temp = arrayOfS[i];
                    arrayOfS[i] = arrayOfS[j];
                    arrayOfS[j] = temp;
                }
            }
        }

        // arrays elements added to a string
        String sortedS = "";

        for (int i = 0; i < arrayOfS.length; i++) {
            sortedS += arrayOfS[i] ;
        }

        return sortedS;
    }

    public static void displayStrings(String s, String sortedS) {
        System.out.print("Sorted of " + s + " is " + sortedS);
    }
}