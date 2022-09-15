package Checkpoints05;

public class Checkpoint05_16_17_18 {
    public static void main(String[] args) {
        //Checkpoint05_16
        int i = 1;
        for (int sum = 0; sum < 1000; sum += i) {
            i++;
        }
        System.out.println("\n\n\n");

        //Checkpoint05_17
        int sum1 = 0;
        for (int i1 = 0; i < 10; i1++)
        sum1 += i1;

        int j = 5;
        if (i < j)
            System.out.println(i);
        else
            System.out.println(j);

         while (j < 10);
         {
             j++;
             }

         do {
             j++;
            } while (j < 10);
        System.out.println("\n\n\n");



        //Checkpoint05_18
        //     A
        int x = 0;
        do {
            System.out.println(x + 4);
        x++;
        }while (x < 10);
        System.out.println("\n");

        //    B
        for (int z = 0; z<10; z++)
            System.out.println(z + 4);
    }
}
