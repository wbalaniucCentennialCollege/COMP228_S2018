package Week6.Ex1.Ex2;

public class CommissionEmployee extends Employee {
    // Variables

    private double grossSales;
    private double commissionRate;

    // Constructor
    public CommissionEmployee(String fName, String lName, String ssn, double grossSales, double commissionRate) {
        // explicit call to the Employee super class constructor
        super(fName, lName, ssn);

        // Check if gross sales is 0.0 or higher
        if(grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        // Check commission rate falls between 0% and 100%
        if(commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%.2f; %s: %.2f",
                "Commission Employee", super.toString(),
                "Gross sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }
}














