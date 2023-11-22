public class BankingSystem {
    public static void main(String[] args) {
        // Testing SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("1001", "Nitish", 1000.0, 2.5);
        savingsAccount.displayInfo();
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.addInterest();

        System.out.println("\n-----------------\n");

        // Testing CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount("1002", "Soham", 2000.0, 1000.0);
        currentAccount.displayInfo();
        currentAccount.deposit(800.0);
        currentAccount.withdraw(1200.0);

    }
}
