import java.util.Scanner;

public class Exercise02_04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double KILOGRAM_PER_POUND = 0.454;

		System.out.print("Enter a number in pounds : ");
		double pound = input.nextDouble();

		System.out.println(pound + " pounds is " + pound*KILOGRAM_PER_POUND + " kilograms.");
	}
}

