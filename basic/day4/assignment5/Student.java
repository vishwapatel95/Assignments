package basic.day4.assignment5;

public class Student {
    protected static int studentId;
    protected char studentType;
    protected String studentName;

    public  Student() {
        studentId++;
    }

    public Student(int studentId, char studentType, String studentName) {
        this();
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
    }


}
