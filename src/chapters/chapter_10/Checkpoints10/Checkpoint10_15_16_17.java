package chapters.chapter_10.Checkpoints10;

import java.util.Arrays;

public class Checkpoint10_15_16_17 {
    public static void main(String[] args) {

        // Checkpoint10_15

        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println("s1 == s2 -----> " + (s1 == s2));
        System.out.println("s1 == s3 -----> " + (s1 == s3));
        System.out.println("s1 == s4 -----> " + (s1 == s4));
        System.out.println("s1.equals(s3) -----> " + (s1.equals(s3)));
        System.out.println("s1.equals(s4) -----> " + (s1.equals(s4)));
        System.out.println("\"Welcome to Java\".replace(\"Java\", \" HTML\" --> " + "Welcome to Java".replace("Java", "HTML"));
        System.out.println("s1.replace('o', 'T') ---->" + s1.replace('o', 'T'));
        System.out.println("s1.replaceAll(\"o\", \"T\") --->" + s1.replaceAll("o", "T"));
        System.out.println("s1.replaceFirst(\"o\", \"T\") --->" + s1.replaceFirst("o", "T"));
        System.out.println("s1.toCharArray() --->" + Arrays.toString(s1.toCharArray()));
        System.out.println("\n");


        // Checkpoint10_16

        /* String s = "Welcome to Java"; is better, because it'll use less memory */





        // Checkpoint10_17

        String str1 = "Welcome to Java";
        String str2 = s1.replace("o", "abc");
        System.out.println(str1);
        System.out.println(str2);

    }
}
