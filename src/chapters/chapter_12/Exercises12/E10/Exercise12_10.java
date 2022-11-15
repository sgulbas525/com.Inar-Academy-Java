package chapters.chapter_12.Exercises12.E10;

public class Exercise12_10 {
    public static void main(String[] args) {
        // This error is thrown when the Java Virtual Machine
        // cannot allocate an object because it is out of memory.
        try {
            Integer[] array = new Integer[100000 * 10000];
        } catch (OutOfMemoryError ex) {
            System.out.println("OutOFMemoryException occurs");
        }
    }
}
