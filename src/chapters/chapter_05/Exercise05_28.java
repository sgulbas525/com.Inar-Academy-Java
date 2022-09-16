import java.util.Scanner;

public class Exercise05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of " + year + "(0-Sunday, 1-Monday...): ");
        int day = input.nextInt();

        for (int m = 0; m < 12; m++) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)
                day += 31;
            else if (m == 4 || m == 6 || m == 9 || m == 11)
                day += 30;
            else {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    day += 29;
                else
                    day += 28;
            }
            switch (m) {
                case 0:
                    System.out.print("January 1, " + year + " is");
                    break;
                case 1:
                    System.out.print("February 1, " + year + " is");
                    break;
                case 2:
                    System.out.print("March 1, " + year + " is");
                    break;
                case 3:
                    System.out.print("April 1, " + year + " is");
                    break;
                case 4:
                    System.out.print("May 1, " + year + " is");
                    break;
                case 5:
                    System.out.print("June 1, " + year + " is");
                    break;
                case 6:
                    System.out.print("July 1, " + year + " is");
                    break;
                case 7:
                    System.out.print("August 1, " + year + " is");
                    break;
                case 8:
                    System.out.print("September 1, " + year + " is");
                    break;
                case 9:
                    System.out.print("October 1, " + year + " is");
                    break;
                case 10:
                    System.out.print("November 1, " + year + " is");
                    break;
                case 11:
                    System.out.print("December 1, " + year + " is");
                    break;
            }
            switch (day % 7) {
                case 0:
                    System.out.println(" Sunday");
                    break;
                case 1:
                    System.out.println(" Monday");
                    break;
                case 2:
                    System.out.println(" Tuesday");
                    break;
                case 3:
                    System.out.println(" Wednesday");
                    break;
                case 4:
                    System.out.println(" Thursday");
                    break;
                case 5:
                    System.out.println(" Friday");
                    break;
                case 6:
                    System.out.println(" Saturday");
                    break;
            }
        }

    }
}
