import java.util.Scanner;

public class Checkpoint03_28 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter a weight in pounds: ");
                int weight = input.nextInt();
                System.out.print("Enter a height in inches: ");
                int height = input.nextInt();

                System.out.println((weight > 50) ^ (height > 60));
        }
}

