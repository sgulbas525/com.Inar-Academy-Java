package chapters.chapter_09.Checkpoints09;

import java.util.Date;

public class Checkpoint09_25_26 {
    public static void main(String[] args) {

        // Checkpoint09_25

        // A
        System.out.println("\n\nCheckpoint09_25-----A");
        int[] a = {1, 2};
        swapA(a[0], a[1]);
        System.out.println("a[0] = " + a[0]
                + " a[1] = " + a[1]);
        System.out.println("\n");

        // B
        System.out.println("Checkpoint09_25-----B");
        int[] b = {1, 2};
        swapB(b);
        System.out.println("b[0] = " + b[0]
                + " b[1] = " + b[1]);
        System.out.println("\n");

        // C
        System.out.println("Checkpoint09_25-----C");
        T t = new T();
        swapC(t);
        System.out.println("e1 = " + t.e1
                + " e2 = " + t.e2);
        System.out.println("\n");

        // D
        System.out.println("Checkpoint09_25-----D");
        T1 t1 = new T1();
        T1 t2 = new T1();
        System.out.println("t1's i = " +
                t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " +
                t2.i + " and j = " + t2.j);
        System.out.println("\n");




        // Checkpoint09_26

        //A
        System.out.println("Checkpoint09_26-----A");
        Date dateA = null;
        mA(dateA);
        System.out.println(dateA);
        System.out.println("\n");

        //B
        System.out.println("Checkpoint09_26-----B");
        Date dateB = new Date(1234567);
        mB(dateB);
        System.out.println(dateB.getTime());
        System.out.println("\n");

        //C
        System.out.println("Checkpoint09_26-----C");
        Date dateC = new Date(1234567);
        mC(dateC);
        System.out.println(dateC.getTime());
        System.out.println("\n");

        //D
        System.out.println("Checkpoint09_26-----D");
        Date dateD = new Date(1234567);
        mD(dateD);
        System.out.println(dateD.getTime());
        System.out.println("\n");
    }



    public static void swapA(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }


    public static void swapB(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }


    public static void swapC(T t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }


    public static void mA(Date date) {
        date = new Date();
    }


    public static void mB(Date date) {
        date = new Date(7654321);
    }


    public static void mC(Date date) {
        date.setTime(7654321);
    }


    public static void mD(Date date) {
        date = null;
    }
}


class T {
    int e1 = 1;
    int e2 = 2;
}


class T1 {
    static int i = 0;
    int j = 0;

    T1() {
        i++;
        j = 1;
    }
}