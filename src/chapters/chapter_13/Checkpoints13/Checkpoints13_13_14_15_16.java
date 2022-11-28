package chapters.chapter_13.Checkpoints13;

public class Checkpoints13_13_14_15_16 {
    public static void main(String[] args) {


        // Checkpoint13_13
        /*
        You can't create an instance from an interface
         */


        // Checkpoint13_14
        /*
        You can declare a reference variable from an interface
         */


        // Checkpoint13_15

        // A
        /*
        interface A {
            void print() { };
        }
        -----> False, method has a body
        */


        // B
        /*
        abstract interface A extends I1, I2 {
            abstract void print() { };
        }
        -----> False, method has a body and java doesn't provide multi-inheritance and interface can't take abstract keyword
         */


        // C
        /*
        abstract interface A {
            print();
        }
        -----> False, interface can't take abstract keywords.
        */


        // D
        /*
        interface A {
            void print();
        }
        -----> True
         */




        // Checkpoint13_16
        /*
        interface A {
            void m1();
        }
        class B implements A {
            void m1() {
                System.out.println("m1");
            }
        }
        All the methods in the interfaces are public when u implement you cannot reduce the visibility.
        */

    }
}
