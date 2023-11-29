package bank;

public interface Account {
    void openAccount();
    void closeAccount();
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}