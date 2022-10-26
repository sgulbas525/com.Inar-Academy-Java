package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_35 {
    public static void main(String[] args) {

        String[] words = {"Besiktas", "GoldenState", "SeaHawks", "Yankees", "ManchesterCity", "Barcelona", "Liverpool"};
        playHangman(words);

    }

    public static void playHangman(String[] words) {
        Scanner input = new Scanner(System.in);
        String word ;

        do {
            // In each game a new word
            word = words[(int) (Math.random() * words.length)];
            char[] answer = new char[word.length()];
            askToUser(word, answer);

            System.out.print("Do you want to guess another word? Enter y or n>");
        } while (input.next().toLowerCase().charAt(0) == 'y');
    }

    public static void askToUser(String word, char[] answer) {
        Scanner input = new Scanner(System.in);
        fill(answer, '*');
        int missTime = 0;

        while (true) {
            System.out.print("(Guess) Enter a letter in word ");
            printTheWordInAsterisk(answer);

            char ch = input.next().toLowerCase().charAt(0);// for case-sensitive
            missTime += checkLetter(word, answer, ch);

            if (checkAnswer(word, answer)) {
                break;
            }
        }
        System.out.println("The word is " + word);
        if (missTime == 0) {
            System.out.println("You didn't miss");
        } else if (missTime == 1) {
            System.out.println("You missed " + missTime + " time");
        } else {
            System.out.println("You missed " + missTime + " times");
        }
    }

    // Checks the letter whether is in the word
    public static int checkLetter(String word, char[] answer, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == ch) {
                answer[i] = word.charAt(i);
            }
        }

        return contains(answer, ch) ? 1 : 0;// counts miss time

    }

    // Check whether the input letter has been entered
    public static boolean contains(char[] answer, char ch) {
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == ch) {
                return true;
            }
        }
        return false;
    }


    // Checks whether the user has find the word
    private static boolean checkAnswer(String word, char[] answer) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != answer[i]) {
                return false;
            }
        }
        return true;
    }

    // Prints known-letter and asterisks
    private static void printTheWordInAsterisk(char[] answer) {
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
        System.out.print(" > ");
    }

    // Fills array with asterisks
    public static void fill(char[] answer, char ch) {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ch;
        }
    }
}