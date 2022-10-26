package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        int countUpperCase = 0;
         for (int i = 0; i < s1.length(); i++)
             if (Character.isUpperCase(s1.charAt(i)))
                 countUpperCase++;

        System.out.println("The number of uppercase letter is " + countUpperCase);
    }
}
