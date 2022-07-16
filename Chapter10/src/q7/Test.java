package q7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Account[] acc = new Account[10];
        for (int i = 0; i < acc.length; i++) {
            Account account = new Account(i, 100);
            acc[i] = account;
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            boolean exit = false;
            while (!exit) {
                System.out.println("Main Menu");
                System.out.println("1: Check Balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                int option = scanner.nextInt();
                double amount = 0.0;
                switch (option) {
                    case 1:
                        System.out.println(acc[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw ");
                        amount = scanner.nextDouble();
                        acc[id].withdraw(amount);
                        System.out.println("Current Balance: " + acc[id].getBalance());
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit ");
                        amount = scanner.nextDouble();
                        acc[id].deposit(amount);
                        System.out.println("Current Balance: " + acc[id].getBalance());
                        break;
                    case 4:
                        exit = true;
                        break;
                }
            }
        }
    }
}
