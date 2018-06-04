package Week4.Ex5;

public class Date {
    private int month; // Between 1 - 12
    private int day; // Between 1 - 31
    private int year; // Any year

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        // Check for valid month value
        if(month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month (" + month + ") must be 1-12");
        }

        // Check for valid day value
        if(day <= 0  || day > daysPerMonth[month] && !(month == 2 && day == 29))
        {
            throw new IllegalArgumentException("Day (" + day + ") out-of-range for specified month and year");
        }

        // Check leap year
        if(month == 2 && day == 29 && !(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
            throw new IllegalArgumentException("day (" + day + ") out of range for specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for %s%n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
