package chapters.chapter_04;

import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = Math.round((n * Math.pow( s, 2)) /  (4 * Math.tan( Math.PI/ n))* 100) / 100.0 ;
        System.out.println("The area of the polygone is " + area);

    }
}
