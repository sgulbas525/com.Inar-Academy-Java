import java.util.Scanner;

public class Exercise03_09 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();
		long checksum = 0;

		System.out.print("The ISBN-10 number is " + isbn);
		
		checksum += isbn % 10 * 9;
		isbn /=10;
		 checksum += isbn % 10 * 8;
                isbn /=10;
 		checksum += isbn % 10 * 7;
                isbn /=10;
 		checksum += isbn % 10 * 6;
                isbn /=10;
 		checksum += isbn % 10 * 5;
                isbn /=10;
 		checksum += isbn % 10 * 4;
                isbn /=10;
 		checksum += isbn % 10 * 3;
                isbn /=10;
 		checksum += isbn % 10 * 2;
                isbn /=10;
		checksum += isbn;

		if(checksum % 11 == 10)
			System.out.println("X");
		else
			System.out.println(checksum % 11 + "");
	}
}
