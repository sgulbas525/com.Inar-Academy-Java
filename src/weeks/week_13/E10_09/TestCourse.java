package weeks.week_13.E10_09;

public class TestCourse { public static void main(String[] args) {
    Course c1 = new Course("DenemeKursu");
    c1.addStudent("Serhat");
    c1.addStudent("Ertugrul");
    c1.addStudent("Sinan");
    c1.displayStudents();

    System.out.println("-------------------------");
    c1.dropStudent("Serhat");
    c1.displayStudents();

    System.out.println("-------------------------");
    c1.clear();
    c1.displayStudents();
}
}
