import java.util.Scanner;
public class Exercise04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Length of " + s + " is " + s.length() + " and the first character is " + s.charAt(0));
    }
}
