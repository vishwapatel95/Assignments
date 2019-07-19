package basic.day2.assignment9;

public class Student {
    private static int studentId = 550;
    private char studentType;
    private String studentName;

    public Student() {
        this.studentId++;
    }

    public Student(char studentType, String studentFirstName, String studentLastName) {
        this();
        this.studentType = studentType;
        this.studentName = studentFirstName + studentLastName;


    }

    public void displayDetails(Student student){
        System.out.println("Student Id : " + student.studentId + "\n" +
                        "Student type : " + student.studentType + "\n" +
                        "Student name : " + student.studentName);
    }
}
