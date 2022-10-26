package chapters.chapter_09.Exercises09.E07;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int j) {
       /* id = 0;
        balance = 0;
        annualInterestRate = 0;You may write these but these default value is already 0 */
        dateCreated = new Date();
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        //annualInterestRate = 0;You may write these but double's default value is already 0
        dateCreated = new Date();
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public double getMonthlyInterestRate() {
        return (getAnnualInterestRate() / 100) / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }

    public void withdraw(double withdrawAmount) {
        setBalance(getBalance() - withdrawAmount);
    }

    public void deposit(double depositAmount) {
        setBalance(getBalance() + depositAmount);
    }
}
