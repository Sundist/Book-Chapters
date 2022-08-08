package q8;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
    private String name;
    private int id;
    private double balance;
    private ArrayList<Transaction> transactions;
    private Date date;

    NewAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        date = new Date();
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

    @Override
    public String toString() {
        return "NewAccount{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", transactions=" + transactions +
                ", date=" + date +
                '}';
    }
}
