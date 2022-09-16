import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of lines: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--)
                System.out.printf("%3s", "");

            for (int j = i; j > 0; j--)
                System.out.printf("%3d", j);

            for (int j = 2; j <= i; j++)
                System.out.printf("%3d", j);

            System.out.println();

        }

    }
}
