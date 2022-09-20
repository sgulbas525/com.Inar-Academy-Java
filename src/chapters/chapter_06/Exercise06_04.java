package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print(number);
        reverse(number);
    }

    public static void reverse(int n){
        String reversed = "";

        while (n != 0){
            reversed += n % 10;
            n /= 10;
        }
        System.out.println("'s reverse is " + reversed);
    }
}
