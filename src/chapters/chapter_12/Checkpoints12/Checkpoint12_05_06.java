package chapters.chapter_12.Checkpoints12;

public class Checkpoint12_05_06 {

    // Checkpoint12_05
    /*
    public class Test {
        public static void main(String[] args) {
            try {
                int value = 30;
                if (value < 40)
                    throw new Exception("value is too small");
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Continue after the catch block");
        }
    }
    First output:
        value is too small
        Continue after the catch block

    For value 50, output is:
        Continue after the catch block
    */





    // Checkpoint12_06

    // A
   /* public class Test {
        public static void main(String[] args) {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                try {
                    System.out.println(1 / 0);
                }
                catch (Exception ex) {
                }
            }
        }
    Output:
        0 1
        */


    // B
   /* public class Test {
        public static void main(String[] args) {
            try {
                for (int i = 0; i < 2; i++) {
                    System.out.print(i + " ");
                    System.out.println(1 / 0);
                }
            }
            catch (Exception ex) {
            }
    Output:
          0


            */
    }



