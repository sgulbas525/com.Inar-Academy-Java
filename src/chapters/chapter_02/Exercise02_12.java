import java.util.Scanner;

public class Exercise02_12 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter speed and acceleration : ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();

		double minimumRunwayLength = Math.pow(speed,2) / (2 * acceleration) ;

		System.out.println("The minimum runway length for airplane is " + minimumRunwayLength );
		}
}
