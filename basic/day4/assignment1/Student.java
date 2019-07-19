package basic.day4.assignment1;

public class Student {
    private int studentId;
    private char studetnType;
    private String studentName;
    private double feesPerMonth;

    public Student() {
    }

    public Student(int studentId, char studetnType, String fname, String lname) {
        this.studentId = studentId;
        this.studetnType = studetnType;
        this.studentName = fname + lname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudetnType(char studetnType) {
        this.studetnType = studetnType;
    }

    public void setStudentName(String fname, String lname) {
        this.studentName = fname + lname;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudetnType() {
        return studetnType;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }
}
