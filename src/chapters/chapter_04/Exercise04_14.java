
import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String s = input.next();

        if(s.length() > 1) {
            System.out.println(s + " id sn invalid input");
            System.exit(0);
        }

        char ch = s.toUpperCase().charAt(0);
        if(ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F')
            System.out.println("The numeric value for grade " + ch + " is " + (ch -'A' + 4));
        else
            System.out.println(ch + "is an invalid input");
    }
}
