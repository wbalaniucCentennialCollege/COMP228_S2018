package Week4.Ex1.Ex5;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String fName, String lName, Date bDate, Date hDate) {
        firstName = fName;
        lastName = lName;
        birthDate = bDate;
        hireDate = hDate;
    }

    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
