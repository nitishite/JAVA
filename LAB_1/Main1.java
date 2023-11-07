class Bank {
    // Data members
    private String bankName;
    private String branch;
    private int totalEmployees;

    // Default constructor
    public Bank() {
        bankName = "NULL";
        branch = "NULL";
        totalEmployees = 0;
    }

    // Constructor overloading
    public Bank(String bankName, String branch, int totalEmployees) {
        this.bankName = bankName;
        this.branch = branch;
        this.totalEmployees = totalEmployees;
    }

    // Method overloading
    public void openAccount() {
        System.out.println("Account opened successfully!");
    }

    public void openAccount(String accountType) {
        System.out.println(accountType + " account opened successfully!");
    }

    public void openAccount(String accountType, double initialDeposit) {
        System.out.println(accountType + " account opened successfully with an initial deposit of $" + initialDeposit);
    }

    // Accessor methods
    public String getBankName() {
        return bankName;
    }

    public String getBranch() {
        return branch;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    // Mutator methods
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Creating objects of the Bank class using different constructors
        Bank bank1 = new Bank();
        Bank bank2 = new Bank("Bank of Barodra", "Bangalore", 100);

        // Accessing and modifying data members using accessor and mutator methods
        bank1.setBankName("SBI");
        bank1.setBranch("Karnataka");
        bank1.setTotalEmployees(300);

        // Calling methods with different parameters
        bank1.openAccount(); // Account opened successfully!
        bank1.openAccount("Savings"); // Savings account opened successfully!
        bank1.openAccount("Checking", 1000); // Checking account opened successfully with an initial deposit of $1000

        // Getting values of data members using accessor methods
        System.out.println(bank2.getBankName()); // Bank of Barodra
        System.out.println(bank2.getBranch()); // Bangalore
        System.out.println(bank2.getTotalEmployees()); // 100
    }
}