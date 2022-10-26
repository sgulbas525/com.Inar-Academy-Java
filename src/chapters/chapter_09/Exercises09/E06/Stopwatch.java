package chapters.chapter_09.Exercises09.E06;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long elapsedTime() {
        return getEndTime() - getStartTime();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }
}
