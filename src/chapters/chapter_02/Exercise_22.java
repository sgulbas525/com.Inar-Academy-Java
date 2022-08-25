import java.util.Scanner;

        public class Exercise_22{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter amount as a integer: ");
			int amount = input.nextInt();

			int cents = amount % 100;
			amount /= 100;

			System.out.println(amount + " dollars and " + cents + " cents");
		}
	}

