package chapters.chapter_10.Listings10;

public class Listing10_06_Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Listing10_06_Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student){
        // Left as an exercise in Programming Exercise10.9
    }
}
