package chapters.chapter_03;

import java.util.Scanner;

public class Exercise03_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.print("Enter the month 1-12 : ");
        int month = input.nextInt();
        System.out.print("Enter th day of the month 1-31 : ");
        int day = input.nextInt();
        if(month == 1 || month == 2){
            month += 12;
            year -= 1;
        }

        if(month == 13 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day > 31 || day < 1){
                System.out.println("Invalid day");
                System.exit(1);
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 30 || day < 1){
                System.out.println("Invalid day");
                System.exit(2);
            }			}
        else if(month == 14){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){								if(day > 29 || day < 1){
                System.out.println("Invalid day:");
                System.exit(3);
            }
            }
            else{
                if(day > 28 || day < 1){
                    System.out.println("Invalid day:");
                    System.exit(4);
                }
            }
        }
        else{
            System.out.println("Invalid month");
            System.exit(5);
        }

        int h = (day +((26 * (month + 1)) / 10) + (year % 100) + (year % 100 / 4) + (year / 100 + 1) / 4 + (5 *(year / 100 + 1))) % 7;

        System.out.print("Day of the week is ");
        switch(h){

            case 0 : System.out.println("Sunday"); break;
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wednesday"); break;
            case 4 : System.out.println("Thursday"); break;
            case 5 : System.out.println("Friday"); break;
            case 6 : System.out.println("Saturday"); break;

        }
    }
}