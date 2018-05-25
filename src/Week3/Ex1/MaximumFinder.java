package Week3.Ex1;

import java.util.Scanner;

// Demonstrate static function calls
public class MaximumFinder {
    public static void main(String[] args) {

        // Create new instance of Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter in values
        System.out.print("Enter three floating-point values separated by spaces: ");

        // Read values from user
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is: " + result);
    }

    // Finds the maximum value between 3 double numbers
    public static double maximum(double x, double y, double z) {
        return Math.max(x, Math.max(y,z));
        /*
        double maximumValue = x;

        if(y > maximumValue) {
            maximumValue = y;
        }

        if(z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
        */
    }
}
