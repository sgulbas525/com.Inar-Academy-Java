package chapters.chapter_10.Exercises10;

public class Exercise10_01 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);

        displayTimeObject(t1);
        displayTimeObject(t2);
    }

    public static void displayTimeObject(Time t) {

        System.out.println((t.getHour() < 10? "0" + t.getHour() : t.getHour()) + ":" +
                (t.getMinute() < 10 ? "0" + t.getMinute() : t.getMinute()) + ":" +
                (t.getSecond() < 10 ? "0" + t.getSecond() : t.getSecond()));
    }


}


class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        this((int) (elapsedTime / (60 * 60 * 1000) % 24), (int) (elapsedTime / (60 * 1000) % 60),
                (int) (elapsedTime / 1000 % 60));
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        hour = (int) (elapsedTime / 60 * 60 * 1000 % 24);
        minute = (int) (elapsedTime / 60 * 1000 % 60);
        second = (int) (elapsedTime / 1000 % 60);

    }
}