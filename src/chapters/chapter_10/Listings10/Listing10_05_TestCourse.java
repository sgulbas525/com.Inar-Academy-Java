package chapters.chapter_10.Listings10;

public class Listing10_05_TestCourse {
    public static void main(String[] args) {
        Listing10_06_Course course1 = new Listing10_06_Course("Data Structure");
        Listing10_06_Course course2 = new Listing10_06_Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
