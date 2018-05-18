public class Account {
    private String name;
    private double balance;

    // Declare a constructor with 2 parameters(name and initial balance)
    public Account(String name, double balance) {
        this.name = name; // Set the name of our account

        // Check that initial balance is greater than $0.00
        if(balance > 0.0)
            this.balance = balance;
    }

    //  Method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if(depositAmount > 0.0) {
            balance = balance + depositAmount;
            // balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    // Allow user to set account name to something else
    public void setName(String name) {
        this.name = name;
    }

    // Allow user to get account name
    public String getName() {
        return name;
    }
}
