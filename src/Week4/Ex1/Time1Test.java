package Week4.Ex1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1(); // Invokes the Time1 default constructor

        System.out.printf("Universal time: " + time.toUniversalString() + "%n");
        System.out.printf("Standard time: " + time.toString());
    }
}
