package chapters.chapter_05.Checkpoints05;

import java.util.Scanner;

public class Checkpoints05_01_02_03_04_05 {
    public static void main(String[] args) {
        //Checkpoint05_01
        int count = 0;
        while (count < 100) {
            System.out.println(count < 100);
            System.out.println("Welcome to Java!");
            count++;
            System.out.println(count < 100);
        }
        System.out.println((count < 100) + ("\n\n\n\n\n"));

        /**Checkpoint05_02
         There is a possibility of the guess number being 0 */


        //Checkpoint05_03
        /**  A
         int i = 1;
         while (i < 10)
         if (i % 2 == 0)
         System.out.println(i);
         INFINITY LOOP */

        //    B
        int i = 1;
        int count1 = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i++);
                count++;
                System.out.println(count + " times\n\n\n\n\n");
            }
        }
        //      C
        int g = 1;
        int count2 = 0;
        while (g < 10) {
            if ((g++) % 2 == 0) {
                System.out.println(g);
                count2++;
            }
            System.out.println(count + " times\n\n\n\n\n");
        }

        // Checkpoint05_04
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        while (number != 0) {
            number = input.nextInt();
            if (number > max)
                max = number;
        }
        System.out.println("max is " + max);
        System.out.println("number " + number);


    //Checkpoint05_08
        int x = 80000000;
        while (x > 0)
            x++;
        System.out.println("\n\n\n\n\nx is " + x);



    }
}



