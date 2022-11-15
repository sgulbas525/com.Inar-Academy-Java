package chapters.chapter_12.Exercises12.E07;

import java.util.Scanner;

public class Exercise12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter a binary number: ");
            String s = input.nextLine();

            try {
                System.out.println(bin2Dec(s));
                break;
            }catch (Exception ex){
                System.out.println("Input is not a binary number!");
            }
        }
    }
    public static int bin2Dec(String binary){
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                throw new NumberFormatException();
            }
        }

        int sum = 0;
        int multipleOfTwo = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                sum += multipleOfTwo;
            }
            multipleOfTwo *= 2;
        }

        return sum;
    }
}
