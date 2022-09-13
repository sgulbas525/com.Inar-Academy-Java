import java.util.Scanner;

public class Exercise03_28 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);



		System.out.print("Enter the x,y of the center of a rectangle, and its w & h (2.5 4 2.5 43): ");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1w = input.nextDouble();
		double r1h = input.nextDouble();
	
		System.out.print("Enter the same information for a 2nd rectangle (1.5 5 0.5 3): ");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2w = input.nextDouble();
		double r2h = input.nextDouble();
		
		double r1leftEdge = r1x - r1w / 2;
		double r1rightEdge = r1x + r1w / 2;
		double r1bottomEdge = r1y - r1h / 2;
		double r1topEdge = r1y + r1h / 2;
	
		double r2leftEdge = r2x - r2w / 2;
		double r2rightEdge = r2x + r2w / 2;
		double r2bottomEdge = r2y - r2h / 2;
		double r2topEdge = r2y + r2h / 2;
		
	
		if(r2leftEdge >= r1leftEdge && r2rightEdge <= r1rightEdge && r2bottomEdge >= r1bottomEdge && r2topEdge <= r1topEdge) {
			System.out.println("r2 is inside r1");
		}
		else if (r2leftEdge > r1rightEdge || r2rightEdge < r1leftEdge || r2bottomEdge > r1topEdge || r2topEdge < r1bottomEdge) {
			System.out.println("r2 does not overlap r1");
		} 
		else {
			System.out.println("r2 overlaps r1");
		}		
	}
}
