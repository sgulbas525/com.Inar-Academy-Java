package weeks.week_07;

import java.util.Scanner;

public class IsPresentInNewString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1 = input.nextLine();

        System.out.println("Enter a String: ");
        String s2 = input.nextLine();

        String newString = remove(s1, s2);

        System.out.println("Our new string is " + newString);
    }

    public static String remove(String s1, String s2) {

        for (int i = 0; i < s2.length(); i++) {
            s1 = remove(s1, s2.charAt(i));
        }

        return s1;
    }


    public static String remove(String word, char letter) {
        String newS = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter)
                continue;
            newS = newS + word.charAt(i);
        }
        return newS;
    }
}