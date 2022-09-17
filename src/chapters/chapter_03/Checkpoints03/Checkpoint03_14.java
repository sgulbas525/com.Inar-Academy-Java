package Checkpoints03;

import java.util.Scanner;

public class Checkpoint03_14 {
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = input.nextInt();

		if (number % 2 == 0)
			System.out.println(number + " is even");
		if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");



		System.out.print("Enter a number: ");
                int number1 = input.nextInt();

             	if (number1 % 2 == 0)
			System.out.println(number1 + " is even");
		else if (number1 % 5 == 0)
			System.out.println(number1 + " is multiple of 5");
	}
}
