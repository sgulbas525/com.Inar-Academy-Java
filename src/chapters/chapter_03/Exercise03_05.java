package chapters.chapter_03;


import java.util.Scanner;

public class Exercise03_05 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		
		System.out.print("Enter the number of adds elapsed since today: ");
		int elapsedDays = input.nextInt();

		System.out.print("Today is ");
		switch(today){
		case 1 : System.out.print("Monday "); break;
		case 2 : System.out.print("Tuesday "); break;
	   	case 3 : System.out.print("Wednesday "); break;
	     	case 4 : System.out.print("Thursday "); break;
	       	case 5 : System.out.print("Friday "); break;
		case 6 : System.out.print("Saturday "); break;
		case 0 : System.out.print("Sunday "); break;
		default : System.out.println("Invalid day"); System.exit(1);
		}
		
		System.out.print("and the future day is ");
		switch((today + elapsedDays) & 7 ){
                case 1 : System.out.println("Monday "); break;
                case 2 : System.out.println("Tuesday "); break;
                case 3 : System.out.println("Wednesday "); break;
                case 4 : System.out.println("Thursday "); break;
                case 5 : System.out.println("Friday "); break;
                case 6 : System.out.println("Saturday "); break;
                case 0 : System.out.println("Sunday "); break;
		}
	}
}

