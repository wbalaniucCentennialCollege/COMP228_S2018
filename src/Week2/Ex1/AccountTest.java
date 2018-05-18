package Week2.Ex1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Scanner object to obtain input.
        Scanner input = new Scanner(System.in);

        // Create account object and assign default values
        Account myAccount = new Account();

        // Display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // Prompt use for info
        System.out.println("Please enter your name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}
