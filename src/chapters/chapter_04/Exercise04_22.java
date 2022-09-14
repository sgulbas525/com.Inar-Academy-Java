import java.util.Scanner;

public class Exercise04_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter s1: ");
        String s1 = input.next();
        System.out.print("Enter s2: ");
        String s2 = input.next();

        if(s1.indexOf(s2) > 0 )
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);

    }

}
