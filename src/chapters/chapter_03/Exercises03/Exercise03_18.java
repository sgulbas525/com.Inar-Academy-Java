package chapters.chapter_03.Exercises03;

import java.util.Scanner;

public class Exercise03_18 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight of the package : ");
		double weight = input.nextDouble();

		System.out.print("Cost of weight " + weight + " is ");
		if(weight <= 1)
			System.out.println("$3.5");
		else if(weight <= 3)
			System.out.println("%5.5");
		else if(weight <= 10)
			System.out.println("$8.5");
		else if(weight <= 20)
			System.out.println("$10.5");
		else
			System.out.println("over the limits. The package cannot be shipped.");
	}
}
					
