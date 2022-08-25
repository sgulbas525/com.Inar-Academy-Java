import java.util.Scanner;

	public class Exercise_23{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the driving distance: ");
			double distance = input.nextDouble();

			System.out.print("Enter miles per gallon: ");
			double gallon = input.nextDouble();

			System.out.print("Enter price per gallon: ");
			double price = input.nextDouble();
			
			double totalCost = distance / gallon * price ;

			System.out.println("The cost of driving is $" + totalCost);
		}
	}
