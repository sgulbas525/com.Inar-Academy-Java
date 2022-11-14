package chapters.chapter_12.Checkpoints12;

public class Checkpoint12_08 {

    //A
     /*
    public class Test {
        public static void main(String[] args) {
            System.out.println(1 / 0);
        }
    }
    Throws an ArithmeticException exception
   */

    // B
    /*
     public class Test {
        public static void main(String[] args) {
            int[] list = new int[5];
            System.out.println(list[5]);
        }
    }
    Throws an ArrayIndexOutOfBoundsException exception
    */


    // C
    /*
    public class Test {
      public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.charAt(3));
      }
    }
    Throws an StringIndexOutOfBoundsException exception
     */


    // D
    /*
    public class Test {
      public static void main(String[] args) {
        Object o = new Object();
        String d = (String) o;
      }
    }
    Throws an ClassCastException exception
    */


    // E
    /*
    public class Test {
        public static void main(String[] args) {
            Object o = null;
            System.out.println(o.toString());
        }
    }
    Throws an NullPointerException exception
    */


    // F
    /*
    public class Test {
        public static void main(String[] args) {
            System.out.println(1.0 / 0);
        }
    }
    Won't throw an exception
     */
}
