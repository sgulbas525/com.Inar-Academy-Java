import java.util.Scanner;

public class Exercise_22{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double RADIUS = 10;

		System.out.print("Enter a point with two coordinates: ");
		double x =((int)input.nextDouble() * 10) / 10.0;
		double y =((int)input.nextDouble() * 10) / 10.0;
		
		double distance = ((int)Math.pow(Math.pow(x - 0, 2) + Math.pow(y - 0, 2), 0.5) * 10) / 10.0;

		System.out.print("Point (" + x + ", " + y + ") is ");
		if(distance <= 10)
			System.out.println("in the circle");
		else
			System.out.println("not in the circle");

}
}
