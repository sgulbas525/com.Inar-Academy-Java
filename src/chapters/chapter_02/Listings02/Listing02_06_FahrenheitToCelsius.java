package chapters.chapter_02.Listings02;

import java.util.Scanner;

	public class Listing02_06_FahrenheitToCelsius {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
		}
	}
