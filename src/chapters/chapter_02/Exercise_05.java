import java.util.Scanner;

public class Exercise_05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate : ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal*gratuityRate/100;

		System.out.println("The gratuity is $" + gratuity + " and total is $" +(subtotal + gratuity));
	}
}
