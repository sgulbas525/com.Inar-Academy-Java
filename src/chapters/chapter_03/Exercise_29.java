import java.util.Scanner;

public class Exercise_29{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = (int)(input.nextDouble() * 100) / 100.0;
		double y1 = (int)(input.nextDouble() * 100) / 100.0;
		double r1 = (int)(input.nextDouble() * 100) / 100.0;

		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
                double x2 = (int)(input.nextDouble() * 100) / 100.0;
                double y2 = (int)(input.nextDouble() * 100) / 100.0;
		double r2 = (int)(input.nextDouble() * 100) / 100.0;

		double distance = (int)(Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5) * 100) / 100.0;

		if(distance <= Math.abs(r1 - r2)){
			System.out.println("Circle2 is inside Circle1");
		}
		else if(distance <= r1 + r2){
			System.out.println("Circle2 overlaps Circle1");
		}
		else{
			System.out.println("Circle2 does not overlap Circle1");
		}
	}
}

