package chapters.chapter_03;

import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int coin = (int)(Math.random()*2);

		System.out.print("Heads(0) or Tails(1) ? ");
		int guess = input.nextInt();

		if(coin == guess)
			System.out.println("You are correct");
		else
			System.out.println("You are incorrect. Try again pls");
	}
}
