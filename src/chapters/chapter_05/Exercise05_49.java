package chapters.chapter_05;

import java.util.Scanner;

public class Exercise05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLetter(s1.charAt(i))) {
                if (s1.substring(i, i + 1).equalsIgnoreCase("A") ||
                        s1.substring(i, i + 1).equalsIgnoreCase("E") ||
                        s1.substring(i, i + 1).equalsIgnoreCase("I") ||
                        s1.substring(i, i + 1).equalsIgnoreCase("O") ||
                        s1.substring(i, i + 1).equalsIgnoreCase("U"))
                    countVowels++;
                else
                    countConsonants++;
            }
        }
        System.out.printf("The number of vowels is %d\n" +
                "The number of consonants is %d", countVowels, countConsonants);
    }
}
