package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //Whether n is a palindrome
        if (isPalindrome(number))
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " isn't a palindrome");
    }

    public static boolean isPalindrome(int n) {
        return (n == reverse(n)); //Checking n with it is reversed version
    }

    public static int reverse(int n) {
        String reversed = "";
        while (n != 0) {
            reversed += n % 10;
            n /= 10;
        }
        return Integer.parseInt(reversed);
    }
}