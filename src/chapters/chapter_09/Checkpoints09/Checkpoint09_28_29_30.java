package chapters.chapter_09.Checkpoints09;

public class Checkpoint09_28_29_30 {
    public static void main(String[] args) {

        // Checkpoint09_28

        /* If there is an accessor method that returns the private data fields reference,
         that class wouldn't be an immutable class  */


        // Checkpoint09_29

        /* If there is an accessor method that returns the private data fields reference,
         that class wouldn't be an immutable class  */


    }

    //Checkpoint09_30

    public class A {
        private int[] values;

        public int[] getValues() {
            return values;
        }
    }// It's not a immutable class,
    // because the getValues method returns the reference of the private data field
}
