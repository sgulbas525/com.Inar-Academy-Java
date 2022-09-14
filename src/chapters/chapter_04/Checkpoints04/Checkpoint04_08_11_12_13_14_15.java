package Checkpoints04;

public class Checkpoint04_08_11_12_13_14_15 {
    public static void main(String[] args) {
        //Checkpoint04_08
        System.out.println((int)'1');
        System.out.println((int)'A');
        System.out.println((int) 'B');
        System.out.println((int)'a');
        System.out.println((int) 'b');
        System.out.println((char) 40);
        System.out.println((char) 59);
        System.out.println((char) 79);
        System.out.println((char) 85);
        System.out.println((char) 90);
        System.out.println((char) 0X40);
        System.out.println((char) 0X5A);
        System.out.println((char) 0X71);
        System.out.println((char) 0X72);
        System.out.println((char) 0X7A);






        //Checkpoint04_11
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;
        System.out.println("i = " + i + "/nj = "+ j + "/nk = " + k + "/nc = " + c);
























        //Checkpoint04_12
        char z = 'A';
        int x = (int)z;
        System.out.println("x = " + x);
        float f = 1000.34f;
        int q = (int)f;
        System.out.println("q = " + q);
        double d = 1000.34;
        int g = (int)d;
        System.out.println("g = " + g );
        int l = 97;
        char n = (char)l;
        System.out.println("n = " + n);












        //Checkpoint04_13
        char p = 'a';
        char o = 'c';
        System.out.println(++p);
        System.out.println(o++);
        System.out.println(p - o);














        //Checkpoint04_14
        System.out.println((char)((int)((Math.random() * 36) + 97)));















        //Checkpoint04_15
        System.out.println('a' < 'b');
        System.out.println('a' <= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');


    }
}
