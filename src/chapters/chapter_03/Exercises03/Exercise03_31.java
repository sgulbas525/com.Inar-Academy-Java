package chapters.chapter_03.Exercises03;

import java.util.Scanner;

public class Exercise03_31 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB : ");
		double rate = input.nextDouble() ;

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa : ");
		int conversion = input.nextInt();

		double amount ;
		double exchangeAmount ;
		
		if(conversion == 0){
			System.out.print("Enter the dollar amount : ");
			amount = input.nextDouble() ;
			exchangeAmount = amount * rate ;
			System.out.println("$" + amount + " is " + exchangeAmount + " yuan");
		}
		else if(conversion == 1){
			System.out.print("Enter the RMB amount : ");
                        amount = input.nextDouble() ;
                        exchangeAmount = amount / rate ;
                        System.out.println(amount + " yuan is $" + exchangeAmount);
		}
		else{
			System.out.println("Invalid Input");
			System.exit(1);
		}
	}
}
