package chapters.chapter_11.Exercises11.E02;

import chapters.chapter_10.Exercises10.E14.MyDate;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,
                   MyDate hiredDate, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Class = Faculty\nName = " + getName() + "\n";
    }
}
