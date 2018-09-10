import java.util.Scanner;

public class Student extends Person {
    private double AverageGrade;
    private int StudentNr;

    // to calculate grade
    private double total = 0;
    private int counter = 0;

    public Student(String name, String cpr, int studentNr) {
        super(name, cpr);
        StudentNr = studentNr;
    }

    public int getStudentNr() {
        return StudentNr;
    }

    public void setStudentNr(int studentNr) {
        StudentNr = studentNr;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double gradeTotal) {
        this.total = gradeTotal;
    }

    public double getAverageGrade() {
        double AverageGrade = total / counter;
        return AverageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        total += averageGrade;
        counter++;
    }


    @Override
    public String toString() {
        return "Student = " + super.toString() +  ", " +  "Student nr: " + StudentNr + "\n";
    }
}