package Week10.Ex1;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

    public static Scanner scanner;

    public static int quotient() throws ArithmeticException {
        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        int result = numerator / denominator;

        System.out.printf("%nResult: %f / %f = %f%n", numerator, denominator, result);

        return result;
    }

    public static float quotient(float numerator, float denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        quotient();
    }
}
