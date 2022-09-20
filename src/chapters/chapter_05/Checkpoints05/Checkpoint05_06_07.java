package chapters.chapter_05.Checkpoints05;

import java.util.Scanner;

public class Checkpoint05_06_07 {
    public static void main(String[] args) {
        //Checkpoint05_06
        Scanner input = new Scanner(System.in);
        int number, max;
        System.out.println("Enter an integer " +
                "(the input ends if it is 0)");
        number = input.nextInt();
        max = number;
        do {
            System.out.println("Enter an integer " +
                    "(the input ends if it is 0)");
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);


        //Checkpoint05_07
       int number1;
        int sum = 0;
     do {
         System.out.println("Enter an integer " +
                 "(the input ends if it is 0)");
        number1 = input.nextInt();
        sum += number1;
         }  while (number1 != 0);

    }
}
