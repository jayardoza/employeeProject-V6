package Employee;

import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    @Override
    public String getType() {
        return "BasePlusCommission";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + computeSalary());
    }
}


