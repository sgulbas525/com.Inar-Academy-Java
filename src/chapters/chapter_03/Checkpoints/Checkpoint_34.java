import java.util.Scanner;

public class Checkpoint_34{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age for the ticket price: ");
		int age =input.nextInt();

		int ticketPrice = (age >= 16) ? 20 : 10 ;

		System.out.println("For age " + age + " ticket price is "+ ticketPrice);
	}
}
