package q3;

import q7.Account;

public class CheckingAccount extends Account {

    CheckingAccount(int newId, double newBalance) {
        super(newId, newBalance);

    }

    public String toString() {
        return "Checking Account: " + getDate() + " " + getBalance() + " " + getAnnualInterestRate() + " "
                + getId();
    }
}
