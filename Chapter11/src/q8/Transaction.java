package q8;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        switch (type) {
            case 'W':
                balance = balance - amount;
            case 'w':
                balance = balance - amount;
            case 'D':
                balance = balance + amount;
            case 'd':
                balance = balance + amount;
        }

    }
}
