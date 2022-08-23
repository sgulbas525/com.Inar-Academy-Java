import java.util.Scanner; //Scanner is in java.util package

public class ComputeAreaWithConstant{
	public static void main(String[] args){
		final double PI = 3.14159; // Declare a constant

		//Create a Scanner object
	 	Scanner input = new Scanner(System.in);

		//Prompt the user to enter a radius
		System.out.print("Entetr a number for radius : ");
		double radius = input.nextDouble();

		//Compute area
		double area = radius * radius * 3.14159;

		//Display result
		System.out.println("The area for the circle of radius " + radius + " is " +area);
	}
}
