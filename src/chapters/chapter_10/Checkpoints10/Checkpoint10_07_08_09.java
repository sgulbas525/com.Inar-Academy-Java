package chapters.chapter_10.Checkpoints10;

public class Checkpoint10_07_08_09 {
    public static void main(String[] args) {

        //Checkpoint10_07

        /* Primitive types aren't any object, but in java may method's argument lists consist of object,
        so for using primitive types we must use these wrapper classes
         */











        //Checkpoint10_08

        /* a */
        Integer i = new Integer("23");
        /* b */
        Integer j = new Integer(23);
        /* c */
        Integer k = Integer.valueOf("23");
        /* d */
        Integer l = Integer.parseInt("23", 8);
        /* e  Double d = new Double(); -----> Cannot compiled */
        /* f */
        Double f = Double.valueOf("23.45");
        /* g */
        int m = (Integer.valueOf("23")).intValue();
        /* h */
        double g = (Double.valueOf("23.4")).doubleValue();
        /* i */
        int n = (Double.valueOf("23.4")).intValue();
        /* j */
        String s = (Double.valueOf("23.4")).toString();

        System.out.print("a -----> " + i);
        System.out.print("b -----> " + j);
        System.out.print("c -----> " + k);
        System.out.print("d -----> " + l);
        System.out.print("f -----> " + f);
        System.out.print("g -----> " + m);
        System.out.print("h -----> " + g);
        System.out.print("i -----> " + n);
        System.out.print("j -----> " + s);








        // Checkpoint10_09

        /* String s = 5 + ""; or Integer.toString();
        Integer i = Integer.parseInt(s); ot Double.valueOf(s);
        String s = 5.5 + ""; or Double.toString()
        Double d = Double.parseDouble(); or Double.valueOf(s);


         */
    }
}
