package chapters.chapter_05.Exercises05;

import java.util.Scanner;

public class Exercise05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value: ");
        int decimal = input.nextInt();

        String binaryValue = "";
        System.out.print(decimal + " corresponding binary value is ");
        while (decimal != 0) {

            binaryValue = (decimal % 2) + binaryValue;
            decimal /= 2;

        }
        System.out.print(binaryValue);
    }
}