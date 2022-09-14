import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.next();

        if (s.length() == 2) {
            if (s.toUpperCase().charAt(0) == 'M')
                System.out.print("Mathematics ");
            else if (s.toUpperCase().charAt(0) == 'C')
                System.out.print("Computer Science ");
            else if (s.toUpperCase().charAt(0) == 'I')
                System.out.print("Information Technology ");
            else {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        else {
            System.out.println("Invalid input");
            System.exit(1);
        }

        switch (s.charAt(1)){
            case 1 :
                System.out.println(" Freshman"); break;
            case 2 :
                System.out.println(" Sophomore"); break;
            case 3 :
                System.out.println(" Junior"); break;
            case 4 :
                System.out.println(" Senior"); break;
            default:
                System.out.println(s.charAt(1) + ("Invalid grade for students"));

        }
    }
}
