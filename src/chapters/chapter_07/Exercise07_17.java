package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] studentsName = new String[numberOfStudents];
        double[] scores = new double[numberOfStudents];

        System.out.print("Enter students name and his score: ");
        String s = input.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            s = input.nextLine();
            int k = s.lastIndexOf(" "); // Find the index of the space before the score

            studentsName[i] = s.substring(0, k );// Take the name up to last space which is before his/her score
            scores[i] = Double.parseDouble(s.substring(k));// Take his/her score
        }
        sortInDecreasing(studentsName, scores);
        displayScores(studentsName, scores);
    }

    public static void sortInDecreasing(String[] studentsName, double[] scores) {
        double maxScore;
        String student;
        int index;

        for (int i = 0; i < studentsName.length - 1; i++) {
            // Starting with assume
            maxScore = scores[i];
            student = studentsName[i];
            index = i;

            //Comparing with the remainder of the students
            for (int j = i + 1; j < studentsName.length; j++) {
                // If it's greater than maxScore assign the greater one to the maxScore
                if (maxScore < scores[j]) {
                    maxScore = scores[j];
                    student = studentsName[j];
                    index = j;
                }
            }
            // Exchange their position
            if (i != index) {
                studentsName[index] = studentsName[i];
                scores[index] = scores[i];
                studentsName[i] = student;
                scores[i] = maxScore;
            }
        }
    }

    public static void displayScores(String[] studentsName, double[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println(studentsName[i] + " takes " + scores[i]);
        }

    }
}
