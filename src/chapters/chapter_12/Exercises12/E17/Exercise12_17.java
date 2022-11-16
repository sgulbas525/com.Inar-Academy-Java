package chapters.chapter_12.Exercises12.E17;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise12_17 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> words = getWordsFromFile();
        playHangman(words);


    }
        public static void playHangman (ArrayList<String> words){
            Scanner input = new Scanner(System.in);
            String word;

            do {
                // In each game a new word
                word = words.get((int)(Math.random() * words.size()));
                char[] answer = new char[word.length()];
                askToUser(word, answer);

                System.out.print("Do you want to guess another word? Enter y or n>");
            } while (input.next().toLowerCase().charAt(0) == 'y');
        }

        public static void askToUser (String word,char[] answer){
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
        public static int checkLetter (String word,char[] answer, char ch){
            for (int i = 0; i < word.length(); i++) {
                if (word.toLowerCase().charAt(i) == ch) {
                    answer[i] = word.charAt(i);
                }
            }

            return contains(answer, ch) ? 1 : 0;// counts miss time

        }

        // Check whether the input letter has been entered
        public static boolean contains ( char[] answer, char ch){
            for (int i = 0; i < answer.length; i++) {
                if (answer[i] == ch) {
                    return true;
                }
            }
            return false;
        }


        // Checks whether the user has find the word
        private static boolean checkAnswer (String word,char[] answer){
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != answer[i]) {
                    return false;
                }
            }
            return true;
        }

        // Prints known-letter and asterisks
        private static void printTheWordInAsterisk ( char[] answer){
            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i]);
            }
            System.out.print(" > ");
        }

        // Fills array with asterisks
        public static void fill ( char[] answer, char ch){
            for (int i = 0; i < answer.length; i++) {
                answer[i] = ch;
            }
        }


    private static ArrayList<String> getWordsFromFile() throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a file's pathname for the words that will you ask in game Hangman: ");
        String path = input.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("There isn't any file");
            System.exit(1);
        }

        ArrayList<String> words = new ArrayList<>();
        try (
                Scanner input1 = new Scanner(file)
        ) {
            while (input1.hasNext()) {
                words.add(input1.next());
            }
        }

        return words;
    }
}