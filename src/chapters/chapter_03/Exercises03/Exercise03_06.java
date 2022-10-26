package chapters.chapter_03.Exercises03;

import java.util.Scanner;

public class Exercise03_06 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = 0.45359237;
	final double METERS_PER_INCH = 0.0254;

	System.out.print("Enter weights in pounds: ");
	double weights = input.nextDouble();
	System.out.print("Enter feet: ");
	int feet = input.nextInt();
	System.out.print("Enter inches: ");
	int inches = input.nextInt();

	double bmi = (weights * KILOGRAMS_PER_POUND) / Math.pow((feet * 12 + inches) * METERS_PER_INCH, 2);
	System.out.println("BMI is " + bmi);

	if (bmi < 18.5)
        System.out.println("Underweight");
        else if (bmi < 25)
        System.out.println("Normal");
        else if (bmi < 30)
        System.out.println("Overweight");
        else
        System.out.println("Obese");
        }
}

