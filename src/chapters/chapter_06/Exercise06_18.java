package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.print(password + " is");

        if (isValid(password))
            System.out.println(" valid");
        else
            System.out.println(" invalid");
    }


    public static boolean isValid(String s) {
        return (atLeast8Characters(s) && atLeast2Digits(s) && onlyLettersAndDigits(s));

    }

    public static boolean atLeast8Characters(String s) {
        if (s.length() < 8) {
            System.err.println("Must be equal or longer than 8 characters!");
            return false;
        }else
            return true;
    }
    public static boolean onlyLettersAndDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                System.err.println("Must contain  least or digits!");
                return false;
            }
        }
        return true;
    }

    public static boolean atLeast2Digits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
            if (count > 1) {
                return true;
            }
        }
        System.err.println("Must contain at least 2 digits!");
        return false;
    }
}
