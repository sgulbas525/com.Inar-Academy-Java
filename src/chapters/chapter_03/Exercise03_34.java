import java.util.Scanner;

public class Exercise03_34 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("ENter three points for p1, p2, p3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
                double y2 = input.nextDouble();
		double x3 = input.nextDouble();
                double y3 = input.nextDouble();

		System.out.print("(" + x3 + ", " + y3 +") is ");
		
		if((x3 > x1 && x3 < x2) && (y3 > y1 && y3 < y2))
			System.out.print("");
		else
			System.out.print("not");

		System.out.println(" on the line segment from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
	}
}

