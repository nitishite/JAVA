import bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        // Creating a savings account
        SavingsAccount account1 = new SavingsAccount("123456789");
        account1.openAccount();

        // Depositing and withdrawing
        account1.deposit(1000);
        account1.withdraw(500);

        // Displaying balance
        account1.displayBalance();

        // Creating another savings account
        SavingsAccount account2 = new SavingsAccount("987654321");
        account2.openAccount();

        // Transferring funds between accounts
        account1.transfer(account2, 200);

        // Displaying balances after transfer
        account1.displayBalance();
        account2.displayBalance();

        // Closing accounts
        account1.closeAccount();
        account2.closeAccount();
    }
}