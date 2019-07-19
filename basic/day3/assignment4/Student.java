package basic.day3.assignment4;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;

    public Student() {
        this.studentId = 10;
        this.studentType = 'F';
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

    public char getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student(int studentId, char studentType, String fname, String lname) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = fname + lname;
    }
}
