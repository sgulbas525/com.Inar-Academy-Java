package chapters.chapter_07.Exercises07;

import java.util.Scanner;

public class Exercise07_33 {
    public static void main(String[] args) {
         int year = getTheYearFromUser();
         displayTheYearInChineseZodiac(year);
    }

    public static void displayTheYearInChineseZodiac(int year) {
        String[] chineseZodiac= {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger",
                "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        System.out.println("Year " + year + " is a " + chineseZodiac[year % 12] + " year");
    }

    public static int getTheYearFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        return year;
    }
}
