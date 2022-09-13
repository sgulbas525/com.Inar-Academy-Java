import java.util.Scanner;

public class Exercise03_23 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with twi coordinates: ");
		double x = ((int)input.nextDouble() * 10) / 10.0;
		double y =((int)input.nextDouble() * 10) / 10.0;

		System.out.print("Point (" + x + ", " + y + ") is ");
		if (x > 5 || x < -5 || y > 2.5 || y < -2.5)
			System.out.println("not in the rectangle");
		else
			System.out.println("in the rectangle");

	}
}
