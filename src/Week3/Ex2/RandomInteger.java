package Week3.Ex2;

import java.security.SecureRandom;

public class RandomInteger {
    public static void main(String[] args) {
        // Create random number object
        SecureRandom randomNumbers = new SecureRandom();

        // 3 for loop parameters are:
        // 1. Local variable counter
        // 2. Check to exit for loop
        // 3. Increment to counter

        // Generate values for a standard D6 dice
        for(int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            if(counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}
