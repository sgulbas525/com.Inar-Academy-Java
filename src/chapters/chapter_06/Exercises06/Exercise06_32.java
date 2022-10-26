package chapters.chapter_06.Exercises06;

public class Exercise06_32 {
    public static void main(String[] args) {
        int countWinnings = 0;
        for (int i = 0; i < 10_000; i++) {
            while (true) {
                int play = Exercise06_30.rollDice();
                if (play == 11 || play == 7) {
                    System.out.println("  You win\n\n");
                    countWinnings++;
                    break;
                } else if (play == 2 || play == 3 || play == 12) {
                    System.out.println("  You lose\n\n");
                    break;
                } else {
                    int point = play;
                    System.out.println("Point is " + point);
                    while (true) {
                        play = Exercise06_30.rollDice();
                        if (play == point) {
                            System.out.print(" You win\n\n");
                            countWinnings++;
                            break;
                        } else if (play == 7) {
                            System.out.print(" You lose\n");
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("\nYou won " + countWinnings + " times!");
    }
}
