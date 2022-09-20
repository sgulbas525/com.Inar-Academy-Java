package chapters.chapter_04;

import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        if (month.length() > 3 || (month.charAt(0) > 90 && month.charAt(0) < 65) ||
                !Character.isLetter(month.charAt(0)) || !Character.isLetter(month.charAt(0)) || !Character.isLetter(month.charAt(0)) ) {
            System.out.println(month + " is not a month");
            System.exit(0);
        }
        System.out.print(month + year + " has ");

        switch(month){
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println(month + " " + year + " has 31 days"); break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.println(month + " " + year + " has 30 days"); break;
            case "Feb":
                System.out.println(((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ?
                        month + " " + year + " has 28 days" : month + " " + year + " has 29 days"); break;
            default:
                System.out.println("Please don't make up a new month");


        }
    }
}
