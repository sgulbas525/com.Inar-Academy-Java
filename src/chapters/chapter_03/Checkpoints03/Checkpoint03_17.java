package Checkpoints03;

import java.util.Scanner;

public class Checkpoint03_17 {
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter an income: ");
                int income = input.nextInt();
		double tax = 0;

		if (income <= 10000)
			tax = income * 0.1;
		else if (income <= 20000)
			tax = 1000 + (income - 10000) * 0.15 ;

		System.out.print(tax + " ----- ");


		if (income <= 10000)
			tax = income * 0.1;
		else if (income > 10000 && income <= 20000)
			tax = 1000 + (income - 10000) * 0.15 ;
		
		System.out.println(tax);
	}
}
