package Employee;

import java.util.Date;

public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {
        if (totalSales < 50000) {
            return totalSales * 0.05;
        } else if (totalSales >= 50000 && totalSales < 100000) {
            return totalSales * 0.20;
        } else if (totalSales >= 100000 && totalSales < 500000) {
            return totalSales * 0.30;
        } else {
            return totalSales * 0.50;
        }
    }

    @Override
    public String getType() {
        return "Commission";
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Salary: $" + computeSalary());
    }
}