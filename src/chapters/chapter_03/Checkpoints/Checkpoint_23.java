import java.util.Scanner;

public class Checkpoint_23{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter number for x : ");
                int x = input.nextInt();

                System.out.print("x >= 50 && x <= 100 is " + (x >= 50 && x <= 100));
        }
}
