package chapters.chapter_12.Checkpoints12;

public class Checkpoint12_25_26 {

    // Checkpoint12_25
    /*
    By extending Exception class
     */


    //Checkpoint12_26
   /*
    Suppose the setRadius method throws the InValidRadiusException

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
            Circle c1 = new Circle(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }
        Output:
        Exception in method()
        Exception in main
    */

}