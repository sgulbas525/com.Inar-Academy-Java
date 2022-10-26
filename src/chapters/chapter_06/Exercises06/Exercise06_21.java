package chapters.chapter_06.Exercises06;

import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phone number as a string: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                System.out.print(letterToNumber(s.charAt(i)));
            else
                System.out.print(s.charAt(i));
    }

    public static int letterToNumber(char ch) {
        if (Character.toUpperCase(ch) >= 'W')
            return 9;
        else if (Character.toUpperCase(ch) >= 'T')
            return 8;
        else if (Character.toUpperCase(ch) >= 'P')
            return 7;
        else if (Character.toUpperCase(ch) >= 'M')
            return 6;
        else if (Character.toUpperCase(ch) >= 'J')
            return 5;
        else if (Character.toUpperCase(ch) >= 'G')
            return 4;
        else if (Character.toUpperCase(ch) >= 'D')
            return 3;
        else
            return 2;
    }
}
