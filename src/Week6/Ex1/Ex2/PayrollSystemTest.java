package Week6.Ex1.Ex2;

public class PayrollSystemTest {
    public static void main(String[] args) {
        // Create an object for each type of employee
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 1000);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Tina", "Jones", "222-22-2222",
                70, 55);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Wallace", "Balaniuc", "333-33-3333",
                50000, 0.25);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Bobary",
                "444-44-4444", 25000, 0.1, 10000);

        System.out.println("Employees processed individually");

        System.out.printf("%n%s%n%s: $%.2f%n%n", salariedEmployee, "Earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", hourlyEmployee, "Earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", commissionEmployee, "Earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", basePlusCommissionEmployee, "Earned", basePlusCommissionEmployee.earnings());

        // WHERE ALL THE POLYMORPHISM IS GOING TO START...
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically");
        for(Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.println();
        }
    }
}
