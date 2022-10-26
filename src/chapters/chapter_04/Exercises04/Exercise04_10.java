package chapters.chapter_04.Exercises04;

import java.util.Scanner;
public class Exercise04_10 {
    public static void main(String[] args) {
        String set1 =
                "1   3   5   7  \n" +
                        "9   11  13  15 \n" +
                        "17  19  21  23 \n" +
                        "25  27  29  31 ";

        String set2 =
                "2   3   6   7  \n" +
                        "10  11  14  15 \n" +
                        "18  19  22  23 \n" +
                        "26  27  30  31 ";

        String set3 =
                "4   5   6   7  \n" +
                        "12  13  14  15 \n" +
                        "20  21  22  23 \n" +
                        "28  29  30  31 ";

        String set4 =
                "8   9   10  11 \n" +
                        "12  13  14  15 \n" +
                        "24  25  26  27 \n" +
                        "28  29  30  31 ";

        String set5 =
                "16  17  18  19 \n" +
                        "20  21  22  23 \n" +
                        "24  25  26  27 \n" +
                        "28  29  30  31 ";

        int day = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Is your birthday in set1? \n");
        System.out.println(set1 + "\n");
        System.out.println("Enter 'N' for no , 'Y' for yes");
        String ans1 = input.next();

        if (ans1.equalsIgnoreCase("n")) {
            day += 0;
        } else if (ans1.equalsIgnoreCase("y")) {
            day += 1;
        } else {
            System.err.println("The input is invalid");
            System.exit(0);
        }


        System.out.println("Is your birthday in set2? \n");
        System.out.println(set2 + "\n");
        System.out.println("Enter 'N' for no , 'Y' for yes");
        String ans2 = input.next();

        if (ans2.equalsIgnoreCase("n")) {
            day += 0;
        } else if (ans2.equalsIgnoreCase("y")) {
            day += 2;
        } else {
            System.err.println("The input is invalid");
            System.exit(1);
        }


        System.out.println("Is your birthday in set3? \n");
        System.out.println(set3 + "\n");
        System.out.println("Enter 'N' for no , 'Y' for yes");
        String ans3 = input.next();

        if (ans3.equalsIgnoreCase("n")) {
            day += 0;
        } else if (ans3.equalsIgnoreCase("y")) {
            day += 4;
        } else {
            System.err.println("The input is invalid");
            System.exit(2);
        }


        System.out.println("Is your birthday in set4? \n");
        System.out.println(set4 + "\n");
        System.out.println("Enter 'N' for no , 'Y' for yes");
        String ans4 = input.next();

        if (ans4.equalsIgnoreCase("n")) {
            day += 0;
        } else if (ans4.equalsIgnoreCase("y")) {
            day += 8;
        } else {
            System.err.println("The input is invalid");
            System.exit(3);
        }


        System.out.println("Is your birthday in set5? \n");
        System.out.println(set5 + "\n");
        System.out.println("Enter 'N' for no , 'Y' for yes");
        String ans5 = input.next();

        if (ans5.equalsIgnoreCase("n")) {
            day += 0;
        } else if (ans5.equalsIgnoreCase("y")) {
            day += 16;
        } else {
            System.err.println("The input is invalid");
            System.exit(0);
        }


        System.out.println("Your birthday is " + day + "!");
    }
}