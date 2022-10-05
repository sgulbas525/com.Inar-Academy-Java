package chapters.chapter_08;

public class Exercise08_03 {
    public static void main(String[] args) {

        char[][] answers = getChars();
        // Key to the questions
        char[] keys = getKeys();

        int[] scoresInIncreasingOrder = getTheScores(answers, keys);

        displayScores(scoresInIncreasingOrder);
    }

    // Evaluate student's answers
    public static int[] getTheScores(char[][] answers, char[] keys) {
        int[] sortedScores = new int[answers.length];

        for (int students = 0; students < answers.length; students++) {
            int correctCount = 0;
            for (int answer = 0; answer < answers[students].length; answer++) {
                //Counts the correct number for students student
                if (answers[students][answer] == keys[answer]) {
                    correctCount++;
                }
            }
            sortScores(correctCount, sortedScores, students);
        }
        return sortedScores;
    }

    public static void displayScores(int[] scoresInIncreasingOrder) {
        for (int i = 0; i < scoresInIncreasingOrder.length; i++) {
            System.out.println(scoresInIncreasingOrder[i]);
        }
    }


    // For each student we rearrange the scoreboard
    public static void sortScores(int correctCount, int[] sortedScores, int limit) {
        sortedScores[limit] = correctCount;
        int minScore;
        int minScoresIndex;

        for (int i = 0; i < limit; i++) {
            minScore = sortedScores[i];
            minScoresIndex = i;

            for (int j = i + 1; j <= limit; j++) {
                if (minScore > sortedScores[j]) {
                    minScoresIndex = j;
                    minScore = sortedScores[j];
                }
            }

            if (minScoresIndex != i) {
                sortedScores[minScoresIndex] = sortedScores[i];
                sortedScores[i] = minScore;
            }
        }
    }

    // Answer key
    public static char[] getKeys() {
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        return keys;
    }

    // Students answers
    public static char[][] getChars() {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        return answers;
    }
}
