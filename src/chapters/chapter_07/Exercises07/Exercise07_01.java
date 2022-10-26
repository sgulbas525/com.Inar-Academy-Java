package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        double[] scores = new double[number];

        System.out.println("Enter " + number + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }

        displayGrades(scores);
    }

    public static void displayGrades(double[] scores) {
        double bestScore = findBestScore(scores);

        for (int i = 0; i < scores.length; i++) {
            char grade = findGrade(scores[i], bestScore);
            System.out.println("Student " + i + " score is " + scores[i] +
                    " and grade is " + grade);
        }
    }

    public static double findBestScore(double[] scores) {

        double best = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        return best;
    }

    public static char findGrade(double score, double bestScore) {

        if (score >= bestScore - 10) {
            return 'A';
        } else if (score >= bestScore - 20) {
            return 'B';
        } else if (score >= bestScore - 30) {
            return 'C';
        } else {
            return 'D';
        }
    }
}

