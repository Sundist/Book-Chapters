public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20.000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2.500);
        account.deposit(3.000);
        System.out.println("Balance: " + account.getBalance() +
                " monthly interest " + account.getAnnualInterestRate() +
                " date created " + account.getDate());
    }
}
