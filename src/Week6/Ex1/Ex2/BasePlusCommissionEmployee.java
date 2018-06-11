package Week6.Ex1.Ex2;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(
            String firstName, String lastName, String ssn, double grossSales,
            double commissionRate, double baseSalary) {

        // CALL MY SUPERCLASS CONSTRUCTOR
        super(firstName, lastName, ssn, grossSales, commissionRate);

        // Validate base salary
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f",
                "Base-salaried employee", super.toString(),
                "base salary", getBaseSalary());
    }
}