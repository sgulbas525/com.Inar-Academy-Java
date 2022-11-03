package chapters.chapter_10.Exercises10.E14;

import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;


    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        this(calendarForTime(elapsedTime).get(GregorianCalendar.YEAR),
                calendarForTime(elapsedTime).get(GregorianCalendar.MONTH),
                calendarForTime(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH));
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static GregorianCalendar calendarForTime(long elapsedTime) {
        GregorianCalendar g = new GregorianCalendar();
        g.setTimeInMillis(elapsedTime);
        return g;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar newDate = calendarForTime(elapsedTime);
        year = newDate.get(GregorianCalendar.YEAR);
        month = newDate.get(GregorianCalendar.MONTH);
        day = newDate.get(GregorianCalendar.DAY_OF_MONTH);
    }}
