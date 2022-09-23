package chapters.chapter_06;

public class Exercise06_30 {
    /**
     * roll two dices
     * SUM = 2 || 3 || 12  LOST
     * SUM = 7 || 11 WON
     * ELSE
     * roll two dice
     * SUM = 7   LOST
     * SUM = FIRST SUM
     * ELSE
     * LOOP THE FIRST ELSE SITUATION
     */

    public static void main(String[] args) {
        while (true) {
            int play = rollDice();
            if (play == 11 || play == 7) {
                System.out.println("  You win\n\n");
                break;
            } else if (play == 2 || play == 3 || play == 12) {
                System.out.println("  You lose\n\n");
                break;
            } else {
                int point = play;
                System.out.println("Point is " + point);
                while (true) {
                    play = rollDice();
                    if (play == point) {
                        System.out.print("You win\n\n");
                        break;
                    } else if (play == 7) {
                        System.out.print("You lose\n\n");
                        break;
                    }
                }
                break;
            }
        }
    }

    public static int rollDice() {

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        System.out.print("You roll " + dice1 + " + " + dice2 + " = " + (dice1+dice2) + "\n");
        return dice1 + dice2;
    }
}