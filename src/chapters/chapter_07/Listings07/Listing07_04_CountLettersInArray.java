package chapters.chapter_07.Listings07;

import chapters.chapter_06.Listings06.Listing06_10_RandomCharacter;

public class Listing07_04_CountLettersInArray {
    /** Main method */
    public static void main(String[] args) {
        // Declare and create an array
        char[] chars = createArray();

        // Display the array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        // Count the occurrences of each letter
        int[] count = countLetters(chars);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(count);
    }

    /** Create an array of characters */

    public static char[] createArray() {
        // Declare an array of characters and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign them to array
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Listing06_10_RandomCharacter.getRandomLowerCaseLetter();

        }
        // Return the array
        return chars;
    }

    /** Display the array of characters */
    public static void displayArray(char[] chars) {
        //Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);

            System.out.print(chars[i] + "  ");
        }
    }

    /** Count the occurrences of each letters */
    public static int[] countLetters(char[] chars) {
        // Declare and create an array of 26 int
        int[] counts = new int[26];

        // For each lowercase letter in the array, count it
        for (int i = 0; i < counts.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    /** Display counts */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            else {
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
            }
        }


    }
}
