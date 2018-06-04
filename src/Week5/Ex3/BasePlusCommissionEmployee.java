package Week5.Ex3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(
            String firstName, String lastName, String ssn, double grossSales,
            double commissionRate, double baseSalary) {

        // CALL MY SUPERCLASS CONSTRUCTOR
        super(firstName, lastName, ssn, grossSales, commissionRate);

        // Validate base salary
        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + (getCommissionRate() * getGrossSales());
    }
}
