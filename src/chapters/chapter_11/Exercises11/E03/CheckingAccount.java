package chapters.chapter_11.Exercises11.E03;

import chapters.chapter_09.Exercises09.E07.Account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int newId, double newBalance, double overdraftLimit) {
        super(newId, newBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0 - overdraftLimit) {
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Out of limits!");
        }
    }

    @Override
    public String toString() {
        return "ClassName = CheckingAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}
