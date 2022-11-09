package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_21 {
    public static void main(String[] args) {
        // A
        new Person().printPerson();
        new Student().printPerson();
        // B
        new Person1().printPerson();
        new Student1().printPerson();
    }
}

// A
class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
}

class Person {
    public String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}

// B
class Student1 extends Person1 {
    private String getInfo() {
        return "Student";
    }
}

class Person1 {
    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }

}
/*
  A
Person
Student

  B
Person
Person
 */
