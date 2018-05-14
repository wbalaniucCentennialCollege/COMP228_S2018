public class Account {
    private String name;

    // Allow user to set account name to something else
    public void setName(String name) {
        this.name = name;
    }

    // Allow user to get account name
    public String getName() {
        return name;
    }
}
