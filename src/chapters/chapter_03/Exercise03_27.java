package chapters.chapter_03;

import java.util.Scanner;
 
public class Exercise03_27 {
 	public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
 
  	System.out.print("Enter a point's x- and y-coordinates: ");
  	double x = input.nextDouble();
  	double y = input.nextDouble();
 	 	
 	
	System.out.print("The point is ");
 	
	if( (y > 0) && (x > 0) && (x + 2*y < 200) ){
	}
  	else{
    		System.out.print("not ");
	}
 
  	System.out.print("in the triangle");
	}
 }
