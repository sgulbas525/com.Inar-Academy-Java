package chapters.chapter_02.Checkpoints02;

public class Checkpoint02_09{
	public static void main(String[] args){
//Declare a double variable named miles with initial value 100
double miles = 100;

//Declare a double constant named KILOMETERS_PER_MILE with value 1.609
final double KILOMETERS_PER_MILE =1.609;

//Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE. and assign the result to kilometers
double kilometers = miles * KILOMETERS_PER_MILE;

//Display kilometers to the console
System.out.print(kilometers);
	}
}

