package chapters.chapter_03;

import java.util.Scanner;

public class Exercise03_01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double r = Math.pow(b, 2) - 4 * a * c;
		double r1 = (-b + Math.pow(r, 0.5)) / 2;
		double r2 = (-b - Math.pow(r,0.5)) / 2;
		
		if(r > 0)
		System.out.println("The equation has two roots " + r1 + " and " + r2);
		if(r == 0)
		System.out.println("The equation has a root " + r1);
		if(r < 0)
		System.out.println("The equation has no real root");
	}
}
