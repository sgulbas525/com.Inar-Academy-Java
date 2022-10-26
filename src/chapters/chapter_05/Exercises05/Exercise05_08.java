package chapters.chapter_05.Exercises05;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercise05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numberOfStudent = input.nextInt();

        String studentsName = "";
        double highestScore = 0;
        int i = 0;

        do {
            System.out.print("Enter student's name nad his/her score: ");
            String tempStudentsName = input.next();
            double tempHighestScore = input.nextInt();

            for (int j = 0; j < tempStudentsName.length(); j++) {
                if (!Character.isLetter(tempStudentsName.charAt(j))) {
                    System.out.println("Invalid student name!" + tempStudentsName);
                    i--;
                }
            }
            if (tempHighestScore > 100 || tempHighestScore < 0) {
                System.out.println("Invalid score!");
                i--;
            }

            if (tempHighestScore > highestScore) {
                highestScore = tempHighestScore;
                studentsName = tempStudentsName;
            }

            i++;
        } while (i < numberOfStudent);
        System.out.printf("The highest score is %s 's score %.0f", studentsName, highestScore);
    }
}
