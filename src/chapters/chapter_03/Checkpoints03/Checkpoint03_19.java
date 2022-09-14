import java.util.Scanner;

public class Checkpoint03_19 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number (0 - 100): ");
		int number = input.nextInt();

		boolean isInRange = ((number < 100) && (number > 1)) ? true : false ;
		System.out.println(number + " " + isInRange);

		System.out.print("Enter a number (-100 - 0): ");
                number = input.nextInt();

                isInRange = (number > -100) && (number < -1) ? true : false ;
		System.out.println(number + " " + isInRange);

	}
}
