public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful. New balance: Rs." + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void addInterest() {
        double interestAmount = balance * interestRate / 100;
        balance += interestAmount;
        System.out.println("Interest of Rs." + interestAmount + " added. New balance: Rs." + balance);
    }
}
