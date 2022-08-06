package q3;

import q7.Account;

public class SavingAccount extends Account {

    SavingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public String toString() {
        return "Saving Account: " + getDate() + " " + getBalance() + " " + getAnnualInterestRate() + " "
                + getId();
    }
}
