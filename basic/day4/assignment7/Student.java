package basic.day4.assignment7;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    final int semesterFees = 12000;
    protected int feesperMonth;

    public Student() {
    }

    public Student(int studentId, char studentType, String studentName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
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

    public void calculateFees(){
        feesperMonth = (int)(semesterFees/6.0);
    }

    public void displayDetails(){
        System.out.println("Student Id : " + studentId + "\n" +
                            "Student Name : " + studentName + "\n" +
                            "Student type : " + studentType + "\n" +
                            "Semester Fees : " + semesterFees + "\n" +
                            "Fees Per Month : " + feesperMonth);

    }
}
