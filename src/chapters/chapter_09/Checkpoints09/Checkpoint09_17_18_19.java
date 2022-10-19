package chapters.chapter_09.Checkpoints09;

public class Checkpoint09_17_18_19 {
    public static void main(String[] args) {

        // Checkpoint09_17

        /* f is an instance of Class F
            System.out.println(f.i);  -------> can access
            System.out.println(f.s);  -------> can access
            f.imethod();  -------------------> can access
            f.smethod();  -------------------> can access
            System.out.println(F.i);  -------> cannot access
            System.out.println(F.s);  -------> can access
            F.imethod();  -------------------> cannot access
            F.smethod();  -------------------> can access
         */




        // Checkpoint09_18

        /*public class Test {
            int count;
            public static void main(String[] args) {
                ...
            }
            public static int getCount() {
                return count;
            }
            public static int factorial(int n) {
                int result = 1;
                for (int i = 1; i <= n; i++)
                    result *= i;
                return result;
           }
        }
        */







        // Checkpoint09_19

        /*
        * An instance method or variable cannot be accessed from a static method
        * An static method or variable can be access from an instance method

         public class C {

            * public static void main(String[] args) {
                method1();
            }

            * public void method1() {
                method2();
            }

            * public static void method2() {
                System.out.println("What is radius " + c.getRadius());
            }// Cannot access to getRadius method
            * because cannot access to an instance method from a static method

            * Circle c = new Circle();
            }
  */





    }

  /* public class F {
        int i;
        static String s;

        void imethod() {
        }

        static void smethod() {
        }
    }*/
    }