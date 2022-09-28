package chapters.chapter_06;

import chapters.chapter_06.Listings06.Listing06_10_RandomCharacter;

public class Exercise06_38 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;

        printRandomCharacters(NUMBER_PER_LINE, 100);
        printRandomDigits(NUMBER_PER_LINE, 100);
    }

    public static void printRandomCharacters(int perLine, int n) {
        int count = 0;
        char ch;
        for (int i = 0; i < n; i++) {
            ch = Listing06_10_RandomCharacter.getRandomUpperCaseLetter();
            count++;
            if (count % perLine == 0)
                System.out.println(ch);
            else
                System.out.print(ch + " ");
        }
    }

    public static void printRandomDigits(int perLine, int n) {
        int count = 0;
        char ch;
        for (int i = 0; i < n; i++) {
            ch = Listing06_10_RandomCharacter.getRandomDigitCharacter();
            count++;
            if (count % perLine == 0)
                System.out.println(ch);
            else
                System.out.print(ch + " ");
        }
    }
}