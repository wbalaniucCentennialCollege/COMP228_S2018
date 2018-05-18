package Week2.Ex2;

public class Account {
    private String name; // Name of the account;

    // Constructor to initialize name
    public Account(String name) {
        this.name = name;
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
