package chapters.chapter_11.Exercises11.E08;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private ArrayList<Transaction> transactions;

    public Account1() {
       /* id = 0;
        balance = 0;
        annualInterestRate = 0;You may write these but these default value is already 0 */
        this(0, 0);
    }

    public Account1(int id, double balance) {
        this(null, id, balance);
        dateCreated = new Date();
    }

    public Account1(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
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
        Transaction t = new Transaction('W',withdrawAmount, balance, "");
        setBalance(getBalance() - withdrawAmount);
        transactions.add(t);
    }

    public void deposit(double depositAmount) {
        Transaction t = new Transaction('D', depositAmount, balance, "");
        setBalance(getBalance() + depositAmount);
        transactions.add(t);
    }

    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
            sb.append(transactions.get(i));
            }
        return "name: " + name + "\nbalance: " + getBalance() +
                "\nmonthly interest: " + getMonthlyInterest() +
                "\ndate created: " + getDateCreated() +
                "\ntransactions: \n" + sb;
    }
}
