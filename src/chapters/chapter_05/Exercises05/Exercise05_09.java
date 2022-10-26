package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudent = input.nextInt();

        String highestStudent = "";
        int highestScore = 0;
        String secondHighestStudent = "";
        int secondHighestScore = 0;
        String tempStudent ;
        int tempScore ;

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Enter student's name and her/his score: ");
            tempStudent = input.next();
            // For invalid name inputs
            for (int j = 0; j < tempStudent.length(); j++) {
                if (!Character.isLetter(tempStudent.charAt(j))) {
                    System.out.println("Invalid student name!" + tempStudent);
                    i--;
                }
            }

            tempScore = input.nextInt();
            //For invalid score inputs
            if (tempScore > 100 || tempScore < 0) {
                System.out.println("Invalid score!");
                i--;
            }

            if (tempScore == highestScore) {
                highestStudent += " ve " + tempStudent;
            }

            if (tempScore > secondHighestScore) {
                secondHighestStudent = tempStudent;
                secondHighestScore = tempScore;
            }

            if (tempScore > highestScore) {
                secondHighestStudent = highestStudent;
                secondHighestScore = highestScore;
                highestStudent = tempStudent;
                highestScore = tempScore;
            }
        }
        System.out.printf("%s's score %d is the highest score"
                , highestStudent, highestScore);

        if (numberOfStudent > 1)
            System.out.printf(" and %s's score %d is the second highest. "
                    , secondHighestStudent, secondHighestScore);
    }
}
