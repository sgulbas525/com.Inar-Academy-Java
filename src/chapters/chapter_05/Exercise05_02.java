import java.util.Scanner;

public class Exercise05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        int n1, n2, answer;
        String output = "";

        for (int i = 0; i < 10; i++) {
            n1 = (int) (Math.random() * 15) + 1;
            n2 = (int) (Math.random() * 15) + 1;

            System.out.print(n1 + " + " + n2 + " ? ");
            answer = input.nextInt();

            if (answer == (n1 + n2))
                correctCount++;

            output += "\n" + n1 + " - " + n2 + " = " + answer +
                    ((n1 - n2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Your test last " + (testTime / 1000) + " seconds.\n" +
                "You have answered correctly " + correctCount + " question(s):\n" +
                output);
    }
}
