package Week5.Ex2;


public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Wallace", "Balaniuc", "123123123", 10000, 0.12, 20000);

            System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f%nBase Salary: %f%n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSocialSecurityNumber(),
                employee.getGrossSales(),
                employee.getCommissionRate(),
                employee.getBaseSalary());

        employee.setGrossSales(20000);
        employee.setCommissionRate(0.1);

        System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f%nBase Salary: %f%n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSocialSecurityNumber(),
                employee.getGrossSales(),
                employee.getCommissionRate(),
                employee.getBaseSalary());

        System.out.printf("%n%nEmployee: %s", employee);
    }
}
