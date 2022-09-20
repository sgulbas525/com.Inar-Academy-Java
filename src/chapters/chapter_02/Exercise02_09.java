package chapters.chapter_02;

import java.util.Scanner;

public class Exercise02_09 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter starting velocity(m/s), ending velocity(m/s) and time span(s) : ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

		double a = (v1 - v0) / t;

		System.out.println("The average acceleration is " + a);
	}
}

