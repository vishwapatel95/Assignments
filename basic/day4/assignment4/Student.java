package basic.day4.assignment4;

public class Student {

    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    protected int feesPerMonth;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, char studentType, String studentName, int semesterFees) {
        this(studentId);
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
        this.semesterFees = semesterFees;
    }

    void displayDetails(){
        System.out.println("Student Id : " +studentId + "\n" +
                            "Student Name : " + studentName + "\n" +
                            "Student type : " + studentType + "\n" +
                            "Student semesterFees : " + semesterFees + "\n" +
                            "Student monthly fees : " + feesPerMonth);
    }
}
