package chapters.chapter_11.Exercises11.E02;

import chapters.chapter_10.Exercises10.E14.MyDate;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office,
                 double salary, MyDate hiredDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Class = Staff\nName = " + getName() + "\n";
    }
}
