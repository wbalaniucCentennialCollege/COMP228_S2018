package Week4.Ex1.Ex1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1(); // Invokes the Time1 default constructor

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        // Exception handling
        try {
            time.setTime(99, 99, 99);
        }
        catch(IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After calling setTime with invalid values", time);

    }

    // Display the time in both 24-hour and 12-hour time formats
    private static void displayTime(String beginningString, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard Time: %s%n", beginningString, t.toUniversalString(), t.toString());
    }
}
