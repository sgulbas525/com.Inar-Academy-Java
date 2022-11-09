package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_17_18_19_20 {

    //Checkpoint11_17

    /*
    Polymorphism: A variable of supertype can refer to a  subtype object
    Dynamic Binding: Dynamic binding is a process that JVM decides to which method invoke through inheritance chain.
     Starts from actual type looks until declared type
     */



    // Checkpoint11_18

    /*
    Matching: Declared type decides while compiling to which method matches.
    Binding: Actual type decide while running to which method JVM dynamic binds.
     */


    // Checkpoint11_19

    /*
    Yes you can because all the class is a subtype of object class
     */



    // Checkpoint11_20

    /*
    public class Test {
        public static void main(String[] args) {
            Integer[] list1 = {12, 24, 55, 1};
            Double[] list2 = {12.4, 24.0, 55.2, 1.0};
            int[] list3 = {1, 2, 3};

            printArray(list1);
            printArray(list2);
            printArray(list3);
        }

        public static void printArray(Object[] list) {
            for (Object o: list)
                System.out.print(o + " ");
            System.out.println();
        }
    } list3 is a primitive type, must be a reference type...
     */


}
