package chapters.chapter_05.Checkpoints05;

public class Checkpoint05_24_25_26_27 {
    public static void main(String[] args) {
        //Checkpoint05_24
        //A
        int balance = 10;
        while (true) {
            if (balance < 9)
                break;
            balance = balance - 9;
        }
        System.out.println("Balance is " + balance);
        System.out.println("\n");

            /*B
        int balance1 = 10;
        while (true) {
            if (balance1 < 9)
                continue;
            balance1 = balance1 - 9;
        }
        System.out.println("Balance is " + balance1);
        CAN NOT REACH THE DISPLAYING COMMENT CUZ WHILE IS AN INFINITE LOOP*/

        //Checkpoint05_25
        int i = 0, sum = 0;
        while (i < 4) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }


        //Checkpoint05_26
        //TestBreak
        int sumB = 0;
        int numberB = 0;

        while (sumB >= 100) {
            numberB++;
            sum += numberB;
        }

        System.out.println("The number is " + numberB);
        System.out.println("The sum is " + sumB);
        System.out.println("\n");

        //TestContinue
        int sumC = 0;
        int numberC = 0;

        while (numberC < 20) {
            numberC++;
            if (numberC != 10 || numberC != 11)
                sum += numberC;
        }

        System.out.println("The sum is " + sumC);
        System.out.println("\n\n\n");

        //Checkpoint05_27
        //A
        for (int w = 1; w < 4; w++) {
            for (int j = 1; j < 4; j++) {
                if (w * j > 2)
                    break;
                System.out.println(w * j);
            }
            System.out.println(w);
        }
        System.out.println("\n\n");

        //B
        for (int s = 1; s < 4; s++) {
            for (int j = s; j < 4; j++) {
                if (s * j > 2)
                    continue;
                System.out.println(s * j);
            }
            System.out.println(s);
        }
    }
}