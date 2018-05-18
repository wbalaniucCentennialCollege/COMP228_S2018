package Week2.Ex3;

public class Account {
    private String name; // Name of the account;
    private double balance; // Balance

    // Constructor to initialize name
    public Account(String name, double balance) {
        this.name = name;

        if(balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if(depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    // Return account name
    public String getName() {
        return name;
    }

    // Set account name
    public void setName(String name) {
        this.name = name;
    }
}
