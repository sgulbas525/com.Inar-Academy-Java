package chapters.chapter_04;

import java.util.Scanner;

public class Exercise04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String s = input.next().toUpperCase();

        if(s.length() > 1 || !Character.isLetter(s.charAt(0))){
            System.out.println(s + " is an invalid input");
            System.exit(0);
        }
        System.out.print("The corresponding number is ");
        char ch = s.charAt(0);

        if (ch > 'W')
            System.out.println(9);
        else if (ch > 'T')
            System.out.println(8);
        else if (ch > 'P')
            System.out.println(7);
        else if (ch > 'M')
            System.out.println(6);
        else if (ch > 'J')
            System.out.println(5);
        else if (ch > 'G')
            System.out.println(4);
        else if (ch > 'D')
            System.out.println(3);
        else if (ch >= 'A')
            System.out.println(2);
    }
}
