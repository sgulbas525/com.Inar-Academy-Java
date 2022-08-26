import java.util.Scanner;

public class Exercise_17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int pc = (int)(Math.random()*3);

		System.out.print("Enter a number for scissor(0), rock(1), paper(2) : ");
		int player = input.nextInt();
		if(player > 3){
			System.out.println("Invalid input");
			System.exit(1);
		}	


		if(pc == 0){
			System.out.print("The computer is scissor and you are ");
			if(player == 2)
				System.out.println("paper. You lost.");
			else if(player == 1)
				System.out.println("rock. You won.");
			else
				System.out.println("scissor. It's draw.");
			}
		
		else if(pc == 1){
			System.out.print("The computer is rock and you are ");
			if(player == 0)
				System.out.println("scissor. You lost.");
			else if(player == 2)
				System.out.println("paper. You won.");
			else
				System.out.println("rock. It's draw.");
		}
		else{
			System.out.print("The computer is paper you are ");
			if(player == 0 )
				System.out.println("scissor. You won.");
			else if(player == 1 )
				System.out.println("rock. You lost.");
			else
				System.out.println("paper. It's draw.");
		}

	}
}
