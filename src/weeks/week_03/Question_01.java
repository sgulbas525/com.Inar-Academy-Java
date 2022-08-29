import java.util.Scanner;

public class Question_01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your salary and year of service: ");
		double salary = input.nextDouble();
		int years = input.nextInt();

		if(years > 5){
			System.out.println("Your bonus is $" + ( salary * 5 / 100));
		}else{
			System.out.println("You don't have bonus");
		}
	}
}

