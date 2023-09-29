package Employee;
import java.util.LinkedList;

public class EmployeeRoster {
    private final LinkedList<Employee> employees;

    public EmployeeRoster() {
        employees = new LinkedList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void displayEmployeeTable() {
        LinkedList<Employee> employees = this.getEmployees();

        System.out.println("Employee Roster:");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-25s | %-28s | %-28s | %-20s | %-16s | %-26s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Type", "Salary", "Specific Info");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Employee employee : employees) {
            System.out.printf("| %-5d | %-25s | %-15s | %-15s | %-20s | $%-15.2f | %-26s |\n",
                    employee.getEmpID(),
                    employee.getEmpName(),
                    employee.getEmpDateHired(),
                    employee.getEmpBirthDate(),
                    employee.getType(),
                    employee.computeSalary(),
                    getSpecificInfo(employee));
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private String getSpecificInfo(Employee employee) {
        if (employee instanceof HourlyEmployee) {
            return "Hours Worked: " + ((HourlyEmployee) employee).getTotalHoursWorked();
        } else if (employee instanceof BasePlusCommissionEmployee) {
            return "Base Salary: $" + ((BasePlusCommissionEmployee) employee).getBaseSalary();
        } else if (employee instanceof PieceWorkerEmployee) {
            return "Total Pieces Finished: " + ((PieceWorkerEmployee) employee).getTotalPiecesFinished();
        } else if (employee instanceof CommissionEmployee) {
            return "Total Sales: $" + ((CommissionEmployee) employee).getTotalSales();
        } else {
            return "Unknown Type";
        }
    }
}
