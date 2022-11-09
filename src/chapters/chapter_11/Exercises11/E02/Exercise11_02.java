package chapters.chapter_11.Exercises11.E02;

import chapters.chapter_10.Exercises10.E14.MyDate;

public class Exercise11_02 { public static void main(String[] args) {
    Person person = new Person("Serhat", "Bize her yer carsi", "111-111-1111",
            "serhat@gulbas.com");
    Student student = new Student("Tufece", "Bursali", "222-222-2222",
            "furkan@cetinkaya.com", Student.FRESHMAN);
    Employee employee = new Employee("Berka", "Izmirli", "333-333-3333",
            "berk@orman.com", "Rm 251", 50000.0, new MyDate());
    Faculty faculty = new Faculty("Haluk", "sakarya54", "444-444-4444",
            "haluk@dundar.com", "Rm 890", 60000.0, new MyDate(), "adamm", "kral");
    Staff staff = new Staff("Furkan", "Bagcilar", "555-555-5555",
            "furkan@sener.com", "iffice gunesli", 550000.0, new MyDate(), "E-ticaret");

    System.out.println(person);
    System.out.println(student);
    System.out.println(employee);
    System.out.println(faculty);
    System.out.println(staff);
}
}
