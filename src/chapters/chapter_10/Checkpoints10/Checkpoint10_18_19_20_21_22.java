package chapters.chapter_10.Checkpoints10;

public class Checkpoint10_18_19_20_21_22 {
    public static void main(String[] args) {


        // Checkpoint10_18

        String s1 = "Welcome";
        System.out.println("s1 = " + s1);
        String s2 = "welcome";
        System.out.println("s2 = " + s2);

        s2 = s1.replaceAll("e", "E");
        System.out.println("s2 = " + s2);
        String[] arr = "Welcome to Java and HTML".split(" ");
        s1 = arr[0];
        System.out.println("s1 = " + s1);
        s2 = arr[1];
        System.out.println("s2 = " + s2);







        // Checkpoint10_19
        /* No, since the String class immutable that means any method cannot change instances of String contents */








        // Checkpoint10_20

        System.out.println(" length of new String() is " + new String().length());







        // Checkpoint10_21

        /* We will use the overloaded valueOf() method for these convert */









        // Checkpoint10_22

        /*
        public class Test {
            private String text;

            public Test(String s) {
                String text = s;// Because this constructor didn't assign the string s to the data field
                                   and when you invoke a method by using a null default value that
                                    will cause a NullPointerException
            }

            public static void main(String[] args) {
                Test test = new Test("ABC");
                System.out.println(test.text.toLowerCase());
            }
        }
         */
    }
}
