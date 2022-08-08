package q8;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
    private String name;
    private int id;
    private double balance;
    private ArrayList<Transaction> transactions;
    private Date date;
    private double interestRate;

    NewAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        date = new Date();
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdraw from account"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit to the account"));
    }

    public double getMonthlyInterestRate() {
        return interestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }


    @Override
    public String toString() {
        return "NewAccount{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", transactions=" + transactions +
                ", date=" + date +
                ", interestRate=" + interestRate +
                '}';
    }
}
