package chapters.chapter_09.Checkpoints09;

public class Checkpoint09_11_12_13 {
    public static void main(String[] args) {

        // Checkpoint09_11

                // A
        /* public class ShowErrors {
              public static void main(String[] args) {
                ShowErrors t = new ShowErrors(5);
              }
            }
        ShowErrors class don't have a constructor with an argument
        */

                // B
        /* public class ShowErrors {
              public static void main(String[] args) {
                ShowErrors t = new ShowErrors();
                t.x();
           }
               }
          ShowErrors class don't have the x method
         */

                // C
        /* public class ShowErrors {
              public void method1() {
                Circle c;
                System.out.println("What is radius " + c.getRadius());
                c = new Circle();
          }
             }
          There will occur a NullPointerException,
          because we try to invoke a method by a variable that references null
         */

                // D
        /* public class ShowErrors {
            public static void main(String[] args) {
                C c = new C(5.0);
                System.out.println(c.value);
            }
        }
        class C {
            int value = 2;
        }
        Class C don't have a constructor with arguments,
        so we can't create an instance of that class by using a constructor with argument(s)
         */





        // Checkpoint09_12
        /* class Test {
              public static void main(String[] args) {
                A a = new A();
                a.print();
              }
           }

            class A {
               String s;

               A(String newS) {
                     s = newS;
               }

               public void print() {
                     System.out.print(s);
               }
            }
            As we see we define a constructor with an arguments, it means that java wouldn't define the default constructor.
            So there isn't any no-arg-constructor
            */







        // Checkpoint09_13
        /* public class A {
            boolean x;
            public static void main(String[] args) {
                A a = new A();
                System.out.println(a.x);
            }
        }
        The output is the default value of boolean -----> false
         */
    }
}
