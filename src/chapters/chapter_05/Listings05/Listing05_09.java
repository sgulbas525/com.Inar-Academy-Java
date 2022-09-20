package chapters.chapter_05.Listings05;

import java.util.Scanner;

public class Listing05_09 {
        /** Main method */
        public static void main(String[] args) {
            //Create a Scanner
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter two integers
            System.out.print("Enter first integer: ");
            int n1 = input.nextInt();
            System.out.println("Enter second integer: ");
            int n2 = input.nextInt();

            int gcd = 1;// Initial gcd is 1
            int k = 2;// possible gcd
            while (k <= n1 && k <= n2){
                if (n1 % k == 0 && n2 % k ==0)
                    gcd = k;
                k++;
            }
            System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
        }
}
