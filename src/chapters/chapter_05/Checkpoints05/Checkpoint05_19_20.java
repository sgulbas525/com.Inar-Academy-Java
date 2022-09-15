package Checkpoints05;

public class Checkpoint05_19_20 {
    public static void main(String[] args) {

        //Checkpoint05_19
        int count = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++) {
                System.out.println(i * j);
                count++;
            }
        System.out.println(count + " times\n\n\n\n\n");


        //Checkpoint05_20
        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
        }
        System.out.println("\n\n");


        int m = 0;
        while (m < 5) {
            for (int j = m; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            m++;
        }
        System.out.println("\n\n");


        int b = 5;
        while (b >= 1) {
            int num = 1;
            for (int j = 1; j <= b; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }
            System.out.println();
            b--;
        }
        System.out.println("\n\n");


        int g = 1;
        do {
            int num = 1;
            for (int j = 1; j <= g; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            g++;
        } while (g <= 5);

    }
}