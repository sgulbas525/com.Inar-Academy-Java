package chapters.chapter_07.Checkpoints07;

public class Checkpoint07_12 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs" };
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        //Initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        //Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            //Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        /** INSTEAD OF THIS, CODE THAT IS BELOW THIS
         //Display the first four cards
         for (int i = 0; i < 4; i++) {
             String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " +
            rank + " of " + suit);
         }*/

        //It'll pick four random cards
        for (int i = 0; i < 4; i++) {
            int cardNumber = (int) (Math.random() * deck.length);
            String suit = suits[cardNumber / 13];
            String rank = ranks[cardNumber % 13];
            System.out.println("Card number " + cardNumber + ": "
                    + rank + " of " + suit);
        }
    }
}
