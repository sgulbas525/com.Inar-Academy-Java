package weeks.week_03;

import java.util.Scanner;

public class Week_03__Question_03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 4 digit number: ");
		int number = input.nextInt();

		int reversedNumber = 0 ;

		reversedNumber += number % 10 * 1000 ;
		reversedNumber += number % 100 / 10 * 100 ;
		reversedNumber += number % 1000 /100 * 10 ;
		reversedNumber += number / 1000 ;

		System.out.println("The reversed version of " + number + " is " + reversedNumber);

	}
}

