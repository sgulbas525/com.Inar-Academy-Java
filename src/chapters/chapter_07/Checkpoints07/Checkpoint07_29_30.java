package chapters.chapter_07.Checkpoints07;

public class Checkpoint07_29_30 {
    public static void main(String[] args) {

        //Checkpoint07_29
        /* public static void main(String[] args) can we replaced with belows--->
        * public static void main(String args[])------------> Yes, we can
        * public static void main(String[] x)---------------> Yes, we can
        */


        //Checkpoint07_30
        System.out.println("Number of strings is " + args.length);
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
         }
}
