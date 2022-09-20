package chapters.chapter_02;

import java.util.Scanner;

public class Exercise02_11 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final int POPULATION = 312032486; 

		System.out.print("Enter the number of years : ");
		int years = input.nextInt();

		System.out.println("The population in " + years + " years is " +  (POPULATION + years * ((365 * 24 * 60 * 60 / 7) - (365 * 24 * 60 * 60 / 13) + (365 * 24 * 60 * 60 / 45))));
	}
}

