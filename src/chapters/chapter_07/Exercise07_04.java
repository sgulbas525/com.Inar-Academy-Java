package chapters.chapter_07;

public class Exercise07_04 {
    public static void main(String[] args) {

        analyzeScore(1, 5, 79, 25, 15, 75, 68, -1);

    }

    public static void analyzeScore(double... scores) {
        int average = average(scores);
        int countAboveOrEqual = 0;
        int countBelow = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0)
                break;
            if (scores[i] >= average) {
                countAboveOrEqual++;
            } else {
                countBelow++;
            }
        }
        System.out.println("Number of scores that above or equal to the average:  " + countAboveOrEqual);
        System.out.println("Number of scores that below to the average:  " + countBelow);

    }

    public static int average(double[] scores) {
        int average;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 0) {
                sum += scores[i];
                count++;
            }
        }
        average = sum / count;
        System.out.println("The average is " + average);

        return average;
    }
}