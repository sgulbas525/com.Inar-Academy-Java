package chapters.chapter_04;

import java.util.Scanner;
public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value(0 to 15): ");
        int value = input.nextInt();
        if(value > 15 || value < 0){
            System.err.println(value + " is an invalid input");
            System.exit(1);
        }

        System.out.print("The hex value is " + (char)((value < 10) ?
                value + 48 : value - 10 + 65));
    }
}
