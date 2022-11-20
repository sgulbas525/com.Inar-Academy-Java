package weeks.week_15.Exception;

import java.util.Scanner;

public class FinallyExample {

    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        div();

    }

    private static void div(){
        System.out.println("Please enter two digits to calculate n1 / n2 ?");

        try{
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
            System.out.println("This is the last statement in Inar");
        }catch (ArithmeticException arithmeticException){
            System.out.println("Exception - ArithmeticException is handled with try - catch");
        }finally {
            System.out.println("This line is from finally");
        }
    }
}
