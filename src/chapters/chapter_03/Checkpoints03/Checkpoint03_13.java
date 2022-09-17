package Checkpoints03;

import java.util.Scanner;

public class Checkpoint03_13 {
        public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an age: ");
		int age = input.nextInt();
		
		if (age < 16)
			System.out.println("Cannot get a driver's license");
		else
		System.out.println("Can get a driver's license");
	}
}
