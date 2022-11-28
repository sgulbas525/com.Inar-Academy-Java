package chapters.chapter_13.Checkpoints13;

public class Checkpoints13_17_18_19_20_21 {
    public static void main(String[] args) {

        // Checkpoint13_17
        /*
        True
         */


        // Checkpoint13_18
        /*
        public int compareTo(String o)
         */


        // Checkpoint13_19
        /*
        Integer n1 = new Integer(3);
        Object n2 = new Integer(4);
        System.out.println(n1.compareTo(n2));
        One of them is an Integer's object the other one is Object's object
        */





        // Checkpoint13_20
        /*
        By implementing the Comparable interface,
         the object of the class can be passed to a method that requires a Comparable type.
         */








        // Checkpoint13_21
    /*
        Person[] persons = {new Person(3), new Person(4), new Person(1)};
        java.util.Arrays.sort(persons);
    }
}

class Person {
    private int id;

    Person(int id) {
        this.id = id;
    }
}

Person class doesn't implement the comparable class!
     */
    }
}
