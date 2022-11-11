package chapters.chapter_11.Exercises11.E16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {
    public static void main(String[] args) {
        additionQuiz();
    }

    public static void additionQuiz() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> answers = new ArrayList<>();

        int n1 = (int) (Math.random() * 100);
        int n2 = (int) (Math.random() * 100);
        int answer = -1;

        while (n1 + n2 != answer) {
            System.out.print("What is " + n1 + " + " + n2 + " = ");
            answer = input.nextInt();
            if (n1 + n2 != answer){
                System.out.print("Wrong answer. Try again. ");
            }else{
                System.out.println("You got it!");
            }
            answers.add(answer);
        }

        System.out.println("Your answers were " + answers);
    }
}
