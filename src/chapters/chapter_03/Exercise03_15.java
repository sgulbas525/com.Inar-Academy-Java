import java.util.Scanner;

public class Exercise03_15 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int lottery = (int)(Math.random() * 900) + 100;

		System.out.print("Enter your guess : ");
		int guess = input.nextInt();
		
		int l1 = lottery % 10;
		int l2 = lottery % 100 / 10;
		int l3 = lottery / 100;

		int g1 = guess % 10;
		int g2 = guess % 100 / 10;
		int g3 = guess / 100;

		 if(guess == lottery){
                        System.out.println("Congrats. You won 10,000");
                 }else if(((l1 == g1) || (l1 == g2) || (l1 ==g3)) && ((l2 == g1) || (l2 == g2) || (l2 == g3)) && ((l3 == g1) || (l3 == g2) || (l3 == g3)) && ((l1 + l2 + l3 == g1 + g2 + g3))){
			 System.out.println("Conigrats. You won 3,000");
		}else if(((l1 == g1) || (l1 == g2) || (l1 == g3)) || ((l2 == g1) || (l2 == g2) || (l2 == g3)) || ((l3 == g1) || (l3 == g2) || (l3 == g3))){
			 System.out.println("Congrats. You won 1,000");
		}else{
			System.out.println("Sorry! No luck");
		}
	
		System.out.println("Lottery is: " + lottery);
		System.out.println("Your guess is: " + guess);
	}
}

