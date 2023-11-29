package bank;

public interface Transaction {
    void transfer(Account toAccount, double amount);
    void viewTransactions();
}
