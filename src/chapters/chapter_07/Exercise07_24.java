package chapters.chapter_07;

public class Exercise07_24 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int[] minePick = new int[4];
        int countPick = 0;

        for (int i = 0; i < minePick.length; i++) {
            while (true) {
                pickCard(minePick, i);
                countPick++;
                if (isValid(minePick, i)) {
                    break;
                }
            }
        }

        displayMineDeck(minePick, countPick);
    }

    public static boolean isValid(int[] minePick, int i) {
        for (int j = 0; j < i; j++) {
            if ((minePick[j] / 13) == (minePick[i] / 13)){
                return false;
            }
        }
        return true;
    }

    public static void displayMineDeck(int[] minePick, int countPick) {
        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        System.out.println("Total Pick: " + countPick);

        for (int i = 0; i < minePick.length ; i++) {
            System.out.println(ranks[minePick[i] % 13] + " of " + suits[minePick[i] / 13]);
        }
    }


    public static void pickCard(int[] mineDeck, int i) {
        mineDeck[i] = (int)(Math.random() * 52);
    }
}
