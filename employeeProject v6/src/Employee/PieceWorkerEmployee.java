package Employee;

import java.util.Date;

public class PieceWorkerEmployee extends Employee {
    private final int totalPiecesFinished;
    private final double ratePerPiece;

    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, double ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {

        return totalPiecesFinished;
    }
    @Override
    public double computeSalary() {
        double salary = totalPiecesFinished * ratePerPiece;
        if (totalPiecesFinished >= 100) {
            salary = ((double) totalPiecesFinished / 100) * 10 * ratePerPiece;
        }
        return salary;
    }
    
    @Override
    public String getType() {
        return "PieceWorker";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
        System.out.println("Salary: " + computeSalary());
    }


}