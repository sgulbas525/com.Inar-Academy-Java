package Checkpoints03;

public class Checkpoint03_35 {
	public static void main(String[] args) {
		int score;
		int scale = 150;
		int x = 10;

		if (x > 10)
			score = scale * 3;
		else
			score = scale * 4;


		double income = 50000;

		if (income > 100000)
			income *= 0.2;
		else
			income *= 0.17 + 1000;


		int number = 954782;
		int i,j;
		 i = j = 15;
		if (number % 3 == 0)
			System.out.println(i);
		else
			System.out.println(j);
	}
}