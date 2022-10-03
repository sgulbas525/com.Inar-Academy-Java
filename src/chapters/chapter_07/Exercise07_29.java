package chapters.chapter_07;

public class Exercise07_29 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {

        int[] minePicks = pickCards();
        displayMyPicks(minePicks);
    }

    public static int[] pickCards() {
        int sum = 0;
        int[] myPick = new int[4];

        while (sum != 24) {
            for (int i = 0; i < myPick.length; i++) {
                myPick[i] = (int) (Math.random() * 52);
            }
            sum = getSum(myPick);
        }
        return myPick;
    }

    public static int getSum(int[] myPick) {
        int sum = 0;
        for (int i = 0; i < myPick.length; i++) {
            sum += myPick[i] % 13 == 0 ? 13 : myPick[i] % 13;
        }
        return sum;
    }

    public static void displayMyPicks(int[] myPick) {
        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs"};
        String[] ranks = {"King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen"};

        for (int i = 0; i < myPick.length; i++) {
            System.out.println(ranks[myPick[i] % 13] + " of " + suits[myPick[i] / 13]);
        }
    }
}
