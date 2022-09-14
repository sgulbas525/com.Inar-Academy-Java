package Checkpoints04;

import com.sun.deploy.uitoolkit.impl.awt.AWTAppletAdapter;

public class Checkpoint04_16_17_18_19_20 {
    public static void main(String[] args) {

        //Checkpoint04_16
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";
        System.out.println("s1 = " + s1 + "-------s2 = " + s2 + "---------s3 = " + s3);

        System.out.println(" s1 == s2" + s1 == s2);
        System.out.println(" ss == s3" + s2 == s3);
        System.out.println("s1.equals(s2)" + s1.equals(s2));
        System.out.println("s1.equals(s3)" + s1.equals(s3));
        System.out.println("s1.compareTo(s2)" + s1.compareTo(s2));
        System.out.println("s2.compareTo(s3)" + s2.compareTo(s3));
        System.out.println("s2.compareTo(s2)" + s2.compareTo(s2));
        System.out.println("s1.charAt(0)" + s1.charAt(0));
        System.out.println("s1.indexOf('j')" + s1.indexOf('j'));
        System.out.println("s1.indexOf(\"to\")" + s1.indexOf("to"));
        System.out.println("s1.lastIndexOf('a')" + s1.lastIndexOf('a'));
        System.out.println("s1.lastIndexOf(\"o\", 15)" + s1.lastIndexOf("o", 15));
        System.out.println("s1.length()" + s1.length());
        System.out.println("s1.substring(5)" + s1.substring(5));
        System.out.println("s1.substring(5, 11)" + s1.substring(5, 11));
        System.out.println("s1.startsWith(\"Wel\")" + s1.startsWith("Wel"));
        System.out.println("s1.endsWith(\"Java\")" + s1.endsWith("Java"));
        System.out.println("s1.toLowerCase()" + s1.toLowerCase());
        System.out.println("s1.toUpperCase()" + s1.toUpperCase());
        System.out.println("s1.concat(s2)" + s1.concat(s2));
        System.out.println("s1.contains(s2)" + s1.contains(s2));
        System.out.println("\"\\t Wel \\t\".trim()" + "\t Wel \t".trim());






        /*Checkpoint04_17
        s1 and s2 are two strings
        String s = "Welcome to Java";
        String s3 = s1 + s2;
        String s3 = s1 - s2;
        s1 == s2;
        s1.compareTo(s2);
        int i = s1.length();
        */






        //Checkpoint04_18
        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);



        //Checkpoint04_19
        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);



        //Checkpoint04_20
        String x1 = " Welcome ";
        String x2 = " welcome ";
        System.out.println("x1----------"+x1+"\nx2------------"+x2);
        System.out.println("x1.isequal(x2)-----"+x1.equals(x2));
        System.out.println("x1.isequalIgnoreCasw(x2)-----"+x1.equalsIgnoreCase(x2));
        System.out.println("x1.compareTo(x2)-------"+x1.compareTo(x2));
        System.out.println("x1.compareToIgnoreCase(x2)-------"+x1.compareToIgnoreCase(x2));
        System.out.println("x1.startsWith(AAA)----------"+x1.startsWith("AAA"));
        System.out.println("x1.endsWith(AAA)--------"+x1.endsWith("AAA"));
        System.out.println("x1.length()-------"+x1.length());
        System.out.println("x1.chatAt(0)-------"+x1.charAt(0));
        System.out.println("x1.concat(x2)-------"+x1.concat(x2));
        System.out.println("x1.substring(1)-----------"+x1.substring(1));
        System.out.println("x1.substring(1,4)---------"+x1.substring(1,4));
        System.out.println("x1.toLowerCase-------"+x1.toLowerCase());
        System.out.println("x1.toUpperCase()---------"+x1.toUpperCase());
        System.out.println("x1.trim()-----------"+x1.trim());
        System.out.println("x1.indexOf(\"e\"-------)"+x1.indexOf("e"));
        System.out.println("x1.lastIndexOf(\"abc\")--------"+x1.lastIndexOf("abc"));





















    }
}
