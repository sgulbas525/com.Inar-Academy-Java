package chapters.chapter_09.Checkpoints09;

public class Checkpoint09_32_33_34 {
    public static void main(String[] args) {

        //Checkpoint09_32

        /* keyword this has 2 roles. First role is to refer the objects itself and
         the second role is to invoke a constructor from another constructor
         */





        // Checkpoint09_33
        /*
        public class C {
            private int p;
            public C() {
                System.out.println("C's no-arg constructor invoked");
                this(0);// the this keyword that we use to invoke constructor must be the first statement of the constructor
            }
            public C(int p) {
                p = p;// To assign the local variable to the data field, we must use this keyword to reveal the hidden data field
            }
            public void setP(int p) {
                p = p;// To assign the local variable to the data field, we must use this keyword to reveal the hidden data field
            }
        }
           */





        // Checkpoint09_34
        /*
       public class Test {
            private int id;
            public void m1() {
                this.id = 45;
            }
            public void m2() {
                Test.id = 45;// A data field which one is defined private cannot be reached by class name
            }
        }
            */


    }
}
