package chapters.chapter_11.Exercises11.E02;

import chapters.chapter_10.Exercises10.E14.MyDate;

public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate hiredDate;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate hiredDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    @Override
    public String toString(){
        return "Class = Employee\nName = " + getName() + "\n";
    }
}
