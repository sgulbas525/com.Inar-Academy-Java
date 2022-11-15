package chapters.chapter_11.Exercises11.E03;


public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
    overdraftLimit = 100;
    }

    public CheckingAccount(int newId, double newBalance, double overdraftLimit) {
        super(newId, newBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0 - overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
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
