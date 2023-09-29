import Employee.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestMain {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Name empName1 = new Name("Monkey D.", "Luffy");
        Name empName2 = new Name("Roronoa", "Zoro");
        Name empName3 = new Name("Nami", "Navigator");
        Name empName4 = new Name("Nico", "Robin");
        Name empName5 = new Name("Sanji", "Cook");
        Name empName6 = new Name("Tony", "Chopper");

        Employee employee1 = new HourlyEmployee(1, empName1, dateFormat.parse("2023-01-15"), dateFormat.parse("1990-05-20"), 45, 60);
        Employee employee2 = new HourlyEmployee(2, empName2, dateFormat.parse("2023-02-10"), dateFormat.parse("1985-08-15"), 43, 65);
        Employee employee3 = new BasePlusCommissionEmployee(3, empName3, dateFormat.parse("2023-01-15"), dateFormat.parse("1991-06-21"), 55000, 5000);
        Employee employee4 = new BasePlusCommissionEmployee(4, empName4, dateFormat.parse("2023-02-10"), dateFormat.parse("1986-09-16"), 45000, 3000);
        Employee employee5 = new PieceWorkerEmployee(5, empName5, dateFormat.parse("2023-03-05"), dateFormat.parse("1992-11-10"), 150, 60.50);
        Employee employee6 = new PieceWorkerEmployee(6, empName6, dateFormat.parse("2023-04-20"), dateFormat.parse("1993-07-15"), 200, 50.00);

        EmployeeRoster roster = new EmployeeRoster();

        roster.addEmployee(employee1);
        roster.addEmployee(employee2);
        roster.addEmployee(employee3);
        roster.addEmployee(employee4);
        roster.addEmployee(employee5);
        roster.addEmployee(employee6);

        roster.displayEmployeeTable();
    }
}
