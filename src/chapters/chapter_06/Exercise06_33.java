package chapters.chapter_06;

public class Exercise06_33 {
    public static void main(String[] args) {

        System.out.print("Current date is ");
        showCurrentDate();
        showCurrentTime();
    }

    public static void showCurrentTime() {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + (currentHour) + ":" + ((currentMinute < 10) ? ("0" + currentMinute) : currentMinute) + ":" + ((currentSecond < 10) ? ("0" + currentSecond) : currentSecond) + " GMT");
    }

    public static void showCurrentDate() {
        System.out.println(((findToday(findLeftDays(takeTotalDays()), findTheYear(takeTotalDays())) < 10) ? ("0" + findToday(findLeftDays(takeTotalDays()), findTheYear(takeTotalDays()))) : findToday(findLeftDays(takeTotalDays()), findTheYear(takeTotalDays())))
                + "." + findMonth(findLeftDays(takeTotalDays()), findTheYear(takeTotalDays())) + "." + findTheYear(takeTotalDays()));

    }

    public static long takeTotalDays() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = (totalSeconds / 60);
        long totalHours = totalMinutes / 60;
        long totalDays = totalHours / 24;
        return totalDays;
    }

    public static int findTheYear(long totalDays) {
        int year = 1970;

        while (totalDays > 365) {
            if (isLeapYear(year)) {
                year++;
                totalDays -= 366;
            } else {
                year++;
                totalDays -= 365;
            }
        }
        return year;
    }

    public static int findLeftDays(long totalDays) {
        int year = 1970;

        while (totalDays > 365) {
            if (isLeapYear(year)) {
                totalDays -= 366;
            } else {
                totalDays -= 365;
            }
            year++;
        }
        return (int) totalDays;
    }

    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getNumberOfDaysInMonth(int year, int loop) {
        if (loop == 1 || loop == 3 || loop == 5 || loop == 7 || loop == 8 || loop == 10 || loop == 12) {
            return 31;
        }
        if (loop == 4 || loop == 6 || loop == 9 || loop == 11) {
            return 30;
        }

        if (loop == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }

    public static int findMonth(int leftDays, int year) {
        int monthCounter = 1;
        for (int i = 1; i < 13 && leftDays >= 30; i++) {
            int days = getNumberOfDaysInMonth(year, i);
            leftDays -= days;
            monthCounter++;
        }
        return monthCounter;
    }

    public static int findToday(int leftDays, int year) {
        for (int i = 1; i < 13 && leftDays >= 30; i++) {
            int days = getNumberOfDaysInMonth(year, i);
            leftDays -= days;
        }
        if (leftDays == 0) {
            return 1;
        } else {
            return leftDays + 1;
        }
    }
}