package Week4.Ex1.Ex4;


public class Time1Test {
    public static void main(String[] args) {
        Time1 t1 = new Time1();
        Time1 t2 = new Time1(2);
        Time1 t3 = new Time1(21, 34);
        Time1 t4 = new Time1(12, 45, 13);
        Time1 t5 = new Time1(t4);

        System.out.println("Constructed with");
        displayTime("t1: all default values", t1);
        displayTime("t2: with hour value", t2);
        displayTime("t3: with hour and minute", t3);
        displayTime("t4: with all parameters", t4);
        displayTime("t5: Time1 object of t4", t5);

        t1.setHour(10);

        displayTime("t1: AFTER setting hour value", t1);

        try {
            Time1 t6 = new Time1(27, 80, 99);
        }
        catch(IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    // Display the time in both 24-hour and 12-hour time formats
    private static void displayTime(String beginningString, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard Time: %s%n", beginningString, t.toUniversalString(), t.toString());
    }
}
