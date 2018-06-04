package Week5.Ex5;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee(
                "Wallace", "Balaniuc", "500600400", 10000, 0.2, 50000);

        CommissionEmployee emp2 = new CommissionEmployee("Bob", "Barker", "123123123", 1000000, 0.5);

        System.out.printf("%n%s:%n%n%n%s%n",
                "Employee information",
                emp);

        System.out.println();
        System.out.println();

        System.out.printf("%n%s:%n%n%n%s%n",
                "Employee information",
                emp2);
    }
}