package basic.day3.assignment4;

public class CourseManagement {
    public static void main(String[] args) {

        Student student;
         student  = new Student();

        student.setStudentName("Vishwa","Patel");

        System.out.println("Student Name : " + student.getStudentName() + "\n" +
                            "Student Id : " + student.getStudentId() + "\n" +
                            "Student Type : " + student.getStudentType());


        System.out.println();
        Student student1 = new Student(4,'F',"Ti","Pa");
        System.out.println("Student Name : " + student1.getStudentName() + "\n" +
                "Student Id : " + student1.getStudentId() + "\n" +
                "Student Type : " + student1.getStudentType());

    }
}
