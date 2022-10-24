package chapters.chapter_10.Listings10;

import java.util.Scanner;

public class Listing10_10_PalindromeIgnoreNonAlphanumeric {
    /* Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Display result
        System.out.println("Ignoring nonalphanumeric characters, \nis " +
                s + " a palindrome? " + isPalindrome(s));
    }

    /* Return true if a string os a palindrome */
    public static boolean isPalindrome(String s) {
        // Create a new string by eliminating nonalphanumeric chars
        String s1 = filter(s);

        // Create a new string that is the reversal of s1
        String s2 = reverse(s1);

        // Check if the reversal is the same as the original string
        return s2.equals(s1);
    }

    /* Create a new string by eliminating nonalphanumeric chars */
    public static String filter(String s) {
        // Create a string builder
        StringBuilder stringbuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric chars
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringbuilder.append(s.charAt(i));
            }
        }
        // Return a new filtered string
        return stringbuilder.toString();
    }
    /* Create a new string by reversing a specified string */
    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
