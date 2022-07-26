package q7;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    Account() {
        this(0, 0);
    }

    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDate() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

}

