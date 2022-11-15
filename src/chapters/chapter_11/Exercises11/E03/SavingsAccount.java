package chapters.chapter_11.Exercises11.E03;


public class SavingsAccount extends Account {
    public SavingsAccount() {
    }

    public SavingsAccount(int newId, double newBalance) {

        super(newId, newBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("You don't have $" + amount + " in your account");
        }
    }

    @Override
    public String toString() {
        return "ClassName = SavingsAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}