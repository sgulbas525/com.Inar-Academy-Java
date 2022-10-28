package chapters.chapter_10.Exercises10.E09;

public class Exercise10_09 {
    public static void main(String[] args) {
        Course c1 = new Course("Java");
        c1.addStudent("Serhat Gulbas");
        c1.addStudent("Furkan Sener");
        c1.addStudent("Etka Berk Orman");
        displayStudents(c1.getStudents(), c1.getNumberOfStudents());

        c1.dropStudent("Furkan Sener");
        displayStudents(c1.getStudents(), c1.getNumberOfStudents());
    }

    public static void displayStudents(String[] students, int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}
