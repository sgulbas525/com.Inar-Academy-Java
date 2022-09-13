import java.util.Scanner;

public class Checkpoint03_20 {
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = input.nextInt();

		if( number - 5 < 4.5 && number - 5 > -4.5)
			System.out.println("Ok--1");

		System.out.print("Enter a number: ");
                number = input.nextInt();
		if( number - 5 > 4.5 && number < -4.5)
			System.out.println("Ok--2");

		}
	}




