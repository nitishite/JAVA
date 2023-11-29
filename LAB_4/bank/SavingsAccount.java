package bank;

public class SavingsAccount implements Account, Transaction {
    private String accountNumber;
    private double balance;

    public SavingsAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void openAccount() {
        System.out.println("\nSavings account opened with account number: " + accountNumber);
    }

    @Override
    public void closeAccount() {
        System.out.println("\nSavings account closed for account number: " + accountNumber);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + " into account " + accountNumber + ". New balance: Rs." + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + " from account " + accountNumber + ". New balance: Rs." + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds in account " + accountNumber);
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance for account " + accountNumber + ": Rs." + balance);
    }

    @Override
    public void transfer(Account toAccount, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred Rs." + amount + " from account " + accountNumber + " to account " + ((SavingsAccount) toAccount).getAccountNumber());
        } else {
            System.out.println("Transfer failed. Insufficient funds in account " + accountNumber);
        }
    }

    @Override
    public void viewTransactions() {
        System.out.println("Transaction history for account " + accountNumber + ": Not available for savings account.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}