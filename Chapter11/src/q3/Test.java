package q3;

import q7.Account;

public class Test {
    public static void main(String[] args) {
        Account sA = new SavingAccount(5,5000.45);
        System.out.println(sA.toString());
    }
}
