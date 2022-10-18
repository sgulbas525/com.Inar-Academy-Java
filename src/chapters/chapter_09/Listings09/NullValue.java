package chapters.chapter_09.Listings09;

public class NullValue {
}

class Student {
    String name; // name has the default value null
    int age; // age has the default value 0
    boolean isScienceMajor; // isScienceMajor has default value false
    char gender; // gender has default value '\u0000'
}

class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age);
        System.out.println("isScienceMajor? " + student.isScienceMajor);
        System.out.println("gender? " + student.gender);



        /* int x; // x has no default value
         * String y; // y has no default value
         * System.out.println("x is " + x);
         * System.out.println("y is " + y); */
    }
}


