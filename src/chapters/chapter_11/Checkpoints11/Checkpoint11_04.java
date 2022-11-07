package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_04 {
    // A

    public static void main(String[] args) {
        B b = new B();
    }
    static class A {
        public A() {
            System.out.println("A's no-arg constructor is invoked");
        }
    }
     static class B extends A {
    }
}

/* B
    class A {
        public A(int x) {
        }
    }

    class B extends A {
        public B() {
        }
    }

    public class C {
        public static void main(String[] args) {
            B b = new B();
    }
}
 A hasn't any default constructor,
  so it would occur a compiler error.
 */