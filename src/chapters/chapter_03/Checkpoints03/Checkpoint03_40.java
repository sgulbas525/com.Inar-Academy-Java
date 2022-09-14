import java.util.Scanner;

	public class Checkpoint03_40 {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter two numbers for x, y: ");
			int x = input.nextInt();
			int y = input.nextInt();

			System.out.print("(x > 0 && x < 10) is " + (x > 0 && x < 10) + " ----- ");
			System.out.println("((x > 0) && (x < 10)) is " + ((x > 0) && (x < 10)));
			System.out.print("(x > 0 || x < 10) is " + (x > 0 || x < 10) + " ----- ");
			System.out.println("((x > 0) || (x < 10)) is " + ((x > 0) || (x < 10)));
			System.out.print("(x > 0 || x < 10 && y < 0) is " + (x > 0 || x < 10 && y < 0) + " ----- ");
			System.out.println("(x > 0 || (x < 10 && y < 0)) is " + (x > 0 || (x < 10 && y < 0)));

		}
	}

