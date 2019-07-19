package basic.day3.assignment1;

public class Student {
    private int studentId;

    private static int studentCount = 10;
    private char studentType;
    private String studentName;

    public Student() {
        studentCount++;
    }

    public Student(char studentType, String fname, String lname) {
        this();
        this.studentType = studentType;
        this.studentName = fname + lname;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
