import java.util.Scanner;

public class Exercise_11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter month as a number: ");
		int month = input.nextInt();
		System.out.print("Enter year: ");
		int year = input.nextInt();

		switch(month){
                        case 1 : System.out.print("January "); break;
                        case 2 : System.out.print("February "); break;
                        case 3 : System.out.print("March "); break;
                        case 4 : System.out.print("April "); break;
                        case 5 : System.out.print("May "); break;
                        case 6 : System.out.print("June "); break;
                        case 7 : System.out.print("July "); break;
                        case 8 : System.out.print("August "); break;
                        case 9 : System.out.print("September "); break;
                        case 10 : System.out.print("October "); break;
			case 11 : System.out.print("November "); break;
			case 12 : System.out.print("December "); break;
                        default : System.out.print("Invalid month"); System.exit(1);
                }


		System.out.print(year);

		switch(month){
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 : System.out.print(" had 31 days"); break;
			case 4 :
			case 6 :
			case 9 :
			case 11 : System.out.print(" had 30 days"); break;
			 
					}
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(" had 29 days");
		else
			System.out.println(" had 28 days");
	}
}
