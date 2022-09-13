import java.util.Scanner;

public class Exercise03_20 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in fahrenheit : ");
		double temperature = input.nextDouble();
		
		if(temperature >= 41 || temperature <= -58){
			System.out.println("Invalid temperature");
			System.exit(1);
		}
		System.out.print("Enter wind speed in miles per hour : ");
		double speed = input.nextDouble();

		if(speed < 2){
			System.out.println("Invalid speed");
			System.exit(2);
		}


		double tWC = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275* temperature * Math.pow(speed, 0.16);
		System.out.println("The wind chill index is " + tWC);
		
	}
}

