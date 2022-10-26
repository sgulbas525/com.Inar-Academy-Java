package chapters.chapter_03.Exercises03;

import java.util.Scanner;

public class Exercise03_25 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1 ,y1 , x2, y2, x3, y3, x4 ,y4: ");
		double x1 = (int)(input.nextDouble()*100000) / 100000.0;
		double y1 = (int)(input.nextDouble()*100000) / 100000.0;
		double x2 = (int)(input.nextDouble()*100000) / 100000.0;
		double y2 = (int)(input.nextDouble()*100000) / 100000.0;
		double x3 = (int)(input.nextDouble()*100000) / 100000.0;
		double y3 = (int)(input.nextDouble()*100000) / 100000.0;
		double x4 = (int)(input.nextDouble()*100000) / 100000.0;
		double y4 = (int)(input.nextDouble()*100000) / 100000.0;

		double a = y1 - y2;
		double b = -(x1 - x2);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;


		if (a * d - b * c == 0) {
   			System.out.println("The two lines are parallel.");
   			System.exit(0);
 		 }

  		double x =(int)((e * d - b * f) / (a * d - b * c) * 10000) / 10000.0;
		double y =(int)((a * f - e * c) / (a * d - b * c) * 10000) / 10000.0;

		System.out.print("The intersecting point is at (" + x + ", " + y + ")");
 }
}
