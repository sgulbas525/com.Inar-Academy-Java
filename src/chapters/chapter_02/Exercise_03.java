import java.util.Scanner;

public class Exercise_03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double ONE_FOOT_PER_METER = 0.305;

		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		System.out.println(feet + (" feet is " + ONE_FOOT_PER_METER*feet + " meters"));
	}
}

