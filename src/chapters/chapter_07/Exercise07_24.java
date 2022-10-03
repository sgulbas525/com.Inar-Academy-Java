package chapters.chapter_07;

public class Exercise07_24 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int[] myPick = new int[4];
        int countPick = 0;

        for (int i = 0; i < myPick.length; i++) {
            while (true) {
                pickCard(myPick, i);
                countPick++;// Count total pick
                if (isValid(myPick, i)) {
                    break;// if pick is valid
                }
            }
        }

        displayMineDeck(myPick, countPick);
    }

    public static boolean isValid(int[] myPick, int i) {
        for (int j = 0; j < i; j++) {
          // Compares the last pick with the card that we already picked
            if ((myPick[j] / 13) == (myPick[i] / 13)){
                return false;
            }
        }
        return true;
    }

    public static void displayMineDeck(int[] myPick, int countPick) {
        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        System.out.println("Total Pick: " + countPick);

        for (int i = 0; i < myPick.length ; i++) {
            System.out.println(ranks[myPick[i] % 13] + " of " + suits[myPick[i] / 13]);
        }
    }


    public static void pickCard(int[] myDeck, int i) {
        myDeck[i] = (int)(Math.random() * 52);
    }
}
