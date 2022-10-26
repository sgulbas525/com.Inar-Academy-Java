package chapters.chapter_09.Exercises09;

import chapters.chapter_07.Listings07.Listing07_08_SelectionSort;


public class Exercise09_06 {
    public static void main(String[] args) {
        int[] arr = createAndFillArray();
        durationOfSelectionSort(arr);
    }

    public static void durationOfSelectionSort(int[] arr) {
        Stopwatch sort = new Stopwatch();

        sort.start();
        Listing07_08_SelectionSort.selectionSort(arr);
        sort.stop();

        System.out.println("Selection sort takes " + sort.elapsedTime() + " milliseconds");

    }

    public static int[] createAndFillArray() {
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return arr;
    }
}

class Stopwatch {
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
