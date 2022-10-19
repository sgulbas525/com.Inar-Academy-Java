package weeks.week_09;

import java.util.Scanner;

public class IsUniqueWithArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string value :");
        String s = input.nextLine();
        boolean result = isUnique(s);
        System.out.println(result);

    }

    public static boolean isUnique(String s) {
        int counter = 0;
        boolean[] myAsciiTable = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            counter++;
            if (myAsciiTable[index]) {
                System.out.println("This is the step number :" + counter);
                return false;
            } else {
                myAsciiTable[index] = true;
            }
        }
        System.out.println("This is the step number :" + counter);
        return true;

    }
}