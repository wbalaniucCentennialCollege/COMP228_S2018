package Week3.Ex6;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is: %d%n", square(7));
        System.out.printf("Square of double 8.3 is: %f%n", square(8.3));
    }

    public static int square(int value) {
        System.out.printf("Called square with INT argument: %d%n", value);
        return value * value;
    }

    public static double square(double value) {
        System.out.printf("Called square with DOUBLE argument: %f%n", value);
        return value * value;
    }
}
