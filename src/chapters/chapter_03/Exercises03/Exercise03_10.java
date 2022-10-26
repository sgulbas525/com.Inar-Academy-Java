package chapters.chapter_03.Exercises03;

import java.util.Scanner;

public class Exercise03_10 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 99) + 1;
		int number2 = (int)(Math.random() * 99) + 1;

		System.out.print(number1 + " + " + number2 + " ? ");
		int answer = input.nextInt();

		if (number1 + number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
	
	}
}
