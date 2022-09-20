package chapters.chapter_03.Checkpoints03;

import java.util.Scanner;

public class Checkpoint03_32 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a day (0->Sunday, 1->Monday, 2->Tuesday...): ");
		int day = input.nextInt();

		System.out.print("Today is ");
		switch(day){
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tueday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
		}
	}
}
