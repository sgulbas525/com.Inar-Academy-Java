package chapters.chapter_05.Checkpoints05;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Checkpoint05_08_09_10_11_13_14 {
    public static void main(String[] args) {
        //Checkpoint05_08
        int sum = 0;
        for (int i = 0; i < 10; ++i)
            sum += i;

        System.out.println(sum + "\n\n");
        sum = 0;
        for (int i = 0; i < 10; i++)
            sum += i;
        System.out.println(sum + "\n\n\n\n\n");


        //Checkpoint05_09
        for (int i = 1; i < 100; i++)
            System.out.println(i + "-----");
        System.out.println("\n\n\n\n\n");


        //Checkpoint05_10
        Scanner input = new Scanner(System.in);
        int number, sum4 = 0, count;
        for (count = 0; count < 5; count++) {
            System.out.println("Enter an integer: ");
            number = input.nextInt();
            sum4 += number;
        }
        System.out.println("sum is " + sum4);
        System.out.println("count is " + count + "\n\n\n\n\n");


        /**Checkpoint05_11
         for ( ; ; ) {
         Do something
         } IS AN INIFINITE LOOP */


        //Checkpoint05_13
        long sum1 = 0;
        int i1 = 1;
        while (i1 <= 1000) {
            sum1 += i1;
            i1++;
        }
        System.out.println("\n\n");
        long sum2 = 0;
        int i2 = 0;
        do {
            i2++;
            sum2 += i2;
        } while (i2 <= 1000);
        System.out.println("\n\n\n\n\n");


        /**  Checkpoint05_14
         int count = 0;
         while (count < n) {
         count++;
         } N ITERATIONS

         for (int count = 0;
         count <= n; count++) {
         } N+1 ITERATIONS

         int count = 5;
         while (count < n) {
         count++;
         } N - 5 ITERATIONS

         int count = 5;
         while (count < n) {
         count = count + 3;
         } (N - 5) / 3 ITERATIONS */


    }
}