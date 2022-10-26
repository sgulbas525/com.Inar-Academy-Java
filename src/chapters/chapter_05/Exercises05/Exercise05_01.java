package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int n = input.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        double sum = 0;

        while(n != 0){
            if(n > 0)
                positiveCount++;
            else
                negativeCount++;

            sum += n;
            n = input.nextInt();
        }
        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + (int)(sum / (positiveCount + negativeCount) * 10) / 10.0);
    }
}
