package chapters.chapter_09.Exercises09.E07;

import chapters.chapter_09.Exercises09.E07.Account;

public class Exercise09_07 {
    public static void main(String[] args) {
        Account sg = new Account(1122, 20_000);
        sg.setAnnualInterestRate(4.5);
        sg.withdraw(2_500);
        sg.deposit(3_000);
        System.out.println("Account with the id " + sg.getId() + "'s");
               System.out.println("Balance is " + sg.getBalance());
               System.out.println("Monthly interest is " + sg.getMonthlyInterest());
               System.out.println("Created at " + sg.getDateCreated());
    }
}




