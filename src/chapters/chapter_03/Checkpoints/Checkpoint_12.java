import java.util.Scanner;

public class Checkpoint_12{
        public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int count = input.nextInt();
		
		boolean newLine = (count % 10 == 0);

		System.out.println(newLine);
	}
}
