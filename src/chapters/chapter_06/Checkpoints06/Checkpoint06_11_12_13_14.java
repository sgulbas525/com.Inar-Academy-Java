package Checkpoints06;

public class Checkpoint06_11_12_13_14 {
    public static void main(String[] args) {
        // Checkpoint06_11

        //Checkpoint06_12

        nPrintln(5, "Welcome to Java");

        //Checkpoint06_13
        //A
        int max = 0;
        max1(1, 2, max);
        System.out.println(max);


        //B
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }

        //C
        // Initialize times
        int times = 3;
        System.out.println("Before the call," + " variable times is " + times);

        nPrintln("Welcome to Java!", times);
        System.out.println("After the call," + " variable times is " + times);


        //D
        int v = 0;
        while (v <= 4) {
            method1(v);
            v++;
        }
        System.out.println("v is " + v);

    }

    //Checkpoint06_12
    public static void nPrintln(int n, String message) {
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }

    //Checkpoint06_13
    //A
    public static void max1(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
    }

    //B
    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    //C
    public static void nPrintln(String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n + " ");
            System.out.println(message);
            n--;
        }
    }


    //D
    public static void method1(int i) {
        do {
            if (i % 3 != 0)
                System.out.print("i is " + i);
            i--;
        } while (i >= 1);

        System.out.println();

    }
}
