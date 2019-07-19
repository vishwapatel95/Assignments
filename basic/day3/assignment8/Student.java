package basic.day3.assignment8;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private String residentalStatus;
    private double fees;

    public Student() {
    }

    public Student(int studentId, char studentType, String fname, String lname) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = fname + lname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String fname, String lname) {
        this.studentName = fname + lname;
    }

    public void setResidentalStatus(String residentalStatus) {
        this.residentalStatus = residentalStatus;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getFees() {
        return String.valueOf(fees);
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getResidentalStatus() {
        return residentalStatus;
    }

    public void calculateFees(double semesterFees){
        fees = semesterFees/6.0;
        System.out.println(fees);
    }

    public void calculateFees(double semesterFees, double hostelFess){
        fees = semesterFees/6.0;
        fees = fees + hostelFess;
        System.out.println(fees);
    }
}
