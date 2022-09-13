import java.util.Scanner;
public class Exercise04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String s = input.next().toUpperCase();

        if(s.length() > 1){
            System.out.println(s +" is an invalid input");
            System.exit(0);
        }
        char ch = s.charAt(0);
        int number;
        if(Character.isLetter(ch))
            number = (ch - 'A') + 10;
        else
            number = (ch -'0');


        String binaryValue = "";
        binaryValue =number % 2 + binaryValue ;
        number /= 2;
        binaryValue =number % 2 + binaryValue ;
        number /= 2;
        binaryValue =number % 2 +binaryValue  ;
        number /= 2;
        binaryValue = number % 2 + binaryValue ;

        System.out.println("The binary value is " + binaryValue);

    }
}
