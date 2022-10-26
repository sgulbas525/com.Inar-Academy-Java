package chapters.chapter_02.Exercises02;

import java.util.Scanner;

public class Exercise02_14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double KILOGRAM_PER_POUND = 0.45359237;
		final double METER_PER_INCH = 0.0254;

		System.out.print("Enter weight in pounds : ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches : ");
		double height = input.nextDouble();

		double bmi =KILOGRAM_PER_POUND * weight / Math.pow(METER_PER_INCH * height,2);
	
		System.out.println("BMI is " + bmi );
	}
}
