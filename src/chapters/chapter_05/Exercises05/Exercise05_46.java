package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String s2 = "";
        for (int i = 0; i < s.length(); i++)
            s2 = s.charAt(i) + s2;

        System.out.println("The reversed string is " + s2);
    }
}
