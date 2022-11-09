package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_22_23 {
    public static void main(String[] args) {
        // Checkpoint11_22
        A a = new A(3);
        // Checkpoint11_23
        new C();
        new D();

    }
}


// Checkpoint11_22

class A extends B {
    public A(int t) {
        System.out.println("A's constructor is invoked");
    }
}

class B {
    public B() {
        System.out.println("B's constructor is invoked");
    }
}

// Checkpoint11_23
class C {
    int i = 7;

    public C() {
        setI(20);
        System.out.println("i from C is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class D extends C {
    public D() {
        System.out.println("i from D is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}

/*
    Checkpoint11_22
B's constructor is invoked
A's constructor is invoked
NO
    Checkpoint11_23
i from C is 40
i from C is 60
i from D is 60

 */

