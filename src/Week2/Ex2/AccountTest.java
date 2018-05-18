package Week2.Ex2;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account("Wallace Balaniuc");
        Account acc2 = new Account("John Doe");

        System.out.printf("account1 name is: %s%n", acc1.getName());
        System.out.printf("account1 name is: %s%n", acc2.getName());
    }
}
