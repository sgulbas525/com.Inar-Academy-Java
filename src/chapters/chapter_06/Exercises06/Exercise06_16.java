package chapters.chapter_06.Exercises06;

public class Exercise06_16 {
    public static void main(String[] args) {
         for (int i = 2000; i <= 2020; i++)
             System.out.println(i + " has " + numberOfDaysInAYear(i) + " days.");
    }

    public static int numberOfDaysInAYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 366 : 365;
    }
}
