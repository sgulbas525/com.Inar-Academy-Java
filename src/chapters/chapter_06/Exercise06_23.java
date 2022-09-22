package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = input.nextLine();

        System.out.print("Enter a char: ");
        char a = input.nextLine().charAt(0);

        System.out.println("In " + s + " there is/are " + count(s, a) + "  " + a + "s");
    }


    public static int count(String s, char a) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
