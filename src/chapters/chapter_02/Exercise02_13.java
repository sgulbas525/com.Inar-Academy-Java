package chapters.chapter_02;

import java.util.Scanner;

public class Exercise02_13 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		final double MONTHLY_INTEREST = 0.05 / 12 ;

		System.out.print("Enter the monthly saving amount : ");
		double savingAmount = input.nextDouble();
		double totalAmount = 0;

		totalAmount = (totalAmount + savingAmount) * ( 1 + MONTHLY_INTEREST);
		totalAmount = (totalAmount + savingAmount) * ( 1 + MONTHLY_INTEREST);
		totalAmount = (totalAmount + savingAmount) * ( 1 + MONTHLY_INTEREST);
		totalAmount = (totalAmount + savingAmount) * ( 1 + MONTHLY_INTEREST);
		totalAmount = (totalAmount + savingAmount) * ( 1 + MONTHLY_INTEREST);
		totalAmount = (totalAmount + savingAmount) * ( 1 + MONTHLY_INTEREST);


		System.out.println("After the sixth month, the account value is " + totalAmount );
	}
}
