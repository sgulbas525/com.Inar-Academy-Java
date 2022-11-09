package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_39_40 {

    // Checkpoint11_39

    //A
    /*
    package p1;

    public class A {
        ? int i;
        ? void m() {
            ...
        }
    }

    //B
    package p1;

    public class B extends A {
        public void m1(String[] args) {
            System.out.println(i);
            m();
        }
    }

    ? ---> (blanks) = B can be compiled
    ? ---> (private) = B cannot be compiled
    ? ---> (protected) = B can be compiled
   */


    // Cechkpoint11_40

    //A
    /*
    package p1;

    public class A {
        ? int i;
        ? void m() {
            ...
        }
    }

    //B
    package p2;

    public class B extends A {
        public void m1(String[] args) {
            System.out.println(i);
            m();
        }
    }

    ? ---> (blanks) = B cannot be compiled
    ? ---> (private) = B cannot be compiled
    ? ---> (protected) = B can be compiled
     */

}
