import java.util.Scanner;

public class Exercise04_04 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a side: ");
        double s = input.nextDouble();

        double area =  (6 * Math.pow( s, 2)) /  (4 * Math.tan( Math.PI/ 6) ) ;

        System.out.println("The area of hexagon is " + Math.round( area * 100) / 100.0);


    }
}
