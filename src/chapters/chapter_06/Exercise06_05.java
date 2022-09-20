import java.util.Scanner;

public class Exercise06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        displaySortedNumbers(n1, n2, n3);
    }

    public static void displaySortedNumbers(int num1, int num2, int num3) {
        if (num2 > num3) {
            num2 = num2 - num3;
            num3 = num2 + num3;
            num2 = num3 - num2;
        }

        if (num1 > num2) {
            num1 = num1 - num2;
            num2 = num1 + num2;
            num1 = num2 - num1;
        }

        if (num2 > num3) {
            num2 = num2 - num3;
            num3 = num2 + num3;
            num2 = num3 - num2;
        }

        System.out.println(num1 + " < " + num2 + " < " + num3);
    }
}
