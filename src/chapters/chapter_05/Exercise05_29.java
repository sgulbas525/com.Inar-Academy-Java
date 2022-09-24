import java.util.Scanner;

public class Exercise05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of " + year + "(0-Sunday, 1-Monday...): ");
        int day = input.nextInt();
// 2    tuesday
        for (int m = 1; m < 13; m++) {
            day %= 7;
            switch (m) {
                case 1:
                    System.out.printf("%28s\n", "January " + year);
                    break;
                case 2:
                    System.out.printf("%28s\n", "February " + year);
                    break;
                case 3:
                    System.out.printf("%28s\n", "March " + year);
                    break;
                case 4:
                    System.out.printf("%28s\n", "April " + year);
                    break;
                case 5:
                    System.out.printf("%28s\n", "May " + year);
                    break;
                case 6:
                    System.out.printf("%28s\n", "June " + year);
                    break;
                case 7:
                    System.out.printf("%28s\n", "July " + year);
                    break;
                case 8:
                    System.out.printf("%28s\n", "August " + year);
                    break;
                case 9:
                    System.out.printf("%28s\n", "September " + year);
                    break;
                case 10:
                    System.out.printf("%28s\n", "October " + year);
                    break;
                case 11:
                    System.out.printf("%28s\n", "November " + year);
                    break;
                case 12:
                    System.out.printf("%28s\n", "December " + year);
                    break;
            }
            System.out.println("---------------------------------------------");
            System.out.printf("%7s%7s%7s%7s%7s%7s%7s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

            for (int d = 0; d < day; d++) {
                System.out.printf("%7s", " ");
            }

            /** 111   222  333  444 555 666 777
             *                              --- */

            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                for (int i = 1; i < 32; day++, i++) {
                    if (day % 7 == 6)
                        System.out.printf("%7d\n", i);
                    else
                        System.out.printf("%7d", i);
                }
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                for (int i = 1; i < 31; day++, i++) {
                    if (day % 7 == 6)
                        System.out.printf("%7d\n", i);
                    else
                        System.out.printf("%7d", i);
                }
            } else {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    for (int i = 1; i < 30; day++, i++) {
                        if (day % 7 == 6)
                            System.out.printf("%7d\n", i);
                        else
                            System.out.printf("%7d", i);
                    }
                } else {
                    for (int i = 1; i < 29; day++, i++) {
                        if (day % 7 == 6)
                            System.out.printf("%7d\n", i);
                        else
                            System.out.printf("%7d", i);
                    }
                }
            }
            System.out.printf("\n\n\n\n\n\n");
        }
    }
}

