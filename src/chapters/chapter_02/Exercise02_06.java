package chapters.chapter_02;

import java.util.Scanner;

public class Exercise02_06 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();

		int sum;
		sum = number % 10;
		number /= 10;
		sum += number % 10;
		number /= 10;
		sum += number;
		System.out.print("The sum of the digits is " + sum);
	}
}
