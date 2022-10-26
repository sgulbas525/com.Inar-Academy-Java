package chapters.chapter_04.Exercises04;

import java.util.Scanner;
public class Exercise04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.next();

        if(s.length() > 1){
            System.out.println("Invalid input");
            System.exit(0);
        }
        char ch = s.charAt(0);
        int value = ch;
        System.out.println("The unicode for the character " + ch + " is " + value);
    }
}
