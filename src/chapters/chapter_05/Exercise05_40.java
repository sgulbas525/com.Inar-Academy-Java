package chapters.chapter_05;

public class Exercise05_40 {
    public static void main(String[] args) {
        int coin ;
        int countHeads = 0;
        int countTails = 0;

        for (int i = 0; i < 1000000; i++){
            coin = (int)(Math.random() * 2);

            if (coin == 1)
                countTails++;
            else
                countHeads++;
        }
        System.out.println(countTails + " times Tails and " + countHeads + " times Heads");
    }
}
