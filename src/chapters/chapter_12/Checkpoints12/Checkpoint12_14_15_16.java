package chapters.chapter_12.Checkpoints12;

public class Checkpoint12_14_15_16 {

    // Checkpoint12_14
   /*
    public class Test {
        public static void main(String[] args) {
            try {
                int[] list = new int[10];
                System.out.println("list[10] is " + list[10]);
            } catch (ArithmeticException ex) {
                System.out.println("ArithmeticException");
            } catch (RuntimeException ex) {
                System.out.println("RuntimeException");
            } catch (Exception ex) {
                System.out.println("Exception");
            }
        }
    }
    Output:
        RuntimeException
    */



    // Checkpoint12_15
   /*
    public class Test {
        public static void main(String[] args) {
            try {
                method();
                System.out.println("After the method call");
            }
            catch (ArithmeticException ex) {
                System.out.println("ArithmeticException");
            }
            catch (RuntimeException ex) {
                System.out.println("RuntimeException");
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        static void method() throws Exception {
            System.out.println(1 / 0);
        }
    }
    Output:
        ArithmeticException
    */


    // Checkpoint12_16
    /*
    public class Test {
        public static void main(String[] args) {
            try {
                method();
                System.out.println("After the method call");
            }
            catch (RuntimeException ex) {
                System.out.println("RuntimeException in main");
            }
            catch (Exception ex) {
                System.out.println("Exception in main");
            }
        }
        static void method() throws Exception {
            try {
                String s = "abc";
                System.out.println(s.charAt(3));
            }
            catch (RuntimeException ex) {
                System.out.println("RuntimeException in method()");
            }
            catch (Exception ex) {
                System.out.println("Exception in method()");
            }
        }
    }
    Output:
            RuntimeException in method()
            After the method call
     */
}
