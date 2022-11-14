package chapters.chapter_12.Checkpoints12;

public class Checkpoint12_30_31_32_33_34 {

    // Checkpoint12_30
    /*
    -PrintWriter output = new PrintWriter(file name);
    -Because Scanner and PrintWriter class may cause IOException,
        that type of exception is checked exception.So we have to declare it
    -The file cannot be saved properly
     */



    // Checkpoint12_31
    /*
    public class Test {
        public static void main(String[] args) throws Exception {
            java.io.PrintWriter output = new
                    java.io.PrintWriter("temp.txt");
            output.printf("amount is %f %e\r\n", 32.32, 32.32);
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            output.printf("%6b\r\n", (1 > 2));
            output.printf("%6s\r\n", "Java");
            output.close();
        }
    }
    Output:
    amount is 32.320000 3.232000e+01
    amount is 32.3200 3.2320e+01
     false
      Java
    */



    // Checkpoint12_33
    /*
    public class Test {
        public static void main(String[] args) throws Exception {
            try (java.io.PrintWriter output = new
                    java.io.PrintWriter("temp.txt");) {
                output.printf("amount is %f %e\r\n", 32.32, 32.32);
                output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
                output.printf("%6b\r\n", (1 > 2));
                output.printf("%6s\r\n", "Java");
            }
        }
    }
     */


    // Checkpoint12_34
    /*
    If you attempt to create a for a nonexistent file an exception would occur.
    If you attempt to create a PrintWriter for an existent file, the contents of the file will be gone.
     */




    // Checkpoint12_33
    /*
    Scanner input = new Scanner(System.in);
    -Because Scanner and PrintWriter class may cause IOException,
        that type of exception is checked exception.So we have to declare it
    -Nothing will happen, but it is a good practice keep writing.
     */




}
